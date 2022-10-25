import java.sql.Time;
import java.util.Date;

public class Clock {
    Date time = new Date();

  public String getHours() {
      String hours= java.time.LocalTime.now().toString().substring(0,2);
     return hours    ;
    }
    public String getMinute() {

        String minutes=java.time.LocalTime.now().toString().substring(3,5);
        return minutes;
    }
    public String getTime() {
        String time=getHours()+":"+getMinute();
        return time ;
    }
}
