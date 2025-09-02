package collectionTest.arrayList;

import java.util.ArrayList;

public class ArrayListTask2 {
	
	public static void main(String[] args) {
//		바로 시작!
//		a ~ z까지 문자열로 ArrayList에 추가하기
//		97 ~ 122
		ArrayList<String> datas = new ArrayList<String>();
		for(int i = 0; i < 26; i++) {
			datas.add(String.valueOf((char)('a' + i)));
		}
		System.out.println(datas);
		
//		for(String str: datas) {
//			System.out.println(str);
//		}
		
//		조회 .get()
		for(int i = 0; i < datas.size(); i++) {
			if(i % 2 == 1) {
				System.out.print(datas.get(i).toUpperCase());
				continue;
			}
			System.out.print(datas.get(i));
		}
		
	}
}







