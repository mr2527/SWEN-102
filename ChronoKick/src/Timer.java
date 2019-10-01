public class Timer {
    private float startTimer;
    private float endTimer;

    public float getStartTimer() {
        return startTimer;
    }

    public void setStartTimer(float startTimer) {
        this.startTimer = startTimer;
    }

    public float getEndTimer() {
        return endTimer;
    }

    public void setEndTimer(float endTimer) {
        this.endTimer = endTimer;
    }

    public Timer(float startTimer, float endTimer) {
        this.startTimer = startTimer;
        this.endTimer = endTimer;

    }
}
