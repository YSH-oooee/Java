package 배열기본;

import java.util.Random;
import java.util.Scanner;

/*
 * 즉석복권 (소요시간 03:08.89)
 * 1.숫자 7이 연속으로 3번 나오면 당첨
 */
public class No_06_ArrayEx_즉석복권 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		int[] lotto = new int[8];
		
		for (int i = 0; i < 3; i++) {
			int r = ran.nextInt(8);
			if (lotto[r] == 0) {
				lotto[r] = 7;
			} else {
				i--;
			}
		}
		
		System.out.print("Lotto = [ ");
		for (int i = 0; i < lotto.length; i++) {
			System.out.print(lotto[i] + " ");
		} System.out.println("]");
		
		while (true) {
			
			System.out.println("1.결과확인");
			System.out.println("2.종료");
			
			System.out.print("메뉴 선택 : ");
			int sel = scan.nextInt();
			
			if (sel == 1) {
				
				int cnt = 0;
				for (int i = 0; i < lotto.length; i++) {
					if (cnt == 3) {
						break;
					}
					if (lotto[i] == 7) {
						cnt++;
					} else {
						cnt = 0;
					}
				}
				
				if (cnt == 3) {
					System.out.println("당첨!");
				} else {
					System.out.println("낙첨");
				}
				
			} else if (sel == 2) {
				System.out.println("종료");
				break;
			}
			
		}

	}

}
