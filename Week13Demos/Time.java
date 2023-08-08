public class Time implements Comparable<Time>{

    private int hour;
    private int minute;
    private int second;
    private long elapsedSeconds;

    // A no-arg constructor for the current time
    public Time() {
        long currentTimeMillis = System.currentTimeMillis();
        this.elapsedSeconds = currentTimeMillis / 1000;
        this.hour = getHour();
        this.minute = getMinute();
        this.second = getSecond();
    }

    // Constructor with specified hour, minute, and second
    public Time(int hour, int minute, int second) {
        // Using the 'L' suffix ensures that the result of the multiplication is promoted to long, preventing any potential overflow
        this.elapsedSeconds = ((hour * 3600L) + (minute * 60L) + second);
        this.hour = getHour();
        this.minute = getMinute();
        this.second = getSecond();
    }

    // Constructor with specified elapsedSeconds since Jan 1, 1970
    public Time(long elapsedSeconds) {
        this.elapsedSeconds = elapsedSeconds;
        this.hour = getHour();
        this.minute = getMinute();
        this.second = getSecond();
    }

    public int getHour() {
    	int hour = (int) (elapsedSeconds / 3600L) % 24;
        return hour;
    }

    public int getMinute() {
    	int minute = (int) (elapsedSeconds / 60L) % 60;
        return minute;
    }

    public int getSecond() {
    	int second = (int) (elapsedSeconds % 60);
        return second;
    }

    public long getElapsedSeconds() {
        return elapsedSeconds;
    }

    // Override toString() method
    @Override
    public String toString() {
        return String.format("%dh %dm %ds", hour, minute, second);
    }

    // Implement compareTo() method return the difference 
    // Override compareTo() method
    @Override
    public int compareTo(Time other) {
    	int difference = (int)(this.elapsedSeconds - other.elapsedSeconds);
    	return difference;
    }
}
