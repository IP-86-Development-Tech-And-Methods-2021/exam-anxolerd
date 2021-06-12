package edu.kpi.developmentmethods;


public class HeapsterWatchImpl implements HeapsterWatch{
    private int hours;
    private int minutes;
    /**
     * Creates a new HeapsterWatch instance at "00:00"
     */
    public HeapsterWatchImpl() {
        this(0, 0);
    }

    /**
     * Creates a new HeapsterWatch instance at given time
     * @param hours hours in 24-hours format. Should be an integer from range [0 .. 23]
     * @param minutes minutes. Should be an integer from range [0 .. 59]
     * @throws IllegalArgumentException if hours or minutes are out of allowed range
     */
    public HeapsterWatchImpl(int hours, int minutes) throws IllegalArgumentException {
        if (hours < 0 || hours > 23 || minutes < 0 || minutes > 59) {
            throw new IllegalArgumentException();
        }
        this.hours = hours;
        this.minutes = minutes;
    }

    @Override
    public String display24h() {
        return String.format("%02d:%02d", this.hours, this.minutes);
    }

    @Override
    public String display12h() {
        int hours = this.hours;
        String am_pm = "AM";

        hours = hours - 12;
        if (hours < 0) {
            hours += 12;
        } else {
            am_pm = "PM";
        }

        if (hours == 0) {
            hours = 12;
        }


        return String.format("%02d:%02d %s", hours, this.minutes, am_pm);
    }

    @Override
    public void increaseHours() {
        this.hours++;
        if (this.hours == 24) {
            this.hours = 0;
        }
    }

    @Override
    public void decreaseHours() {
        // TODO: write your code here
    }

    @Override
    public void increaseMinutes() {
        // TODO: write your code here
    }

    @Override
    public void decreaseMinutes() {
        // TODO: write your code here
    }
}
