package �⺻���ǹ�;

import java.util.Scanner;

/*
 * ATM[1�ܰ�] : ��ü�ϱ�(02:02.28)
 * 1.��ü�� ���¹�ȣ �Է�
 * 2.���¹�ȣ�� ��ġ�ϸ�, ��ü �ݾ� �Է�
 * 3.��ü �ݾװ� �������� ���Ͽ� ��� ���
 */
public class No_18_IfEx_ATM1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int myAcc = 1234;
		int myMoney = 8700;
		
		int yourAcc = 4321;
		int yourMoney = 12000;
		
		while (true) {
			
			System.out.println("myMoney = " + myMoney);
			System.out.println("yourMonry = " + yourMoney);
			
			System.out.print("���¹�ȣ �Է� : ");
			int acc = scan.nextInt();
			
			if (acc == yourAcc) {
				System.out.print("��ü �ݾ� �Է� : ");
				int money = scan.nextInt();
				
				if (money > myMoney) {
					System.out.println("�ܾ��� �����մϴ�");
				} else {
					myMoney -= money;
					yourMoney += money;
					
					System.out.println("��ü �Ϸ�");
					break;
				}
			} else if (acc != yourAcc) {
				System.out.println("�ش� ���´� ���� �����Դϴ�");
			}
			
		}

	}

}
