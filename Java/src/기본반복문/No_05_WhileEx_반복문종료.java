package 기본반복문;

import java.util.Scanner;

/*
 * 반복문 종료(-100) (소요시간 01:06.83)
 * 1.무한 반복을 하면서 숫자를 입력 받는다
 * 2.입력한 숫자가 -100이면, 프로그램 종료
 */
public class No_05_WhileEx_반복문종료 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		while (true) {
			
			System.out.print("숫자 입력 : ");
			int num = scan.nextInt();
			
			if (num == -100) {
				System.out.println("프로그램 종료");
				break;
			}			
		}

	}

}
