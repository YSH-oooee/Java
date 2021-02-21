package 기본조건문;

import java.util.Random;
import java.util.Scanner;

/*
 * 가운데 숫자 맞추기(02:50.33)
 * 1.150~250 사시의 랜덤 숫자 저장
 * 2.랜덤 숫자의 가운데 숫자를 맞추는 게임
 * 예) 249 : 4
 */
public class No_20_IfEx_가운데숫자맞추기 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		int rNum = ran.nextInt(100) + 150;
		
		System.out.println("문제 = " + rNum + "의 가운데 숫자");
		System.out.print("정답 입력 : ");
		int answer = scan.nextInt();
		
		int center = rNum % 100;
		center = center / 10;
		
		System.out.println("정답 : " + center);
		
		if (center == answer) {
			System.out.println("정답");
		} else {
			System.out.println("땡");
		}

	}

}
