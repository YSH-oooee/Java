package �⺻���ǹ�;

import java.util.Random;
import java.util.Scanner;

/*
 * ���ΰ���(01:53.50)
 * 1.0 �Ǵ� 1�� ���� ���� ����
 * 2.0�� ���� �ո�, 1�� ���� �޸�
 * 3.������ �յ޸��� ���ߴ� ����
 */
public class No_13_RandomEx_���ΰ��� {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();

		System.out.print("���� ��(0) ��(1) �Է� : ");
		int me = scan.nextInt();
		
		int coin = ran.nextInt(2);
		
		if (coin == 0) {
			System.out.println("��");
		} else if (coin == 1) {
			System.out.println("��");
		}
		
		if (me == coin) {
			System.out.println("����");
		} else {
			System.out.println("��");
		}

	}

}
