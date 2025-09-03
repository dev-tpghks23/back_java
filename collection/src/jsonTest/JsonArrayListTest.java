package jsonTest;

import java.util.ArrayList;

import org.json.JSONArray;
import org.json.JSONObject;

public class JsonArrayListTest {
	public static void main(String[] args) {
		ArrayList<User> users = new ArrayList<User>(); 
		JSONArray usersJSON = new JSONArray();
		JSONObject userJSON = new JSONObject();
		
		User user1 = new User(1L, "홍길동", 17, "개발자");
		User user2 = new User(1L, "장보고", 20, "기획자");
		User user3 = new User(1L, "이순신", 35, "디자이너");
		User user4 = new User(1L, "이성계", 42, "개발자");
		User user5 = new User(1L, "이태희", 22, "사장");
		
		users.add(user1);
		users.add(user2);
		users.add(user3);
		users.add(user4);
		users.add(user5);

//		반복문을 돈다.
//		생성자를 이용해서 JSONObject 객체화(User 클래스)
//		JSONArray에 하나씩 put
//		for(int i = 0; i < users.size(); i++) {
//			usersJSON.put(new JSONObject(users.get(i)));
//		}

//		users.forEach((data) -> {
//			System.out.println(data);
//		});
		
		users.stream().map((data) -> new JSONObject(data)).forEach((json) -> {
			usersJSON.put(json);
		});
		
		System.out.println(usersJSON);
		
	}
}










