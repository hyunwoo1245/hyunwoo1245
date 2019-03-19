package cal;

public class CalTest3 {

	public static void main(String[] args) {
		//String id = "root"; //비교 연산자 사용 불가
		//비교 연산자는 기초형 비교만 할 수 있다.
		int id = 1000;
		int pw = 1111;
		
		
		if(id == 1000 && pw == 1111) {
			//조건이 맞으면 if문이 사용된다
			System.out.println("로그인이 맞습니다.");
		}else if (id != 1000) {
			System.out.println("로그인 불허.");
		}
	}

}
