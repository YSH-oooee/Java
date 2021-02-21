package 기본조건문;

import java.util.Scanner;

/*
 * 영수증 출력[1단계](04:57.89)
 * 1.메뉴판 출력
 * 2.사용자는 주문하려는 메뉴의 번호를 입력
 * 3.현금 입력
 * 4.입력받은 현금과 메뉴 가격을 비교, 영수증 출력
 * 5.단, 현금이 부족한 경우 현금 부족 메세지 출력
 */
public class No_11_IfEx_영수증출력 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int price1 = 8700;
		int price2 = 6200;
		int price3 = 1500;
		
		System.out.println("===롯데리아===");
		System.out.println("1.불고기 버거 : ");
		System.out.println("2.새 우  버 거 : ");
		System.out.println("3.콜          라 : ");
		
		System.out.print("메뉴 선택 : ");
		int sel = scan.nextInt();
		
		int tot = 0;
		
		if (sel == 1) {
			tot = price1;
		} else if (sel == 2) {
			tot = price2;
		} else if (sel == 3) {
			tot = price3;
		}
		
		System.out.println("총액 = " + tot + "원");
		System.out.print("현금 입력 : ");
		int money = scan.nextInt();
		
		int change = money - tot;
		
		if (money < tot) {
			System.out.println("현금이 부족합니다");
		} else {
			System.out.println("===영수증===");
			System.out.println("총액  " + tot);
			System.out.println("잔돈  " + change);
		}
		
	}

}
