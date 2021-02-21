package 기본조건문;

import java.util.Scanner;

/*
 * 최대값 구하기[1단계]
 * 1.숫자 3개 입력
 * 2.입력받은 3개의 수를 비교
 * 3.가장 큰 수를 출력
 */
public class No_12_IfEx_최대값 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("숫자1 입력 : ");
		int num1 = scan.nextInt();
		
		System.out.print("숫자2 입력 : ");
		int num2 = scan.nextInt();
		
		System.out.print("숫자3 입력 : ");
		int num3 = scan.nextInt();
		
		int max = num1;
		
		if (max < num2) {
			max = num2;
		}
		if (max < num3) {
			max = num3;
		}
		
		System.out.println("최대값 = " + max);

	}

}
