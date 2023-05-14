import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.TimeZone;

public class JavaPractice12 {
    public static void main(String[] args) {
        SimpleDateFormat df = new SimpleDateFormat("yyyy/MM//dd HH:mm::ss.SSS");
        df.setCalendar(Calendar.getInstance(TimeZone.getTimeZone("GMT")));
        System.out.println("\nNow : "+df.format(System.currentTimeMillis()));
    }
}
