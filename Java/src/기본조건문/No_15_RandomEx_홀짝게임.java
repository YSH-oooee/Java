package �⺻���ǹ�;

import java.util.Random;
import java.util.Scanner;

/*
 * Ȧ¦����(02:36.02)
 * 1.1~100 ������ ���� ���� ����
 * 2.����� ���� ���ڸ� �����ְ�
 * 3.�ش� ���ڰ� Ȧ������, ¦������ ���ߴ� ����
 */
public class No_15_RandomEx_Ȧ¦���� {

	public static void main(String[] args) {
		
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		
		int r = ran.nextInt(100) + 1;
		
		int answer = 0;
		if (r % 2 == 0) {
			answer = 2;
		} else if (r % 2 == 1) {
			answer = 1;
		}
		
		System.out.println("[" + r + "]");
		System.out.println("1.Ȧ��");
		System.out.println("2.¦��");
		
		System.out.print("��ȣ ���� : ");
		int choice = scan.nextInt();
		
		if (choice == answer) {
			System.out.println("����");
		} else {
			System.out.println("��");
		}

	}

}
