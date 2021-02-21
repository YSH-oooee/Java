package 기본조건문;

import java.util.Random;
import java.util.Scanner;

/*
 * 연산자 기호 맞추기 게임(05:54.20)
 * 1.1~10 사이의 랜덤 숫자 2개 저장
 * 2.1~4 사이의 랜덤 숫자 1개 저장
 * 3.2의 숫자는 연산자 기호
 *  1)+ 2)- 3)* 4)%
 * 4.연산자 기호를 맞춘다
 *  예) 3 ? 4 = 7
 *  1)+ 2)- 3)* 4)%
 *  정답 : 1번
 */
public class No_23_IfEx_연산자기호 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		int x = ran.nextInt(10) + 1;
		int y = ran.nextInt(10) + 1;		
		int z = ran.nextInt(4) + 1;
		int answer = 0;
		
		if (z == 1) {
			answer = x + y;
			System.out.println(x + " ? " + y + " = " + answer);
		} else if (z == 2) {
			answer = x - y;
			System.out.println(x + " ? " + y + " = " + answer);
		} else if (z == 3) {
			answer = x * y;
			System.out.println(x + " ? " + y + " = " + answer);
		} else if (z == 4) {
			answer = x % y;
			System.out.println(x + " ? " + y + " = " + answer);
		}
		
		while (true) {
			
			System.out.println("1)+  2)-  3)*  4)%");
			System.out.print("정답 입력 : ");
			int myAnswer = scan.nextInt();
			
			if (myAnswer == z) {
				System.out.println("정답");
				break;
			} else {
				System.out.println("땡");
			}
			
		}

	}

}
