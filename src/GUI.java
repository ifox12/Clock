import javax.swing.*;

public class GUI implements UI {
    static final private int WINDOW_HEIGHT = 200;
    static final private int WINDOW_WIDTH = 200;
    private JFrame window;
    private JLabel clockLabel;

    @Override
    public void prepare(String title) {
        window = new JFrame(title);
        window.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        clockLabel = new JLabel();
        window.add(clockLabel);
        window.setVisible(true);
    }

    @Override
    public void update(String time) {
        clockLabel.setText(time);
        window.repaint();
    }

    @Override
    public void shutdown() {

    }
}
