import java.util.ArrayList;
import java.util.List;

public class BreakInStream {

	public static void main(String[] args) {
		List<Integer> list=new ArrayList<>();
		list.add(1);
		list.add(2);
		list.stream().forEach(a->{
			if(a==1)
			{System.out.println(a);
				return;
			}
		});
	}
}
