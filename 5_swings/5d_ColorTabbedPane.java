//5d. Develop a Swing program in Java to create a Tabbed Pan of Cyan, Magenta and Yellow and display the concerned color whenever the specific tab is selected in the Pan
import javax.swing.*;
import java.awt.*;

public class CMYTabbedPane {

    private static void createAndShowGUI() {
        // ---- Frame ----
        JFrame frame = new JFrame("CMY Tabbed Pane");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(450, 300);

        // ---- TabbedPane ----
        JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP, JTabbedPane.WRAP_TAB_LAYOUT);

        // Each tab gets a JPanel whose background is set to the desired color
        tabbedPane.addTab("Cyan", makeColorPanel(Color.CYAN));
        tabbedPane.addTab("Magenta", makeColorPanel(Color.MAGENTA));
        tabbedPane.addTab("Yellow", makeColorPanel(Color.YELLOW));

        frame.add(tabbedPane);
        frame.setLocationRelativeTo(null);  // center on screen
        frame.setVisible(true);
    }

    // Utility: creates a panel filled with the given color
    private static JPanel makeColorPanel(Color color) {
        JPanel panel = new JPanel();
        panel.setBackground(color);
        return panel;
    }

    public static void main(String[] args) {
        // Always start Swing on the Event‑Dispatching Thread
        SwingUtilities.invokeLater(CMYTabbedPane::createAndShowGUI);
    }
}
