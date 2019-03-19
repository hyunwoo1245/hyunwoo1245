package you;

public class YouInfo { //클래스는 낙타 표기법을 이용함 .

	public static void main(String[] args) {
		//친구에 대한 정보  
		 int height = 180;		// 변수를 지정해줘야 함	 int = 4 byte 
		 double eye = 1.5;		// float = 4 byte, double =  8 byte     float, double = 실수
		 float weight = 50.5f;	// float 사용할경우 안될경우 플로트를 사용하거나 뒤에 숫자에 f를 추가해주면 된다.	// byte = 1 byte 127까지들어감 
		 char gender ='남'; 		// char = 2byte
		 boolean lastTime = true;  // boolean = 1byte  총 19byte 
		 
		 System.out.println("내친구의 키는:"+height+"cm");
		 System.out.println("내친구의 시력은 :"+eye);
		 System.out.println("내친구의 몸무게는 :"+weight+"kg");
		 System.out.println("내친구의 성별은 :"+gender);
		 
	}

}
