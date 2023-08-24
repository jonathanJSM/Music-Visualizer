import javax.swing.*;

public class GUI {
    private JFrame frame;

    public GUI() {
        frame = new JFrame("Music Visualizer");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Implement GUI components here
        
        frame.pack();
        frame.setLocationRelativeTo(null);
    }

    public void show() {
        SwingUtilities.invokeLater(() -> {
            frame.setVisible(true);
        });
    }
}
