package �⺻���ǹ�;

import java.util.Scanner;

/*
 * ������ ���[1�ܰ�](04:57.89)
 * 1.�޴��� ���
 * 2.����ڴ� �ֹ��Ϸ��� �޴��� ��ȣ�� �Է�
 * 3.���� �Է�
 * 4.�Է¹��� ���ݰ� �޴� ������ ��, ������ ���
 * 5.��, ������ ������ ��� ���� ���� �޼��� ���
 */
public class No_11_IfEx_��������� {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int price1 = 8700;
		int price2 = 6200;
		int price3 = 1500;
		
		System.out.println("===�Ե�����===");
		System.out.println("1.�Ұ�� ���� : ");
		System.out.println("2.�� ��  �� �� : ");
		System.out.println("3.��          �� : ");
		
		System.out.print("�޴� ���� : ");
		int sel = scan.nextInt();
		
		int tot = 0;
		
		if (sel == 1) {
			tot = price1;
		} else if (sel == 2) {
			tot = price2;
		} else if (sel == 3) {
			tot = price3;
		}
		
		System.out.println("�Ѿ� = " + tot + "��");
		System.out.print("���� �Է� : ");
		int money = scan.nextInt();
		
		int change = money - tot;
		
		if (money < tot) {
			System.out.println("������ �����մϴ�");
		} else {
			System.out.println("===������===");
			System.out.println("�Ѿ�  " + tot);
			System.out.println("�ܵ�  " + change);
		}
		
	}

}
