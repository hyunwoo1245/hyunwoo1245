package control; //���� ��Ű��1

import java.lang.*; // import2
import java.util.Date;

public class ObjectTest { // class3

	public static void main(String[] args) {
		Date date = new Date(); // Date�� �����Ѵ�. Date�� ��¥�� ������ Date�� ���ʿ��� �ƴ϶� ���縦 ������Ѵ�. Scanner�� �������� .
		int hour = date.getHours(); // ��Ŭ������ �����Ǽ� �ٸ��ɾ���� �����ٷ� �׾�������
		int year = date.getYear();
		int minutes = date.getMinutes();
		int Month = date.getMonth();
		int Seconds = date.getSeconds();
		int Day = date.getDay();
		System.out.println("���� �ð��� :" + hour);
		System.out.println("���� �⵵�� :" + (year + 1900));
		System.out.println("���� ���� :" + minutes);
		System.out.println("���� ���� :" + (Month + 1)); // ���� �����̶� �� Ȱ���������.
		System.out.println("���� �ʴ� :" + Seconds);
		System.out.println("���� ������ :" + Day); // day�� 2��� ���ͼ� if���� ����Ͽ� 2�� ���� ��� ���������
		if (Day == 2) {
			System.out.println("������ ȭ���� �Դϴ�.");
		} else if (Day == 3) {
			System.out.println("������ ������ �Դϴ�.");
		} else if (Day == 4) {
			System.out.println("������ ����� �Դϴ�.");

		}
	}
}
