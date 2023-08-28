public class Time {
    private int second;
    private int minute;
    private int hour;
    public void time(int hour, int minute, int second){
        setHour(hour);
        setMinute(minute);
        setSecond(second);
    }
    void setHour(int hour){
        if(hour>=0 && hour<24)
            this.hour=hour;
    }
    public void setSecond(int second) {
        if (second >= 0 && second < 60)
            this.second = second;
    }
    public void setMinute(int minute) {
        if (minute >= 0 && minute < 60)
            this.minute = minute;
    }
    public String toUniversalString(){
        return String.format("%02d:%02d:%02d",hour, minute, second);
    }
    public String toString(){
        return String.format("%d:%02d:%02d %s",((hour == 0)|| hour==12)?12:hour %12, minute,second, (hour<12?"AM":"PM"));
    }

}
