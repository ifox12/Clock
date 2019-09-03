public class Main {

    public static void main(String[] args) throws InterruptedException {
        Clock myClock = new Clock();
        UI myUI = new GUI();

        myUI.prepare("Clock");

        long oldUnixTimeinSeconds = 0;
        long newUnixTimeinSeconds = 0;

        while (true) {
            newUnixTimeinSeconds = System.currentTimeMillis() / 1000;
            if (newUnixTimeinSeconds != oldUnixTimeinSeconds) {
                myClock.extractCurrentDaysSeconds(newUnixTimeinSeconds * 1000);
                myUI.update(myClock.stringifyTime());
                oldUnixTimeinSeconds = newUnixTimeinSeconds;
            }


        }
    }
}
