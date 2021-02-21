package 기본반복문;

import java.util.Scanner;

/*
 * 최대값[2단계] (소요시간 04:02.58)
 * 1.3회 반복하여 정수를 입력받는다
 * 2.입력받은 3개의 숫자 중, 가장 큰 값을 출력
 */
public class No_11_WhileEx_최대값2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int max = 0;
		
		int i = 0;
		while (i < 3) {
			
			System.out.print("정수" + (i + 1) + " 입력 : ");
			int x = scan.nextInt();
			
			if (max < x) {
				max = x;
			}
			
			i++;			
		}
		
		System.out.println("최대값 : " + max);

	}

}
