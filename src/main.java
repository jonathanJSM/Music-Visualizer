import javax.swing.SwingUtilities;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            GUI gui = new GUI();
            gui.show();
            
            AudioProcessor audioProcessor = new AudioProcessor("path_to_audio_file.mp3");
            Visualizer visualizer = new Visualizer();
            audioProcessor.addAudioEventListener(visualizer);
            audioProcessor.processAudio();
        });
    }
}
