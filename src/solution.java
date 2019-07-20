import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class solution {

	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int t=Integer.parseInt(br.readLine());
		for(int i=1;i<=t;i++)
		{
			System.out.println(getResult(new BigInteger(br.readLine())));
		}
		
	}

	private static String getResult(BigInteger d)
	{
		int numberOf1s=0;
		int numberOf0s=0;
		String binary=d.toString(2);
		List<String> subStrings=FindAllSubStrings(binary);
		
		for(String subString : subStrings)
		{	
			int zeroCount=0;
			int oneCount=0;
			
			for(int i=0;i<subString.length();i++)
			{
				if(subString.charAt(i)=='0')
					zeroCount++;
				else
					oneCount++;
			}
			
			if(zeroCount %2 !=0)
				numberOf0s++;
			if(oneCount%2 !=0)
				numberOf1s++;
		}
		
		return numberOf0s+" "+numberOf1s;
	}

	private static List<String> FindAllSubStrings(String binary) {
		List<String> subStrings=new ArrayList<>();
		for(int i=0;i<binary.length();i++)
		{
			for(int j=i; j<binary.length();j++)
			{
				subStrings.add(binary.substring(i, j+1));
			}
		}
		return subStrings;
		
	}
}
