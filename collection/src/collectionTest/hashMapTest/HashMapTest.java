package collectionTest.hashMapTest;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class HashMapTest {
	public static void main(String[] args) {
		HashMap<String, Object> userMap = new HashMap<String, Object>();
		userMap.put("id", "ksh1234");
		userMap.put("password", "1234");
		userMap.put("name", "김세환");
		userMap.put("age", 20);
		userMap.put("isRich", true);
		
//		System.out.println(userMap);
//		System.out.println(userMap.get("age"));
//		System.out.println(userMap.entrySet());
		
		Iterator<Entry<String, Object>> userMapIter = userMap.entrySet().iterator();
		while(userMapIter.hasNext()) {
			Entry<String, Object> entry = userMapIter.next();
//			System.out.println(entry.getValue());
			System.out.println(entry.getKey());
		}
		
	}
}













