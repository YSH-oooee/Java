package 기본조건문;

import java.util.Scanner;

/*
 * ATM[1단계] : 이체하기(02:02.28)
 * 1.이체할 계좌번호 입력
 * 2.계좌번호가 일치하면, 이체 금액 입력
 * 3.이체 금액과 소지금을 비교하여 결과 출력
 */
public class No_18_IfEx_ATM1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int myAcc = 1234;
		int myMoney = 8700;
		
		int yourAcc = 4321;
		int yourMoney = 12000;
		
		while (true) {
			
			System.out.println("myMoney = " + myMoney);
			System.out.println("yourMonry = " + yourMoney);
			
			System.out.print("계좌번호 입력 : ");
			int acc = scan.nextInt();
			
			if (acc == yourAcc) {
				System.out.print("이체 금액 입력 : ");
				int money = scan.nextInt();
				
				if (money > myMoney) {
					System.out.println("잔액이 부족합니다");
				} else {
					myMoney -= money;
					yourMoney += money;
					
					System.out.println("이체 완료");
					break;
				}
			} else if (acc != yourAcc) {
				System.out.println("해당 계좌는 없는 계좌입니다");
			}
			
		}

	}

}
