package firstclass;

import javax.swing.*;
import java.awt.*;

public class FlowLayoutEx {

    public void createFrame() {
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        panel.setBackground(Color.BLUE);

        frame.setSize(500, 400);
        frame.setLocationRelativeTo(null);
        frame.add(panel);
        panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }


    public static void main(String[] args) {
        FlowLayoutEx frame = new FlowLayoutEx();
        EventQueue.invokeLater(() -> {
            frame.createFrame();
        });
    }
}
