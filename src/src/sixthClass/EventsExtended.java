package sixthClass;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class EventsExtended implements ActionListener {

    JCheckBox cb1, cb2, cb3;

    EventsExtended () {
    // TODO something
        Frame f = new Frame("AWT ActionListener Example");

        f.setVisible(true);
        f.setSize(400, 300);
        f.setResizable(true);
        f.setLocationRelativeTo(null);
        f.setLayout(null);
        Label l = new Label("Food Menu");
        l.setBounds(150, 50, 300, 20);

        cb1 = new JCheckBox("Pizza @ 1200");
        cb1.setBounds(100, 100, 200, 20);
        cb2 = new JCheckBox("Aaloo Paratha @ 2000");
        cb2.setBounds(100, 150, 200, 20);
        cb3 = new JCheckBox("Tea @ 200");
        cb3.setBounds(100, 200, 200, 20);

        Button b = new Button("Order");
        b.setBounds(100, 250, 80, 30);

        b.addActionListener(this);

        f.add(l);
        f.add(cb1);
        f.add(cb2);
        f.add(cb3);
        f.add(b);

        f.addWindowListener(
                new WindowAdapter() {
                    @Override
                    public void windowClosing(WindowEvent e) {
                        System.out.println("hellooo window is closing taddaa");
                        System.exit(0);
                    }
                }
        );

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        float amount = 0;
        String msg = "";

        if (cb1.isSelected()) {
            amount += 1200;
            msg += "Pizza: 1200\n";
        }
        if (cb2.isSelected()) {
            amount += 2000;
            msg += "Aaloo Paratha: 2000\n";
        }
        if (cb3.isSelected()) {
            amount += 200;
            msg += "Tea: 200\n";
        }

        msg += "---------------------\n";
        JOptionPane.showMessageDialog(null, msg + "Total: " + amount);
    }


    public static void main(String[] args) {
        // Guys Today we are going to do about events too but extended version of it 😁😂


        EventQueue.invokeLater(() -> {
             new EventsExtended();
        });
    }


}
