package 기본반복문;

import java.util.Scanner;

/*
 * 베스킨라빈스31 (소요시간 03:50.77)
 * 1.p1과 p2가 번갈아가면서 1~3을 입력
 * 2.br은 p1과 p2의 입력값을 누적해서 저장
 * 3.br이 31을 넘으면 게임 종료
 * 4.승리자 출력
 * 
 * 예)
 * 1턴 : p1(2) >> br = 2
 * 2턴 : p2(1) >> br = 3
 * 3턴 : p1(3) >> br = 6
 * ...
 */
public class No_08_WhileEx_베스킨라빈스31 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int p1 = 0;
		int p2 = 0;
		int br = 0;
		int turn = 0;
				
		while (true) {
						
			System.out.println("진행 = " + br);
			
			if (br >= 31) {
				break;
			}
			
			if (turn % 2 == 0) {
				
				System.out.print("[p1]숫자 입력(1~3) : ");
				int p1Num = scan.nextInt();
				
				br += p1Num;
				
			}
			
			if (turn % 2 == 1) {
				
				System.out.print("[p2]숫자 입력(1~3) : ");
				int p2Num = scan.nextInt();
				
				br += p2Num;
				
			}
			
			turn++;
			
		}
		
		if (turn % 2 == 0) {
			System.out.println("p1 승리");
		} else if (turn % 2 == 1) {
			System.out.println("p2 승리");
		}

	}

}
