package 기본반복문;

import java.util.Scanner;

/*
 * 소수찾기[1단계] (소요시간 02:40.53)
 * 1.소수란, 1과 자신으로만 나누어지는 수
 * 2.예)2, 3, 5, 7, 11, 13...
 * 3.힌트
 *  - 해당 숫자를 1부터 자신까지 나눔
 *  - 나머지가 0일 때마다 카운트 증가
 *  - 카운트 값이 2이면 소수
 */
public class No_10_WhileEx_소수찾기1 {

	public static void main(String[] args) {
		
		//정수 한개를 입력받아, 해당 숫자가 소수인지 아닌지 판별
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int num = scan.nextInt();
		
		int cnt = 0;
		
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				cnt++;
			}
		}
		
		if (cnt == 2) {
			System.out.println("소수");
		} else {
			System.out.println("정수");
		}
		
	}

}
