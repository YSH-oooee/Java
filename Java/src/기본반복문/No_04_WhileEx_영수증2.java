package �⺻�ݺ���;

import java.util.Scanner;

/*
 * ������ ���[2�ܰ�] (�ҿ�ð� 05:58.05)
 * 1.5�� �ֹ��� �޴´�
 * 2.�ֹ��� ���� ��, ���� �Է¹޴´�
 * 3.�� �޴��� �ֹ� ������ �ѱݾ��� ����Ѵ�
 * ��)
 * �޴� ���� : 1
 * �޴� ���� : 1
 * �޴� ���� : 2
 * �޴� ���� : 2
 * �޴� ���� : 3
 * �� �ݾ� = 31300��
 * ���� �Է� : 32000
 * === �Ե����� ������ ===
 * 1. �Ұ�� ���� : 2��
 * 2. ����    ���� : 2��
 * 3. ��         �� : 1��
 * 4. ��   ��   �� : 31300��
 * 5. ��         �� : 700��
 */
public class No_04_WhileEx_������2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int price1 = 8700;
		int price2 = 6200;
		int price3 = 1500;
		int cnt1 = 0;
		int cnt2 = 0;
		int cnt3 = 0;
		
		System.out.println("=== �Ե����� ===");
		System.out.println("1.�Ұ����� : " + price1 + "��");
		System.out.println("2.�� ��  ���� : " + price2 + "��");
		System.out.println("3.��         �� : " + price3 + "��");
		
		int i = 1;
		while (i < 6) {
			
			System.out.print("�޴� ���� : ");
			int sel = scan.nextInt();
			
			if (sel == 1) {
				cnt1++;
			} else if (sel == 2) {
				cnt2++;
			} else if (sel == 3) {
				cnt3++;
			}
			
			i++;
		}
		
		int tot = (price1 * cnt1) + (price2 * cnt2) + (price3 * cnt3);
		
		System.out.println("�� �ݾ� : " + tot + "��");		
		System.out.print("���� �Է� : ");
		int money = scan.nextInt();
		
		if (money < tot) {
			System.out.println("������ �����մϴ�");
		} else {
			int change = money - tot;
			
			System.out.println("=== �Ե����� ������ ===");
			System.out.println("1.�Ұ����� : " + cnt1 + "��");
			System.out.println("2.�� ��  ���� : " + cnt2 + "��");
			System.out.println("3.��         �� : " + cnt3 + "��");
			System.out.println("4.��   ��   �� : " + tot + "��");
			System.out.println("5.��         �� : " + change + "��");
			
		}
		
		

	}

}
