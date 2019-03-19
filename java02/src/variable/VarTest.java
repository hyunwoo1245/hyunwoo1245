package variable;

/*
 * 프로그래머:shw
 * 최종수정날짜:2019.03.19
 * 수정원인: 변수 확인 
 */
public class VarTest {

	public static void main(String[] args) {
		// 자바의 기본 한줄 주석
		System.out.println("오늘은 두번째 날입니다.");
		System.out.println("----------------------------------------");
		System.out.println();

		byte time = 15; // = 대입 연산자 , 할당 연산자
		// 데이타의타입 변수명 = 값;
		int seconds = 1234567;

		final double PI = 3.14123457; // 끝내는 변수(변경하지 않는다.) 상수(final)인 변수는 일반적으로 대문자 사용하 는것이 좋다
		// PI = 3; 상수는 값을 변경할수 없다 .
		
		char lastName = '최';
		boolean lunch = true; //참: true , 거짓 : false
		// + => 연결 연산자
		// (String,문자열) 
		// String은 기본형이 아니다.!!!
		//String name = "" ;  기본형이 아닐경우 이렇게 쓰지 못하고
		//String name = new String(); Scanner 처럼 이렇게 사용한다 .
		System.out.println("지금 시각은 :"+ time);
		System.out.println("지금 초는 :"+ seconds);
		System.out.println("파이의 값은"+ PI);
		System.out.println("나의 이름 첫글자는 :"+ lastName);
		System.out.println("점심은  먹었나요 : "+lunch);
		
		String name="최아무개"; //String => " 자바가 이렇게 씀
		System.out.println("나의 전체이름은 : "+name);
	}

}
