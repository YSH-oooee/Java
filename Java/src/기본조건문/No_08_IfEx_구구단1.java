package 기본조건문;

import java.util.Scanner;

/*
 * 구구단게임[1단계](02:03.55)
 * 1.구구단 문제 출제를 위해 숫자 2개를 입력받는다
 * 2.입력받은 숫자로 구구단 문제를 출력
 * 3.문제에 해당하는 정답을 입력받는다
 * 4.정답을 비교하여, 정답 또는 땡을 출력
 */
public class No_08_IfEx_구구단1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("x 입력 : ");
		int x = scan.nextInt();
		
		System.out.print("y 입력 : ");
		int y = scan.nextInt();
		
		System.out.println(x + " * " + y + " = ?");
		System.out.print("정답 입력 : ");
		int answer = scan.nextInt();
		
		if (x * y == answer) {
			System.out.println("정답!");
		} else {
			System.out.println("땡!");
		}

	}

}
