import java.util.function.Function;
import java.util.function.Predicate;

public class Functiontest 
{
	public static void main(String[] args) {
	
		Function<Integer,Integer> square=(number)->{
			return number*number;
		};
		
		Function<String,Integer> convert=(str)->{
			return Integer.valueOf(str);
		};
		
		Function<Integer,String> twice=(value)->{
			return String.valueOf(value*2);
		};
		
		Predicate<String> check=(action)->{
			return action.equals("yes");
		};
		
		
		System.out.println(square.compose(convert).apply("2"));
		System.out.println(square.andThen(twice).apply(4));
		System.out.println(check.test("YES"));
	}
	
}
