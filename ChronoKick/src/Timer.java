public class Timer {
    private float startTimer;
    private float endTimer;

    /**
     *
     * @return
     */
    public float getStartTimer() {
        return startTimer;
    }

    /**
     *
     * @param startTimer
     */
    public void setStartTimer(float startTimer) {
        this.startTimer = startTimer;
    }

    /**
     *
     * @return
     */
    public float getEndTimer() {
        return endTimer;
    }

    /**
     *
     * @param endTimer
     */
    public void setEndTimer(float endTimer) {
        this.endTimer = endTimer;
    }

    /**
     *
     * @param startTimer
     * @param endTimer
     */
    public Timer(float startTimer, float endTimer) {
        this.startTimer = startTimer;
        this.endTimer = endTimer;

    }
}
