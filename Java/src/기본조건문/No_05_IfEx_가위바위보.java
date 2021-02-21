package 기본조건문;

import java.util.Scanner;

/*
 * 가위(0)바위(1)보(2) 게임[1단계](02:20.59)
 * 1.com은 바위(1)만 낼 수 있다
 * 2.me는 0~2 사이의 숫자를 입력받는다
 * 3.com과 me를 비교하여,
 * 		1)비겼다
 * 		2)me가 이겼다
 * 		3)me가 졌다		를 출력한다
 */
public class No_05_IfEx_가위바위보 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int com = 1;
		
		System.out.print("가위(0)바위(1)보(2) 입력 : ");
		int me = scan.nextInt();
		
		if (me == com) {
			System.out.println("비겼다");
		} else if (me < com) {
			System.out.println("me가 졌다");
		} else if (me > com) {
			System.out.println("me가 이겼다");
		}

	}

}
