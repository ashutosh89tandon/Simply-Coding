import java.util.HashSet;

public class HashSetTest
{
	String name;
	public static void main(String[] args) 
	{
		HashSet<HashSetTest> set=new HashSet<HashSetTest>();
		HashSetTest obj=new HashSetTest("ashu");
		set.add(obj);
		obj.setName("ritu");
		System.out.println(set.add(obj));
		
		System.out.println(set);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		HashSetTest other = (HashSetTest) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	public HashSetTest(String name) {
		super();
		this.name = name;
	}
	@Override
	public String toString() {
		return "HashSetTest [name=" + name + "]";
	}
	
}
