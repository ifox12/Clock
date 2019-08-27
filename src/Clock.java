class Clock {

    private final long SECONDS_PER_DAY = 60 * 60 * 24;

    long currentSeconds() {
        return System.currentTimeMillis() / 1000 % SECONDS_PER_DAY;
    }
}
