import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ClockTest {

    @Test
    void extractCurrentDaysSeconds_EpochPlusOneSecond_ReturnsOne() {
        Clock testClock = new Clock();

        testClock.extractCurrentDaysSeconds(1000L);

        assertEquals(1L, testClock.getInternalSeconds());
    }

    @Test
    void extractCurrentDaysSeconds_2019Plus1d2h3m4s_Returns7384() {
        Clock testClock = new Clock();

        testClock.extractCurrentDaysSeconds(1546394584000L);

        assertEquals(7384L, testClock.getInternalSeconds());
    }

    @Test
    void extractCurrentDaysSeconds_EpochPlusChangeMillis_ReturnsZero() {
        Clock testClock = new Clock();

        testClock.extractCurrentDaysSeconds(111L);

        assertEquals(0, testClock.getInternalSeconds());
    }

    @Test
    void extractCurrentDaysSeconds_EpochPlus1s999Millis_ReturnsOne() {
        Clock testClock = new Clock();

        testClock.extractCurrentDaysSeconds(1999);

        assertEquals(1, testClock.getInternalSeconds());
    }

    @Test
    void populateTimeUnits_RunIt_SetsHoursSecondsMinutesCorrespondingToInternalSecs() {
        Clock testClock = new Clock(3666);

        testClock.populateTimeUnits();

        assertEquals(1, testClock.hours);
        assertEquals(1, testClock.minutes);
        assertEquals(6, testClock.seconds);
    }

    @Test
    void Foo_Bar_Bof() {
        Clock testClock = new Clock();

        testClock.extractCurrentDaysSeconds(System.currentTimeMillis());

        testClock.populateTimeUnits();

        System.out.println(testClock.hours + ":" + testClock.minutes + ":" + testClock.seconds);
    }
}
