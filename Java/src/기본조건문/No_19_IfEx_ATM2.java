package 기본조건문;

import java.util.Scanner;

/*
 * 1.로그인 >> 1.입금 2.출금 3.조회 0.뒤로가기
 */
public class No_19_IfEx_ATM2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int cash = 20000;		//소지 현금 : 입금 시 감소, 출금 시 증가
		int balance = 30000;	//계좌 잔액 : 입금 시 증가, 출금 시 감소
		int account = 11111;	//로그인 시, 사용
		int password = 1234;	//로그인 시, 사용
		
		while (true) {
			
			System.out.println("===MEGA ATM===");
			System.out.println("1.로그인 2.종료");
			
			System.out.print("메뉴 선택 : ");
			int sel = scan.nextInt();
			
			if (sel == 1) {
				
				System.out.print("[로그인]계좌번호 입력 : ");
				int myAcc = scan.nextInt();
				
				if (myAcc == account) {
					System.out.print("[로그인]비밀번호 입력 : ");
					int myPw = scan.nextInt();
					
					if (myPw == password) {
						while (true) {
							
							System.out.println("1.입금 2.출금 3.조회 0.뒤로가기");
							int choice = scan.nextInt();
							
							if (choice == 1) {
								System.out.print("[입금]금액 입력 : ");
								int money = scan.nextInt();
								
								if (money > cash) {
									System.out.println("잔액이 부족합니다");
								} else {
									cash -= money;
									balance += money;
									System.out.println("입금 완료");
								}
							} else if (choice == 2) {
								System.out.print("[출금]금액 입력 : ");
								int money = scan.nextInt();
								
								if (money > balance) {
									System.out.println("잔액이 부족합니다");
								} else {
									cash += money;
									balance -= money;
									System.out.println("출금 완료");
								}
							} else if (choice == 3) {
								System.out.println("소지 현금 : " + cash + "원");
								System.out.println("계좌 잔액 : " + balance + "원");
							} else if (choice == 0) {
								break;
							}
							
						}
					} else {
						System.out.println("비밀번호가 맞지 않습니다");
					}
				} else {
					System.out.println("계좌번호가 맞지 않습니다");
				}
				
			} else if (sel == 2) {
				System.out.println("프로그램 종료");
				break;
			}
			
		}

	}

}
