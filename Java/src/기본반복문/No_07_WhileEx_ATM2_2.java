package 기본반복문;

import java.util.Scanner;

/*
 * ATM[2_2단계] (소요시간 11:44.73)
 * 1.로그인
 *  - 로그인 후, 재 로그인 불가
 *  - 로그아웃 상태에서만 이용 가능
 * 2.로그아웃
 *  - 로그인 후, 이용 가능
 * 3.입금
 *  - 입금할 금액을 입력받아, dbMoney1에 입금
 * 4.출금
 *  - 출금할 금액을 입력받아, dbMoney1에서 출금
 *  - 단, 출금할 금액이 dbMoney1 잔액을 초과할 경우 출금불가
 * 5.이체
 *  - yourAcc 계좌번호를 입력받아, 이체
 *  - 이체할 금액이 dbMoney1 잔액을 초과할 경우 이체 불가
 *  - 이체 후 dbMoney2 잔액 증가
 * 6.조회
 *  - dbMoney1와 dbMoney2 잔액 모두 출력
 * 0.종료
 */
public class No_07_WhileEx_ATM2_2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int dbAcc1 = 1111;
		int dbPw1 = 1234;
		int dbMoney1 = 50000;
		
		int dbAcc2 = 2222;
		int dbPw2 = 2345;
		int dbMoney2 = 70000;
		
		int log = -1;
		
		while (true) {
			
			System.out.println("==================");
			System.out.print("접속자 : ");
			if (log == -1) {
				System.out.println("없음");
			} else if (log == 1) {
				System.out.println(dbAcc1 + "님");
			} else if (log == 2) {
				System.out.println(dbAcc2 + "님");
			}
			System.out.println("==================");
			
			System.out.println("1.로그인");
			System.out.println("2.로그아웃");
			System.out.println("3.입금");
			System.out.println("4.출금");
			System.out.println("5.이체");
			System.out.println("6.조회");
			System.out.println("0.종료");
			
			System.out.print("메뉴 선택 : ");
			int sel = scan.nextInt();
			
			if (sel == 1) {
				
				if (log != -1) {
					System.out.println("[시스템]로그아웃 후, 이용 가능합니다");
					continue;
				}
				
				System.out.print("[로그인]ID 입력 : ");
				int myId = scan.nextInt();
				
				if (myId == dbAcc1) {
					
					System.out.print("[로그인]PW 입력 : ");
					int myPw = scan.nextInt();
					
					if (myPw == dbPw1) {
						log = 1;
						System.out.println(dbAcc1 + "님, 환영합니다");
					} else {
						System.out.println("[시스템]비밀번호를 확인하세요");
					}
					
				} else if (myId == dbAcc2) {
					
					System.out.print("[로그인]PW 입력 : ");
					int myPw = scan.nextInt();
					
					if (myPw == dbPw2) {
						log = 2;
						System.out.println(dbAcc2 + "님, 환영합니다");
					} else {
						System.out.println("[시스템]비밀번호를 확인하세요");
					}
					
				} else {
					System.out.println("[시스템]ID를 확인하세요");
				}
				
			} else if (sel == 2) {
				if (log == -1) {
					System.out.println("[시스템]로그인 후, 이용 가능합니다");
					continue;
				}
				
				log = -1;
				
				System.out.println("로그아웃 되었습니다");
				
			} if (sel == 3) {
				
				if (log == -1) {
					System.out.println("[시스템]로그인 후, 이용 가능합니다");
					continue;
				}
				
				System.out.print("[입금]금액 입력 : ");
				int money = scan.nextInt();
				
				dbMoney1 += money;
				
				System.out.println("입금 완료");
				
			} else if (sel == 4) {
				
				if (log == -1) {
					System.out.println("[시스템]로그인 후, 이용 가능합니다");
					continue;
				}
				
				System.out.print("[출금]금액 입력 : ");
				int money = scan.nextInt();
				
				if (money > dbMoney1) {
					System.out.println("[시스템]잔액이 부족합니다");
				} else {
					dbMoney1 -= money;
					
					System.out.println("출금 완료");
				}
				
			} else if (sel == 5) {
				
				if (log == -1) {
					System.out.println("[시스템]로그인 후, 이용 가능합니다");
					continue;
				}
				
				System.out.print("[이체]계좌번호 입력 : ");
				int yourAcc = scan.nextInt();
				
				if (yourAcc == dbAcc2) {
					System.out.print("[이체]금액 입력 : ");
					int money = scan.nextInt();
					
					if (money > dbMoney1) {
						System.out.println("[시스템]잔액이 부족합니다");
					} else {
						dbMoney1 -= money;
						dbMoney2 += money;
						
						System.out.println("이체 완료");
					}
				} else {
					System.out.println("[시스템]해당 계좌는 없는 계좌입니다");
				}
				
			} else if (sel == 6) {
				
				if (log == -1) {
					System.out.println("[시스템]로그인 후, 이용 가능합니다");
					continue;
				}
				
				System.out.println(dbAcc1 + "님의 잔액 = " + dbMoney1 + "원");
				System.out.println(dbAcc2 + "님의 잔액 = " + dbMoney2 + "원");
				
			} else if (sel == 0) {
				System.out.println("프로그램 종료");
				break;
			}
			
		}

	}

}
