import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Clock clock = new Clock();
        Scanner in= new Scanner(System.in);
        System.out.println("My time:"+clock.getTime());
        System.out.println("How many hours ahead your time");
        int timezone=in.nextInt();
        WorldClock worldClock = new WorldClock(timezone);
        System.out.println("your time: "+worldClock.getTime());
    }
}
