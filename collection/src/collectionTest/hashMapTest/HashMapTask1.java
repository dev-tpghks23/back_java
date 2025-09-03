package collectionTest.hashMapTest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

// HashMap 자료구조 변경 실습1
// "street": "Victor Plains",
// "suite": "Suite 879",
// "city": "Wisokyburgh",
// "zipcode": "90566-7771",
// "lat": "-43.9509",
// "lng": "-34.4618"

// value들만 ArrayList로 변경 후 출력

public class HashMapTask1 {
	public static void main(String[] args) {
		HashMap<String, Object> hashMap = new HashMap<String, Object>();
		hashMap.put("street", "Victor Plains");
		hashMap.put("suite", "Suite 879");
		hashMap.put("city", "Wisokyburgh");
		hashMap.put("zipcode", "90566-7771");
		hashMap.put("lat", "-43.9509");
		hashMap.put("lng", "-34.4618");
		
		System.out.println(new ArrayList(hashMap.values()));
		
//		Iterator<Entry<String, Object>> entry = hashMap.entrySet().iterator();
//		ArrayList<Object> arrayList = new ArrayList<Object>();
//		
//		while(entry.hasNext()) {
//			arrayList.add(entry.next().getValue());
//		}
//		
//		System.out.println(arrayList);
		
	}
}













