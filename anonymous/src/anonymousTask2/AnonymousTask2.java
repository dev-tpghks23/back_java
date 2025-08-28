package anonymousTask2;

public class AnonymousTask2 {
	public static void main(String[] args) {
//		메서드 선언
		MyInter myInter = new MyInter() {
			
			@Override
			public void getString(String content) {
				char[] chars = content.toCharArray();
				for(char c: chars) {
					System.out.print((char)(c > 66 ? c + 1 : c));
				}
			}
			
			@Override
			public String changeUpperOrLower(String content) {
				char[] chars = content.toCharArray();
				String result = "";
				for(char c : chars) {
//					65 ~ 90: 대문자
//					97 ~ 122: 소문자
					if(c >= 65 && c <= 90) {
//						대문자
						result += String.valueOf(c).toLowerCase();
					}else if(c >= 97 && c <= 122) {
//						소문자
						result += String.valueOf(c).toUpperCase();
					}
				}
				return result;
			}
		};
		
//		메서드 사용
//		myInter.getString("ABCD");
		String result = myInter.changeUpperOrLower("abCDefG");
		System.out.println(result);
	}
}








