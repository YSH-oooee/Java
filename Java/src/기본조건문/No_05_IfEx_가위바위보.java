package �⺻���ǹ�;

import java.util.Scanner;

/*
 * ����(0)����(1)��(2) ����[1�ܰ�](02:20.59)
 * 1.com�� ����(1)�� �� �� �ִ�
 * 2.me�� 0~2 ������ ���ڸ� �Է¹޴´�
 * 3.com�� me�� ���Ͽ�,
 * 		1)����
 * 		2)me�� �̰��
 * 		3)me�� ����		�� ����Ѵ�
 */
public class No_05_IfEx_���������� {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int com = 1;
		
		System.out.print("����(0)����(1)��(2) �Է� : ");
		int me = scan.nextInt();
		
		if (me == com) {
			System.out.println("����");
		} else if (me < com) {
			System.out.println("me�� ����");
		} else if (me > com) {
			System.out.println("me�� �̰��");
		}

	}

}
