package thridclass;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class GridlayoutExample {

    private GraphicsConfiguration graphicsConfiguration;

    private void createFrame() {
        JFrame frame = new JFrame(graphicsConfiguration);
        frame.setTitle("Grid Layout Test");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setResizable(true);
        frame.setLocationByPlatform(true);
        frame.setBackground(Color.WHITE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

        JPanel panel1 = new JPanel(
                new GridLayout(7, 7, 0, 0)
        );

        panel1.setBackground(Color.WHITE);
//        panel1.setBorder(new EmptyBorder(20, 20, 20, 20));

        for (int i = 1; i <= 49; i++) {
            JButton button = new JButton();
            if (i % 2 != 0) {
                button.setBackground(Color.BLACK);
                button.setForeground(Color.BLACK);
                button.setOpaque(true);
                button.setBorderPainted(false);
//                button.setBounds(0, 0, 20, 60);
                panel1.add(button);
            }
//            button.setBackground(Color.WHITE);
//            button.setForeground(Color.WHITE);
//            button.setOpaque(true);
//            button.setBorderPainted(false);
            panel1.add(button);
        }

//        JButton button1 = new JButton("Hello jii...");
//        JButton button2 = new JButton("Hello jii...");
//        JButton button3 = new JButton("Hello jii...");
//        JButton button4 = new JButton("Hello jii...");
//        JButton button5 = new JButton("Hello jiii...");
//        JButton button6 = new JButton("Hello jii...");
//        JButton button7 = new JButton("Hello jii...");
//        JButton button8 = new JButton("Hello jii...");
//        JButton button9 = new JButton("Hello jii...");
//        button1.setBackground(Color.BLACK);
//        button1.setForeground(Color.BLACK);
//        button1.setOpaque(true);
//        button1.setBorderPainted(false);
//        panel1.add(button1);
//        panel1.add(button2);
//        panel1.add(button3);
//        panel1.add(button4);
//        panel1.add(button5);
//        panel1.add(button6);
//        panel1.add(button7);
//        panel1.add(button8);
//        panel1.add(button9);

        frame.getContentPane().add(panel1);
    }


    public static void main(String[] args) {
        System.out.println("Grid Layout Example");

        GridlayoutExample gridlayoutExample = new GridlayoutExample();

        EventQueue.invokeLater(gridlayoutExample::createFrame);
    }
}
