package �⺻���ǹ�;

import java.util.Scanner;
/*
 * ��)Up & Down(01:43.46)
 * com = 8
 * me�� com�� ���ڸ� ���ߴ� ����
 * ������ ���� �޼����� ���
 * 1)me < com : Up!
 * 2)me = com : Bingo!
 * 3)me > com : Down!
 */
public class No_04_IfEx_���شٿ� {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int com = 8;
		
		while (true) {
			
			System.out.print("me �Է� : ");
			int me = scan.nextInt();
			
			if (me < com) {
				System.out.println("Up!");
			} else if (me == com) {
				System.out.println("Bingo!");
				break;
			} else if (me > com) {
				System.out.println("Down!");
			}
			
		}

	}

}
