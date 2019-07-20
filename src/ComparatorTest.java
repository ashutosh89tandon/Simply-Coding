import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ComparatorTest {
	public static void main(String[] args) {
		List<Long> list=new ArrayList<>();
		list.add(4L);
		List<Long> source=Arrays.asList(2L,5L,1L);
		Comparator< Long> comp=(l1,l2)->{return l1.compareTo(l2);};
		source.stream().sorted(comp).forEach(l->{
			list.add(l);
		});
		
		System.out.println(list);
	}
}
