import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexExamples {
	
	public static void main(String[] args) {
		
		//test1();
		test3();
	}

	public static void test2() {
		// String to be scanned to find the pattern.
	      String line = "This order was placed for QT3000! OK?";
	      String pattern = "^This";

	      // Create a Pattern object
	      Pattern r = Pattern.compile(pattern);
	      Matcher m = r.matcher(line);

	      // Now create matcher object.
	      while(m.find())
	      {
	    	  System.out.println("Start "+m.start());
	    	  System.out.println("end "+m.end());
	      }
	}
	
	public static void test3() {
		// String to be scanned to find the pattern.
	      String line = "This order was placed for QT3000! OK";
	      String pattern = "OK$";

	      // Create a Pattern object
	      Pattern r = Pattern.compile(pattern);

	      // Now create matcher object.
	      Matcher m = r.matcher(line);
	      while(m.find())
	      {
	    	  System.out.println("Start "+m.start());
	    	  System.out.println("end "+m.end());
	      }
	}

	public static void test1() 
	{
		// String to be scanned to find the pattern.
		String line = "This order was placed for QT3000! OK?";
		String pattern = "(.*)(\\d+)(.*)";

		// Create a Pattern object
		Pattern r = Pattern.compile(pattern);

		// Now create matcher object.
		Matcher m = r.matcher(line);
		if (m.find( )) {
			System.out.println("Found value: " + m.group(0) );
			System.out.println("Found value: " + m.group(1) );
			System.out.println("Found value: " + m.group(2) );
		}else {
			System.out.println("NO MATCH");
		}
	}

}
