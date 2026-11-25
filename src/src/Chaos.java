import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class Chaos extends JPanel {
    double bx = 300, by = 200, hue = 0;
    int mx = 0, my = 0, score = 0, fear = 2000;
    java.util.List<double[]> sparks = new ArrayList<>(); // x, y, vx, vy, life

    Chaos() {
        setPreferredSize(new Dimension(700, 450));
        addMouseMotionListener(new MouseMotionAdapter() {
            public void mouseMoved(MouseEvent e) { mx = e.getX(); my = e.getY(); }
        });
        addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                if (Math.hypot(e.getX() - bx, e.getY() - by) < 30) { // caught it!
                    score++;
                    fear += 15;
                    for (int i = 0; i < 80; i++) {
                        double a = Math.random() * 6.28, s = 1 + Math.random() * 7;
                        sparks.add(new double[]{bx, by, Math.cos(a) * s, Math.sin(a) * s, 1});
                    }
                    bx = Math.random() * 600 + 50;
                    by = Math.random() * 350 + 50;
                }
            }
        });
        new javax.swing.Timer(16, e -> tick()).start();
    }

    void tick() {
        hue = (hue + 0.003) % 1;
        double d = Math.hypot(mx - bx, my - by);
        if (d < fear && d > 0) { // run away from the mouse
            bx -= (mx - bx) / d * 9;
            by -= (my - by) / d * 9;
            bx = Math.max(30, Math.min(getWidth() - 30, bx));
            by = Math.max(30, Math.min(getHeight() - 30, by));
        }
        sparks.removeIf(s -> s[4] <= 0);
        for (double[] s : sparks) { s[0] += s[2]; s[1] += s[3]; s[3] += 0.15; s[4] -= 0.02; }
        repaint();
    }

    protected void paintComponent(Graphics g0) {
        Graphics2D g = (Graphics2D) g0;
        g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g.setColor(Color.getHSBColor((float) hue, 0.6f, 0.25f));
        g.fillRect(0, 0, getWidth(), getHeight());
        for (double[] s : sparks) {
            g.setColor(Color.getHSBColor((float) ((hue + s[4] * 0.5) % 1), 1f, 1f));
            g.fillOval((int) s[0], (int) s[1], 6, 6);
        }
        g.setColor(Color.getHSBColor((float) ((hue + 0.5) % 1), 0.9f, 1f));
        g.fillOval((int) bx - 30, (int) by - 30, 60, 60);
        g.setColor(Color.WHITE);
        g.setFont(new Font("SansSerif", Font.BOLD, 14));
        g.drawString("CLICK", (int) bx - 20, (int) by + 5);
        g.drawString("Caught: " + score + "   (it gets more scared every time)", 15, 25);
    }

    public static void main(String[] a) {
        SwingUtilities.invokeLater(() -> {
            JFrame f = new JFrame("Catch The Coward");
            f.add(new Chaos());
            f.pack();
            f.setLocationRelativeTo(null);
            f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            f.setVisible(true);
        });
    }
}
