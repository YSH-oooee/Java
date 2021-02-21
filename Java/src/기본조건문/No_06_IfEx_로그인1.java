package 기본조건문;

import java.util.Scanner;

/*
 * 로그인[1단계](01:31.69)
 * 1.ID와 PW를 입력받는다
 * 2.입력받은 데이터와 DB데이터를 비교해 로그인 처리를 진행
 */
public class No_06_IfEx_로그인1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int dbId = 1234;
		int dbPw = 1111;
		
		System.out.print("ID 입력 : ");
		int id = scan.nextInt();
		
		System.out.print("PW 입력 : ");
		int pw = scan.nextInt();
		
		if (dbId == id && dbPw == pw) {
			System.out.println("로그인 성공");
		} else {
			System.out.println("로그인 실패");
		}

	}

}
