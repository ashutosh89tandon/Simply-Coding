
public class SubStringTest {
	public static void main(String[] args) {
		String str="aa";
		if(str.startsWith("a"))
			str=str.substring(1, str.length());
		if(str.endsWith("a"))
			str=str.substring(0,str.length()-1);
		
		System.out.println("String is "+str);
	}
}
