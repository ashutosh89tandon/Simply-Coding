import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MinutesDifference {
	public static void main(String[] args) throws ParseException {
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date dt1=simpleDateFormat.parse("2019-06-25 01:01:01");
		Date dt2=simpleDateFormat.parse("2019-06-25 01:04:01");
		long diff = dt2.getTime() - dt1.getTime();
        long diffMinutes = diff / (60 * 1000) % 60;
        System.out.println("Mins diff : "+diffMinutes);
	}
}
