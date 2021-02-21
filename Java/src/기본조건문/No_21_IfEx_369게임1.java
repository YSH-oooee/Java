package 기본조건문;

import java.util.Random;

/*
 * 369게임[1단계](03:46.97)
 * 1.1~50 사이의 랜덤 숫자 저장
 * 2.랜덤 숫자에 3, 6, 9의 개수가
 *  1)2개이면, 짝짝
 *  2)1개이면, 짝
 *  3)0개이면, 해당 숫자 출력
 * 예) 33 : 짝짝, 16 : 짝, 7 : 7
 */
public class No_21_IfEx_369게임1 {

	public static void main(String[] args) {
		
		Random ran = new Random();
		
		int rNum = ran.nextInt(50) + 1;
		int cnt = 0;
		
		int r1 = rNum / 10;
		int r2 = rNum % 10;
		
		if (r1 == 3 || r1 == 6 || r1 == 9) {
			cnt++;
		}
		if (r2 == 3 || r2 == 6 || r2 == 9) {
			cnt++;
		}
		
		System.out.println("랜덤 숫자 : " + rNum);
		if (cnt == 0) {
			System.out.println(rNum);
		} else if (cnt == 1) {
			System.out.println("짝");
		} else if (cnt == 2) {
			System.out.println("짝짝");
		}

	}

}
