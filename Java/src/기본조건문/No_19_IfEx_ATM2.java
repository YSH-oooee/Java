package �⺻���ǹ�;

import java.util.Scanner;

/*
 * 1.�α��� >> 1.�Ա� 2.��� 3.��ȸ 0.�ڷΰ���
 */
public class No_19_IfEx_ATM2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int cash = 20000;		//���� ���� : �Ա� �� ����, ��� �� ����
		int balance = 30000;	//���� �ܾ� : �Ա� �� ����, ��� �� ����
		int account = 11111;	//�α��� ��, ���
		int password = 1234;	//�α��� ��, ���
		
		while (true) {
			
			System.out.println("===MEGA ATM===");
			System.out.println("1.�α��� 2.����");
			
			System.out.print("�޴� ���� : ");
			int sel = scan.nextInt();
			
			if (sel == 1) {
				
				System.out.print("[�α���]���¹�ȣ �Է� : ");
				int myAcc = scan.nextInt();
				
				if (myAcc == account) {
					System.out.print("[�α���]��й�ȣ �Է� : ");
					int myPw = scan.nextInt();
					
					if (myPw == password) {
						while (true) {
							
							System.out.println("1.�Ա� 2.��� 3.��ȸ 0.�ڷΰ���");
							int choice = scan.nextInt();
							
							if (choice == 1) {
								System.out.print("[�Ա�]�ݾ� �Է� : ");
								int money = scan.nextInt();
								
								if (money > cash) {
									System.out.println("�ܾ��� �����մϴ�");
								} else {
									cash -= money;
									balance += money;
									System.out.println("�Ա� �Ϸ�");
								}
							} else if (choice == 2) {
								System.out.print("[���]�ݾ� �Է� : ");
								int money = scan.nextInt();
								
								if (money > balance) {
									System.out.println("�ܾ��� �����մϴ�");
								} else {
									cash += money;
									balance -= money;
									System.out.println("��� �Ϸ�");
								}
							} else if (choice == 3) {
								System.out.println("���� ���� : " + cash + "��");
								System.out.println("���� �ܾ� : " + balance + "��");
							} else if (choice == 0) {
								break;
							}
							
						}
					} else {
						System.out.println("��й�ȣ�� ���� �ʽ��ϴ�");
					}
				} else {
					System.out.println("���¹�ȣ�� ���� �ʽ��ϴ�");
				}
				
			} else if (sel == 2) {
				System.out.println("���α׷� ����");
				break;
			}
			
		}

	}

}
