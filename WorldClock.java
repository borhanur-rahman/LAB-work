public class WorldClock extends Clock{
int timezone=0;

    public WorldClock(int timezone) {
        this.timezone = timezone;
    }
    public String getHours(){
       int hour=(Integer.parseInt(super.getHours())+timezone);
        if(hour>24)
            hour=hour-24;
        return String.valueOf( hour);
    }
}
