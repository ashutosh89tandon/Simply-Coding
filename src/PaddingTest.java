
public class PaddingTest {
	public static void main(String[] args) {
		System.out.println( String.format("%1$" + 5 + "s", "123").replace(' ', '0'));
	}
}
