package �⺻���ǹ�;

import java.util.Random;
import java.util.Scanner;

/*
 * ����(0)����(1)��(2) ����[2�ܰ�](04:08.30)
 * 1.com�� 0~2 ������ ���� ���� ����
 * 2.me�� 0~2 ������ ���ڸ� �Է¹޴´�
 * 3.com�� me�� ���Ͽ�,
 * 		1)����
 * 		2)me�� �̰��
 * 		3)me�� ����		�� ����Ѵ�
 */
public class No_17_RandomEx_����������2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		int com = ran.nextInt(3);
		
		System.out.print("����(0)����(1)��(2) �Է� : ");
		int me = scan.nextInt();
		
		System.out.print("com = ");
		if (com == 0) {
			System.out.println("����");
		} else if (com == 1) {
			System.out.println("����");
		} else if (com == 2) {
			System.out.println("��");
		}
		
		if (me == 0 && com == 1 || me == 1 && com == 2 || me == 2 && com == 0) {
			System.out.println("me�� ����");
		} else if (me == 0 && com == 2 || me == 1 && com == 0 || me == 2 && com == 1) {
			System.out.println("me�� �̰��");
		} else {
			System.out.println("����");
		}

	}

}
