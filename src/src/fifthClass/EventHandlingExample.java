package fifthClass;

import javax.swing.*;
import java.awt.*;
import java.util.Random;


public class EventHandlingExample {
    private GraphicsConfiguration graphicsConfiguration;
    int x;
    int y;
    int z;
    JPanel panel = new JPanel();

    private void createFrame() {
        JFrame frame = new JFrame(graphicsConfiguration);
        frame.setVisible(true);
        frame.setSize(600, 600);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setResizable(true);
        frame.setLocationRelativeTo(null);


        panel.setBackground(Color.ORANGE);
        JButton button = new JButton("Click me");

        panel.add(button);
        frame.getContentPane().add(panel);


        button.addActionListener(actionEvent -> calculateAndSetBackgroundColor());


//        button.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                System.out.println("Hello heheehehehehe ");
//            }
//        });

    }

    private void calculateAndSetBackgroundColor() {


        Random random = new Random();
        x = random.nextInt(220);
        y = random.nextInt(220);
        z = random.nextInt(220);

        panel.setBackground(new Color(x, y, z));


    }




    public static void main(String[] args) {
        EventHandlingExample ex = new EventHandlingExample();
        EventQueue.invokeLater(ex::createFrame);
    }
}
