package 기본반복문;

import java.util.Random;
import java.util.Scanner;

/*
 * 카카오택시 (소요시간 09:38.64)
 * 1.손님을 태워 목적지까지 이동
 * 2.-10~10 사이의 랜덤숫자 2개를 저장해 목적지로 설정
 * 3.메뉴
 *  1)속도 설정 : 1~3까지 가능
 *  2)방향 설정 : 좌(1)우(2)상(3)하(4)
 *  3)이동하기  : 설정된 방향으로, 설정된 속도만큼 이동
 * 4.거리 2칸 당, 50원씩 추가되어 총요금 출력
 */
public class No_14_WhileEx_카카오택시 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		int desX = 0, desY = 0;
		int x = 0, y = 0;
		int dir = 0;
		int speed = 0;
		int distance = 0;
		int fee = 0;
		
		desX = ran.nextInt(21) - 10;
		desY = ran.nextInt(21) - 10;
		
		while (true) {
			
			System.out.println("==카카오택시==");
			System.out.println("목 적 지  : " + desX + "," + desY);
			System.out.println("현 위 치  : " + x + "," + y);
			System.out.println("방      향 : " + dir);
			System.out.println("속      도 : " + speed);
			System.out.println("이동거리 : " + distance);
			System.out.println("===========");
			
			if (desX == x && desY == y) {
				System.out.println("도착했습니다");
				break;
			}
			
			System.out.println("1.속도설정");
			System.out.println("2.방향설정");
			System.out.println("3.이동하기");
			
			System.out.print("메뉴 선택 : ");
			int sel = scan.nextInt();
			
			if (sel == 1) {
				
				System.out.print("속도(1~3) 입력 : ");
				speed = scan.nextInt();
				
			} else if (sel == 2) {
				
				System.out.print("좌(1)우(2)상(3)하(4) 입력 : ");
				dir = scan.nextInt();
				
			} else if (sel == 3) {
				
				if (dir == 1) {
					x -= speed;
				} else if (dir == 2) {
					x += speed;
				} else if (dir == 3) {
					y += speed;
				} else if (dir == 4) {
					y -= speed;
				}
				
				distance += speed;
				
			}
			
		}
		
		if (distance % 2 == 0) {
			fee = distance / 2 * 50;
		} else {
			fee = (distance / 2 * 50) + 50;
		}
		
		System.out.println("총 요금 : " + fee + "원");

	}

}
