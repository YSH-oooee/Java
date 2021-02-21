package 배열기본;

import java.util.Scanner;

/*
 * 영화관 좌석예매 (소요시간 04:11.79)
 * 1.좌석번호(index)를 입력받아 예매
 * 2.예매가 완료되면 해당 좌석 값을 1로 변경
 * 3.이미 예매가 완료된 좌석은 재구매할 수 없음
 * 4.한 좌석당, 12000원
 * 5.프로그램 종료 후, 해당 영화관의 총 매출액을 출력
 */
public class No_05_ArrayEx_영화관좌석예매 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] seat = new int[7];
		int cnt = 0;
		int ticket = 12000;
		
		while (true) {
			
			System.out.print("좌석 = [ ");
			for (int i = 0; i < seat.length; i++) {
				if (seat[i] == 0) {
					System.out.print("□ ");
				} else {
					System.out.print("■ ");
				}
			} System.out.println("]");
						
			System.out.println("=메가 영화관=");
			System.out.println("1.좌석예매");
			System.out.println("2.종료");
			
			System.out.print("메뉴 선택 : ");
			int sel = scan.nextInt();
			
			if (sel == 1) {
				
				System.out.print("좌석 번호(1~7) 입력 : ");
				int idx = scan.nextInt() - 1;
				
				if (seat[idx] == 0) {
					
					seat[idx] = 1;
					cnt++;
					System.out.println("예매가 완료되었습니다");
					
				} else {
					System.out.println("해당 좌석은 예매가 완료된 좌석입니다");
				}
				
			} else if (sel == 2) {
				break;
			}
			
		}
		
		System.out.println("총 매출액 = " + (cnt * ticket) + "원");
		
	}

}
