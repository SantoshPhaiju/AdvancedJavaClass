package secondclass;

import javax.swing.*;
import java.awt.*;

public class BorderLayoutExample extends JFrame {

    private GraphicsConfiguration graphicsConfiguration;

    private void createFrame() {
        JFrame frame = new JFrame(graphicsConfiguration);
        frame.setTitle("Border Layout Test");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.setResizable(true);
        frame.setLocationByPlatform(true);
        frame.setBackground(Color.PINK);
        frame.setVisible(true);

        // left aligned panel
        JPanel firstPanel = new JPanel();
        firstPanel.setBackground(Color.GREEN);

        JButton button = new JButton("hello");
        firstPanel.add(button);

        JPanel secondPanel = new JPanel();
        secondPanel.setBackground(Color.CYAN);
        JButton button2 = new JButton("hello");
        secondPanel.add(button2);

        JPanel thirdPanel = new JPanel();
        thirdPanel.setBackground(Color.BLUE);
        JButton button3 = new JButton("hello");
        thirdPanel.add(button3);

        JPanel fourthPanel = new JPanel();
        fourthPanel.setBackground(Color.RED);
        JButton button4 = new JButton("hello");
        fourthPanel.add(button4);

        JPanel fifthPanel = new JPanel();
        fifthPanel.setBackground(Color.YELLOW);
        JButton button5 = new JButton("hello");
        fifthPanel.add(button5);

        frame.getContentPane().add(firstPanel, BorderLayout.NORTH);
        frame.getContentPane().add(secondPanel, BorderLayout.EAST);
        frame.getContentPane().add(thirdPanel, BorderLayout.WEST);
        frame.getContentPane().add(fourthPanel, BorderLayout.CENTER);
        frame.getContentPane().add(fifthPanel, BorderLayout.SOUTH);
    }


    public static void main(String[] args) {
        BorderLayoutExample borderLayoutExample = new BorderLayoutExample();

        EventQueue.invokeLater(borderLayoutExample::createFrame);

    }
}
