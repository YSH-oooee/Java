package 배열기본;

import java.util.Random;
import java.util.Scanner;

/*
 * 기억력게임 (소요시간 08:00.68)
 * 1.같은 숫자의 위치를 2개 입력해 정답은 맞추는 게임
 * 2.정답을 맞추면 back베열에 해당 숫자를 저장, back배열에 모든 수가 채워지면 게임 종료
 */
public class No_11_ArrayEx_기억력게임 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		int[] front = {1, 1, 2, 2, 3, 3, 4, 4, 5, 5};
		int[] back = new int[10];
		
		for (int i = 0; i < 500; i++) {
			int r = ran.nextInt(10);
			int temp = front[0];
			front[0] = front[r];
			front[r] = temp;
		}
		
		System.out.print("정답 = [ ");
		for (int i = 0; i < front.length; i++) {
			System.out.print(front[i] + " ");
		} System.out.println("]");
				
		int cnt = 0;
		while (cnt < 5) {
			
			for (int i = 0; i < front.length; i++) {
				if (back[i] == 0) {
					System.out.print("□ ");
				} else {
					System.out.print(front[i] + " ");
				}
			} System.out.println();
			
			System.out.print("카드1 선택 : ");
			int idx1 = scan.nextInt();
			
			System.out.print("카드2 선택 : ");
			int idx2 = scan.nextInt();
			
			if (front[idx1] == front[idx2]) {
				back[idx1] = front[idx1];
				back[idx2] = front[idx2];
				cnt++;
			}
			
		}

	}

}
