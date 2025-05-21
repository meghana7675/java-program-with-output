//4c. Develop a Swing program in Java to display a message “Digital Clock is pressed” or “Hour Glass is pressed” depending upon the Jbutton with image either Digital
//Clock or Hour Glass is pressed by implementing the event handling mechanism with addActionListener( ).
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ClockSelector extends JFrame implements ActionListener {
    private JButton digitalClockButton;
    private JButton hourGlassButton;
    private JLabel messageLabel;

    public ClockSelector() {
        setTitle("Clock Selector");
        setSize(400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        // Load icons - you can replace these with actual image file paths
        ImageIcon digitalClockIcon = new ImageIcon("digital_clock.png"); // Replace with your image path
        ImageIcon hourGlassIcon = new ImageIcon("hour_glass.png");       // Replace with your image path

        digitalClockButton = new JButton("Digital Clock", digitalClockIcon);
        hourGlassButton = new JButton("Hour Glass", hourGlassIcon);

        digitalClockButton.addActionListener(this);
        hourGlassButton.addActionListener(this);

        messageLabel = new JLabel("Press a button");

        add(digitalClockButton);
        add(hourGlassButton);
        add(messageLabel);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == digitalClockButton) {
            messageLabel.setText("Digital Clock is pressed");
        } else if (e.getSource() == hourGlassButton) {
            messageLabel.setText("Hour Glass is pressed");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new ClockSelector().setVisible(true);
        });
    }
}
