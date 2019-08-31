import javax.swing.*;

public class UI {
    static final private int WINDOW_HEIGHT = 200;
    static final private int WINDOW_WIDTH = 200;



    public static void main(String[] args) throws InterruptedException {
        Clock myClock = new Clock();


        JFrame window = new JFrame("Clock");

        window.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        JLabel label = new JLabel();
        window.add(label);

        window.setVisible(true);

        while (true) {
            myClock.extractCurrentDaysSeconds(System.currentTimeMillis());
            myClock.populateTimeUnits();
            label.setText(myClock.hours + ":" + myClock.minutes + ":" + myClock.seconds);
            Thread.sleep(500);
        }
    }
}
