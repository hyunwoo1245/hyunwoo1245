package variable;

/*
 * ���α׷���:shw
 * ����������¥:2019.03.19
 * ��������: ���� Ȯ�� 
 */
public class VarTest {

	public static void main(String[] args) {
		// �ڹ��� �⺻ ���� �ּ�
		System.out.println("������ �ι�° ���Դϴ�.");
		System.out.println("----------------------------------------");
		System.out.println();

		byte time = 15; // = ���� ������ , �Ҵ� ������
		// ����Ÿ��Ÿ�� ������ = ��;
		int seconds = 1234567;

		final double PI = 3.14123457; // ������ ����(�������� �ʴ´�.) ���(final)�� ������ �Ϲ������� �빮�� ����� �°��� ����
		// PI = 3; ����� ���� �����Ҽ� ���� .
		
		char lastName = '��';
		boolean lunch = true; //��: true , ���� : false
		// + => ���� ������
		// (String,���ڿ�) 
		// String�� �⺻���� �ƴϴ�.!!!
		//String name = "" ;  �⺻���� �ƴҰ�� �̷��� ���� ���ϰ�
		//String name = new String(); Scanner ó�� �̷��� ����Ѵ� .
		System.out.println("���� �ð��� :"+ time);
		System.out.println("���� �ʴ� :"+ seconds);
		System.out.println("������ ����"+ PI);
		System.out.println("���� �̸� ù���ڴ� :"+ lastName);
		System.out.println("������  �Ծ����� : "+lunch);
		
		String name="�־ƹ���"; //String => " �ڹٰ� �̷��� ��
		System.out.println("���� ��ü�̸��� : "+name);
	}

}
