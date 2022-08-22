import javax.swing.*;
import java.awt.*;

public class GUI {
    public GUI(){

        JFrame frame = new JFrame();

        JButton button = new JButton("Click me");


        JPanel panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
        panel.setLayout(new GridLayout(0, 1));
        panel.add(button);

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
}
