import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class HashMapTest 
{
	public static void main(String[] args) {
		
		Map<String,String> map=new HashMap<String,String>();
		map.put("1", "1");
		
		Iterator<String> iter=map.keySet().iterator();
		while(iter.hasNext())
		{
			String key=iter.next();
			System.out.println(map.get(key));
			map.put(key+1, "1");
		}
		
		map=new ConcurrentHashMap<String,String>();
		map.put("1", "1");
		map.put("2", "1");
		
		iter=map.keySet().iterator();
		while(iter.hasNext())
		{
			String key=iter.next();
			map.remove(key);
			System.out.println(map.get(key));
			
			
		}
	}
}
