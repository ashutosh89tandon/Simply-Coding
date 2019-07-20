import java.util.ArrayList;
import java.util.List;

class Person
{
	String name;

	public Person(String name) {
		super();
		this.name = name;
	}
	
}
public class ListInsertionTest {

	public static void main(String[] args) {
		Person p=new Person("Ashu");
		List<Person> list=new ArrayList<>();
		list.add(p);
		p.name="Gudia";
		
		System.out.println(list.get(0).name);
	}
}
