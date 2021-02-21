package 기본조건문;

import java.util.Scanner;

/*
 * 놀이기구 이용제한(01:54.78)
 * 1.키를 입력
 * 2.입력받은 키가 120 이상이면, 놀이기구 이용 가능
 * 3.키가 120 미만이면 놀이기구 이용 불가
 * 4.단, 부모님과 함께 온 경우, 놀이기구 이용 가능
 */
public class No_09_IfEx_놀이기구이용 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("키 입력 : ");
		int height = scan.nextInt();
		
		if (height >= 120) {
			System.out.println("이용 가능합니다");
		} else {
			System.out.print("부모님과 함께 오셨나요(Yes:1, No:2)");
			int answer = scan.nextInt();
			
			if (answer == 1) {
				System.out.println("이용 가능합니다");
			} else if (answer == 2) {
				System.out.println("이용 불가능합니다");
			}
		}

	}

}
