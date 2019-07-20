import java.math.BigDecimal;

public class DoubleTest {
	public static void main(String[] args) {
		String str=".000382848573097200947097609702";
		double val=new BigDecimal(str).doubleValue();
		System.out.println(val);
		System.out.println(new BigDecimal(str).toString());
		System.out.println(new BigDecimal(str).scale());
	}
}
