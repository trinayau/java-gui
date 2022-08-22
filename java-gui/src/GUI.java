import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI implements ActionListener {

    int count = 0;
    JLabel label;
    JFrame frame;
    JPanel panel;

    public GUI(){

        frame = new JFrame();

        JButton button = new JButton("Click me");
        JButton resetButton = new JButton("Reset");
        button.addActionListener(this);
        resetButton.addActionListener(this);
         label = new JLabel("Number of clicks: 0");


        JPanel panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
        panel.setLayout(new GridLayout(0, 1));
        panel.add(button);
        panel.add(label);

        frame.add(panel, BorderLayout.CENTER); // Add panel to frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Set what happens when they close the frame
        frame.setTitle("My first GUI"); // Set title of the window
        frame.pack(); //Set window to match a certain size
        frame.setVisible(true); //Set window to be visible and in focus

    };
    public static void main(String[] args) {
        new GUI();
        //yes

    }

    @Override
    public void actionPerformed(ActionEvent e) {
//        Once button clicked, increment count
        count++;
        label.setText("Number of clicks: " + count);

    }
}
