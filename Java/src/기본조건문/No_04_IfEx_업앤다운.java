package 기본조건문;

import java.util.Scanner;
/*
 * 문)Up & Down(01:43.46)
 * com = 8
 * me는 com의 숫자를 맞추는 게임
 * 다음과 같은 메세지를 출력
 * 1)me < com : Up!
 * 2)me = com : Bingo!
 * 3)me > com : Down!
 */
public class No_04_IfEx_업앤다운 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int com = 8;
		
		while (true) {
			
			System.out.print("me 입력 : ");
			int me = scan.nextInt();
			
			if (me < com) {
				System.out.println("Up!");
			} else if (me == com) {
				System.out.println("Bingo!");
				break;
			} else if (me > com) {
				System.out.println("Down!");
			}
			
		}

	}

}
