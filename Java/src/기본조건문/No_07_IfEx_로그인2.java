package 기본조건문;

import java.util.Scanner;

/*
 * 로그인[2단계](01:54.25)
 * 1.ID와 PW를 입력받아 회원가입 진행
 * 2.로그인 실행
 * 3.회원가입 시, 저장된 데이터와 로그인 시, 입력받은 데이터를 비교한다
 */
public class No_07_IfEx_로그인2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int dbId = 0;
		int dbPw = 0;
		
		System.out.print("[회원가입]ID 입력 : ");
		dbId = scan.nextInt();
		
		System.out.print("[회원가입]PW 입력 : ");
		dbPw = scan.nextInt();
		
		System.out.print("[로그인]ID 입력 : ");
		int id = scan.nextInt();
		
		System.out.print("[로그인]PW 입력 : ");
		int pw = scan.nextInt();
		
		if (dbId == id && dbPw == pw) {
			System.out.println("로그인 성공");
		} else {
			System.out.println("로그인 실패");
		}

	}

}
