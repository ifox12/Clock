import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ClockTest {

    @Test
    void currentSeconds_RunIt_ReturnsAnSecondsForAtMost24Hours() {
        Clock testClock = new Clock();

        long result = testClock.currentSeconds();

        assertTrue(result >= 0);
        assertTrue(result < 60 * 60 * 24);
    }

    @Test
    void currentSeconds_RunItTwice_DiffShouldReflectTheSleepTimeOf1Sec() throws InterruptedException {
        Clock testClock = new Clock();

        long first = testClock.currentSeconds();

        Thread.sleep(1000);

        long second = testClock.currentSeconds();

        assertEquals(1, second - first);
    }

    @Test
    void populateTimeUnits_RunIt_SetsHoursSecondsMinutesCorrespondingToInternalSecs() {
        Clock testClock = new Clock();
        testClock.setInternalSeconds(3666);

        testClock.populateTimeUnits();

        assertEquals(1, testClock.hours);
        assertEquals(1, testClock.minutes);
        assertEquals(6, testClock.seconds);



    }
}
