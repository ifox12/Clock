class Clock {

    private final int MILLIS_PER_SECOND = 1000;
    private final int SECONDS_PER_MINUTE = 60;
    private final int MINUTES_PER_HOUR = 60;
    private final int HOURS_PER_DAY = 24;
    private final int SECONDS_PER_HOUR = SECONDS_PER_MINUTE * MINUTES_PER_HOUR;
    private final int SECONDS_PER_DAY = SECONDS_PER_HOUR * HOURS_PER_DAY;

    int hours;
    int minutes;
    int seconds;
    private long internalSeconds;

    Clock(long seconds) {
        setInternalSeconds(seconds);
    }

    Clock() {
        setInternalSeconds(0);
    }

    void extractCurrentDaysSeconds(long millisSinceEpoch) {
        setInternalSeconds(millisSinceEpoch / MILLIS_PER_SECOND % SECONDS_PER_DAY);
    }

    private void setInternalSeconds(long internalSeconds) {
        this.internalSeconds = internalSeconds;
    }

    public long getInternalSeconds() {
        return internalSeconds;
    }

    void populateTimeUnits() {
        this.hours = (int) (internalSeconds / SECONDS_PER_HOUR);
        this.minutes = (int) (internalSeconds / SECONDS_PER_MINUTE % MINUTES_PER_HOUR);
        this.seconds = (int) (internalSeconds % SECONDS_PER_MINUTE);
    }
}
