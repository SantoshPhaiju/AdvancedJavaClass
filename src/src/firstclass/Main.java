package firstclass;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        // Java SWING

        // swing components are the important building blocks of the user interface built using swing. they represent the visual elements that user interacts with. Some common swing components are:

        /*
            1. JFrame
            2. JPanel
            3. JLabel
            4. JButton
            5. JTextField
            6. JTextArea
            7. JCheckBox
         */

        // Swing containers:
        // are the components that hold other components.

        /**
         *
         * JFrame: the main window that holds all the elements
         * JPanel: a generic container that can hold a group of components
         * JScrollPane: a container that provides a scrollable view of another component
         *
         */

        /**
         *
         * Swing Layouts: defines how components are arranged within a container. swing provides several layout managers, including
         * FlowLayout: arranges components in a horizontal line, left-to-right flow
         * BorderLayout: arranges components in a grid, with a top, left, bottom, and right border, divides the layout into five regions: North, South, East, West
         * GridLayout: arranges components in a grid of cells
         * GridBagLayout:
         */

        // Lab 1: Make Calculator: working calculator

        JFrame frame = new JFrame("My Application");
        JPanel mainPanel = new JPanel();
        frame.add(mainPanel);

        frame.setSize(500, 400);
        frame.setLocationRelativeTo(null);
        JButton button = new JButton("Click Me");
        mainPanel.add(button);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
