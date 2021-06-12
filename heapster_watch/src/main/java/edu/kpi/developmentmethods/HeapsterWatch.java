package edu.kpi.developmentmethods;

public interface HeapsterWatch {
    /**
     * Display time from the watch in 24 hours format
     * @return time in format "02:08" (24 hours)
     */
    public String display24h();

    /**
     * Display time from the watch in 12 hours format
     * @return time in format "11:23 AM" (12 hours)
     */
    public String display12h();

    /**
     * Increase hours on the watch by 1
     */
    public void increaseHours();

    /**
     * Decrease hours on the watch by 1
     */
    public void decreaseHours();

    /**
     * Increase minutes on the watch by 1
     */
    public void increaseMinutes();

    /**
     * Decrease minutes on the watch by 1
     */
    public void decreaseMinutes();
}
