package you;

public class YouInfo { //Ŭ������ ��Ÿ ǥ����� �̿��� .

	public static void main(String[] args) {
		//ģ���� ���� ����  
		 int height = 180;		// ������ ��������� ��	 int = 4 byte 
		 double eye = 1.5;		// float = 4 byte, double =  8 byte     float, double = �Ǽ�
		 float weight = 50.5f;	// float ����Ұ�� �ȵɰ�� �÷�Ʈ�� ����ϰų� �ڿ� ���ڿ� f�� �߰����ָ� �ȴ�.	// byte = 1 byte 127������ 
		 char gender ='��'; 		// char = 2byte
		 boolean lastTime = true;  // boolean = 1byte  �� 19byte 
		 
		 System.out.println("��ģ���� Ű��:"+height+"cm");
		 System.out.println("��ģ���� �÷��� :"+eye);
		 System.out.println("��ģ���� �����Դ� :"+weight+"kg");
		 System.out.println("��ģ���� ������ :"+gender);
		 
	}

}
