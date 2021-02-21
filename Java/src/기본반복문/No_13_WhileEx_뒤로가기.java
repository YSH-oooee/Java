package 기본반복문;

import java.util.Scanner;

/*
 * 쇼핑몰 뒤로가기 (소요시간 05:56.78)
 * 1.남성의류
 *  1)상의
 *  2)하의
 *  3)뒤로가기
 * 2.여성의류
 *  1)상의
 *  2)하의
 *  3)뒤로가기
 * 3.종료
 */
public class No_13_WhileEx_뒤로가기 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		while (true) {
			
			System.out.println("1.남성의류");
			System.out.println("2.여성의류");
			System.out.println("3.종료");
			
			System.out.print("메뉴 선택 : ");
			int sel = scan.nextInt();
			
			if (sel == 1) {
				
				while (true) {
					
					System.out.println("1)상의");
					System.out.println("2)하의");
					System.out.println("3)뒤로가기");
					
					System.out.print("상품 선택 : ");
					int choice = scan.nextInt();
					
					if (choice == 1) {
						System.out.println("상의입니다...");
					} else if (choice == 2) {
						System.out.println("하의입니다...");
					} else if (choice == 3) {
						break;
					}
					
				}
				
			} else if (sel == 2) {
				
				while (true) {
					
					System.out.println("1)상의");
					System.out.println("2)하의");
					System.out.println("3)뒤로가기");
					
					System.out.print("상품 선택 : ");
					int choice = scan.nextInt();
					
					if (choice == 1) {
						System.out.println("상의입니다...");
					} else if (choice == 2) {
						System.out.println("하의입니다...");
					} else if (choice == 3) {
						break;
					}
					
				}
				
			} else if (sel == 3) {
				System.out.println("종료합니다");
				break;
			}
			
		}

	}

}
