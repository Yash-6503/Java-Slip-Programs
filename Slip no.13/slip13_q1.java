import java.text.SimpleDateFormat;
import java.util.Date;

public class slip13_q1
{
    public static void main(String[] args)
    {
        SimpleDateFormat sd=new SimpleDateFormat("dd/MM/yyyy");
        String d1=sd.format(new Date());
        System.out.println("Date: "+d1);

        sd=new SimpleDateFormat ("MM/dd/yyyy");
        d1=sd.format(new Date());
        System.out.println("Date: "+d1);

        sd=new SimpleDateFormat ("EEEEEEEEE MMMMM dd yyyy");
        d1=sd.format(new Date());
        System.out.println("Date: "+d1);

        sd=new SimpleDateFormat ("EEE MMMMM dd HH:mm:ss z yyyy");
        d1=sd.format(new Date());
        System.out.println("Date: "+d1);

        sd=new SimpleDateFormat ("dd/MM/yyyy HH:mm:ss z yyyy");
        d1=sd.format(new Date());
        System.out.println("Date: "+d1);

        sd=new SimpleDateFormat ("HH:mm:ss");
        d1=sd.format(new Date());
        System.out.println("Time: "+d1);

        sd=new SimpleDateFormat ("w");
        d1=sd.format(new Date());
        System.out.println("Current week: "+d1);

        sd=new SimpleDateFormat ("W");
        d1=sd.format(new Date());
        System.out.println("Week of month: "+d1);

        sd=new SimpleDateFormat ("D");
        d1=sd.format(new Date());
        System.out.println("Day of the year: "+d1);


    }
}