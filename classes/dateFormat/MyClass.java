package dateFormat;

public class MyClass {
    private int hour;
    private int minute;
    private int second;

    public void SetTime(int hh, int mm, int ss) {
        hour = ((hh >= 0 && hh < 24) ? hh : 0);
        minute = ((mm >= 0 && mm < 60) ? mm : 0);
        second = ((ss >= 0 && ss < 60) ? ss : 0);
    }

    public String fullTime() {
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }
}
