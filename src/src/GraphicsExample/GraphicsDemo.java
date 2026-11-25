package GraphicsExample;

import javax.swing.*;
import java.awt.*;

public class GraphicsDemo extends JFrame {

    public GraphicsDemo(){
        setTitle("Graphics Demo");
        setSize(800,600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        MyPanel panel = new MyPanel();
        add(panel);
        setVisible(true);

    }
    public static void main (String [] args){
        SwingUtilities.invokeLater(() -> {
            GraphicsDemo demo = new GraphicsDemo();
            demo.setVisible(true);

        });
    }
    static class MyPanel extends JPanel{

        protected void paintComponent(Graphics g){
            super.paintComponent(g);
            Graphics2D g2d = (Graphics2D) g;

            g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);



            //Draw a rectangle
            g2d.setColor(Color.RED);
            g2d.fillRect(50,50,100,80);
//            g2d.setColor(Color.BLACK);
//            g2d.drawRect(50,50,100,80);

            //Draw an oval
            g2d.setColor(Color.BLUE);
            g2d.fillOval(200,200,100,80);
            g2d.setColor(Color.BLACK);
            g2d.drawOval(200,200,100,80);

            //Draw an arc
            g2d.setColor(Color.orange);
            g2d.fillArc(300,300,200,200,0,18);

            //Draw a string
            g2d.setColor(Color.MAGENTA);
            g2d.setFont(new Font("Arial",Font.BOLD,20));
            g2d.drawString("Hello Graphics",100,40);


//            Draw a polygon
            int[] xPoints = {400, 450, 500, 475, 425};
            int[] yPoints = {400, 425, 400, 475, 475};
            g2d.setColor(Color.BLACK);
            g2d.fillPolygon(xPoints, yPoints, xPoints.length);
            g2d.drawPolygon(xPoints, yPoints, xPoints.length);
        }

        public static void main(String[] args) {
            SwingUtilities.invokeLater(() ->{
                GraphicsDemo demo = new GraphicsDemo();

            });
        }
    }

}
