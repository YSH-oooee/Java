package 기본조건문;

import java.util.Random;
import java.util.Scanner;

/*
 * 코인게임(01:53.50)
 * 1.0 또는 1의 랜덤 숫자 저장
 * 2.0은 동전 앞면, 1은 동전 뒷면
 * 3.동전의 앞뒷면을 맞추는 게임
 */
public class No_13_RandomEx_코인게임 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();

		System.out.print("동전 앞(0) 뒤(1) 입력 : ");
		int me = scan.nextInt();
		
		int coin = ran.nextInt(2);
		
		if (coin == 0) {
			System.out.println("앞");
		} else if (coin == 1) {
			System.out.println("뒤");
		}
		
		if (me == coin) {
			System.out.println("정답");
		} else {
			System.out.println("땡");
		}

	}

}
