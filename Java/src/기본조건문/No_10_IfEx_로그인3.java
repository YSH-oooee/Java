package 기본조건문;

import java.util.Scanner;

/*
 * 로그인[3단계](01:48.67)
 * 1.ID를 입력받아, DBID와 일치할 경우에만 PW를 입력할 수 있다
 * 2.ID가 틀린 경우, ID를 확인하라는 메세지 출력
 * 3.PW가 틀린 경우, PW를 확인하라는 메세지 출력
 * 4.ID와 PW가 모두 일치할 경우, 로그인 성공 메세지 출력
 */
public class No_10_IfEx_로그인3 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int dbId = 1234;
		int dbPw = 1111;
		
		System.out.print("ID 입력 : ");
		int id = scan.nextInt();
		
		if (dbId == id) {
			System.out.print("PW 입력 : ");
			int pw = scan.nextInt();
			
			if (dbPw == pw) {
				System.out.println("로그인 성공");
			} else {
				System.out.println("비밀번호를 확인하세요");
			}
		} else {
			System.out.println("ID를 확인하세요");
		}

	}

}
