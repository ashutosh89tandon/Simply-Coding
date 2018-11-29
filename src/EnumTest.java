import java.util.EnumSet;

public class EnumTest 
{
	public static void main(String[] args) {
		for(Season season : Season.values())
		{
			System.out.println(season.toString()+" "+season.value);
			season.action();
		}
		
		EnumSet<Season> set=EnumSet.of(Season.AUTUMN);
		System.out.println(set);
		
	}
}
