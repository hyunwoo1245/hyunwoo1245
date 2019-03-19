package control; //맨위 페키지1

import java.lang.*; // import2
import java.util.Date;

public class ObjectTest { // class3

	public static void main(String[] args) {
		Date date = new Date(); // Date를 복사한다. Date는 날짜를 가져옴 Date는 기초용이 아니라서 복사를 해줘야한다. Scanner도 마찬가지 .
		int hour = date.getHours(); // 이클립스가 오래되서 다른걸쓰라고 가로줄로 그어져있음
		int year = date.getYear();
		int minutes = date.getMinutes();
		int Month = date.getMonth();
		int Seconds = date.getSeconds();
		int Day = date.getDay();
		System.out.println("현재 시각은 :" + hour);
		System.out.println("현재 년도는 :" + (year + 1900));
		System.out.println("현재 분은 :" + minutes);
		System.out.println("현재 달은 :" + (Month + 1)); // 엣날 버전이라 잘 활용되지않음.
		System.out.println("현재 초는 :" + Seconds);
		System.out.println("현재 요일은 :" + Day); // day가 2라고 나와서 if문을 사용하여 2의 값일 경우 요일을사용
		if (Day == 2) {
			System.out.println("오늘은 화요일 입니다.");
		} else if (Day == 3) {
			System.out.println("오늘은 수요일 입니다.");
		} else if (Day == 4) {
			System.out.println("오늘은 목요일 입니다.");

		}
	}
}
