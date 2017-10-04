
import java.util.Date;
  
public class TimeTest {
    public static void main(String[] args) throws Exception {
        Date date = new Date();
        long time = date.getTime();
		System.out.println("time : " + new Date(time).toString());
        System.out.println("time : " + time);
    }
}