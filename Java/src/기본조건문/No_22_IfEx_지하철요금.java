package �⺻���ǹ�;

import java.util.Scanner;

/*
 * ����ö ��� ���(06:30.18)
 * 1.�̿��� ������ ���� �Է�
 * 2.������ ���� ���� ����� ����
 * 3.���ǥ
 *  1) 1~5   : 500��
 *  2) 6~10  : 600��
 *  3) 11,12 : 650��(10������ ���Ĵ� 2�����帶�� 50�� �߰�)
 *  4) 13,14 : 700��(10������ ���Ĵ� 2�����帶�� 50�� �߰�)
 */
public class No_22_IfEx_����ö��� {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int fee = 600;
		
		System.out.print("������ �� �Է� : ");
		int stop = scan.nextInt();
		
		System.out.print("��� = ");
		if (0 < stop && stop < 6) {
			System.out.println("500��");
		}
		if (5 < stop && stop < 11) {
			System.out.println(fee + "��");
		}
		if (10 < stop) {
			int x = stop % 10;
			x = (x + 1) / 2;
			
			int add = x * 50;
			int tot = fee + add;
			
			System.out.println(tot + "��");
		}

	}

}
