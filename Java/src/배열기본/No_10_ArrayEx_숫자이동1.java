package 배열기본;

import java.util.Scanner;

/*
 * 숫자이동[1단계] (소요시간 07:33.90)
 * 1.숫자2는 캐릭터
 * 2.숫자 1을 입력하면, 캐릭터가 왼쪽으로
 *   숫자 2를 입력하면, 캐릭터가 오른쪽으로 이동
 * 3.단, 좌우 끝에 도달했을 때 예외처리
 */
public class No_10_ArrayEx_숫자이동1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] game = {0, 0, 2, 0, 0, 0, 0};
		
		int player = 0;
		for (int i = 0; i < game.length; i++) {
			if (game[i] == 2) {
				player = i;
			}
		}
		
		while (true) {
			
			System.out.print("[ ");
			for (int i = 0; i < game.length; i++) {
				System.out.print(game[i] + " ");
			} System.out.println("]");
			
			System.out.print("[이동]좌(1)우(2) 입력 : ");
			int move = scan.nextInt();
			
			if (move == 1) {
				
				if (player - 1 >= 0) {

					game[player] = 0;
					player--;
					game[player] = 2;

				} else {
					System.out.println("더이상 이동할 수 없습니다");
				}
								
			} 
			if (move == 2) {
				
				if (player + 1 < game.length) {

					game[player] = 0;
					player++;
					game[player] = 2;

				} else {
					System.out.println("더이상 이동할 수 없습니다");
				}
				
			}
			
		}

	}

}
