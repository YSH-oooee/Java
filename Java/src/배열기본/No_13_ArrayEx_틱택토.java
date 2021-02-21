package 배열기본;

import java.util.Scanner;

/*
 * 틱택토 (소요시간 16:42.42)
 * [X][X][O]
 * [ ][O][ ]
 * [ ][ ][ ]
 * >>[p1]인덱스 입력 : 6
 * [X][X][O]
 * [ ][O][ ]
 * [O][ ][ ]
 * >>[p1]승리
 */
public class No_13_ArrayEx_틱택토 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] game = new int[9];
		
		int turn = 0;
		int win = 0;
		
		while (true) {
			
			System.out.println("==틱택토==");
			for (int i = 0; i < game.length; i++) {
				if (game[i] == 0) {
					System.out.print("[ ]");
				} else if (game[i] == 1) {
					System.out.print("[O]");
				} else if (game[i] == 2) {
					System.out.print("[X]");
				}
				
				if (i % 3 == 2) {
					System.out.println();
				}
			}

			if (win == 1) {
				System.out.println("[p1]승리");
				break;
			}
			if (win == 2) {
				System.out.println("[p2]승리");
				break;
			}
			
			if (turn % 2 == 0) {
				
				System.out.print("[p1]인덱스 입력 : ");
				int idx = scan.nextInt();
				
				if (game[idx] == 0) {
					game[idx] = 1;
				}
				
			}
			
			if (turn % 2 == 1) {
				
				System.out.print("[p2]인덱스 입력 : ");
				int idx = scan.nextInt();
				
				if (game[idx] == 0) {
					game[idx] = 2;
				}
				
			}
			
			//가로검사
			for (int i = 0; i < game.length; i+=3) {
				
				if (game[i] == 1 && game[i + 1] == 1 && game[i + 2] == 1) {
					win = 1;
				}
				else if (game[i] == 2 && game[i + 1] == 2 && game[i + 2] == 2) {
					win = 2;
				}
				
			}
			
			//세로검사
			for (int i = 0; i < 3; i++) {
				
				if (game[i] == 1 && game[i + 3] == 1 && game[i + 6] == 1) {
					win = 1;
				}
				else if (game[i] == 2 && game[i + 3] == 2 && game[i + 6] == 2) {
					win = 2;
				}
				
			}
			
			//대각선검사
			if (game[0] == 1 && game[4] == 1 && game[8] == 1) {
				win = 1;
			} else if (game[0] == 2 && game[4] == 2 && game[8] == 2) {
				win = 2;
			}
			
			if (game[2] == 1 && game[4] == 1 && game[6] == 1) {
				win = 1;
			} else if (game[2] == 2 && game[4] == 2 && game[6] == 2) {
				win = 2;
			}
			
			turn++;
			
		}

	}

}
