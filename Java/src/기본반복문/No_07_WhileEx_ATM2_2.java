package �⺻�ݺ���;

import java.util.Scanner;

/*
 * ATM[2_2�ܰ�] (�ҿ�ð� 11:44.73)
 * 1.�α���
 *  - �α��� ��, �� �α��� �Ұ�
 *  - �α׾ƿ� ���¿����� �̿� ����
 * 2.�α׾ƿ�
 *  - �α��� ��, �̿� ����
 * 3.�Ա�
 *  - �Ա��� �ݾ��� �Է¹޾�, dbMoney1�� �Ա�
 * 4.���
 *  - ����� �ݾ��� �Է¹޾�, dbMoney1���� ���
 *  - ��, ����� �ݾ��� dbMoney1 �ܾ��� �ʰ��� ��� ��ݺҰ�
 * 5.��ü
 *  - yourAcc ���¹�ȣ�� �Է¹޾�, ��ü
 *  - ��ü�� �ݾ��� dbMoney1 �ܾ��� �ʰ��� ��� ��ü �Ұ�
 *  - ��ü �� dbMoney2 �ܾ� ����
 * 6.��ȸ
 *  - dbMoney1�� dbMoney2 �ܾ� ��� ���
 * 0.����
 */
public class No_07_WhileEx_ATM2_2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int dbAcc1 = 1111;
		int dbPw1 = 1234;
		int dbMoney1 = 50000;
		
		int dbAcc2 = 2222;
		int dbPw2 = 2345;
		int dbMoney2 = 70000;
		
		int log = -1;
		
		while (true) {
			
			System.out.println("==================");
			System.out.print("������ : ");
			if (log == -1) {
				System.out.println("����");
			} else if (log == 1) {
				System.out.println(dbAcc1 + "��");
			} else if (log == 2) {
				System.out.println(dbAcc2 + "��");
			}
			System.out.println("==================");
			
			System.out.println("1.�α���");
			System.out.println("2.�α׾ƿ�");
			System.out.println("3.�Ա�");
			System.out.println("4.���");
			System.out.println("5.��ü");
			System.out.println("6.��ȸ");
			System.out.println("0.����");
			
			System.out.print("�޴� ���� : ");
			int sel = scan.nextInt();
			
			if (sel == 1) {
				
				if (log != -1) {
					System.out.println("[�ý���]�α׾ƿ� ��, �̿� �����մϴ�");
					continue;
				}
				
				System.out.print("[�α���]ID �Է� : ");
				int myId = scan.nextInt();
				
				if (myId == dbAcc1) {
					
					System.out.print("[�α���]PW �Է� : ");
					int myPw = scan.nextInt();
					
					if (myPw == dbPw1) {
						log = 1;
						System.out.println(dbAcc1 + "��, ȯ���մϴ�");
					} else {
						System.out.println("[�ý���]��й�ȣ�� Ȯ���ϼ���");
					}
					
				} else if (myId == dbAcc2) {
					
					System.out.print("[�α���]PW �Է� : ");
					int myPw = scan.nextInt();
					
					if (myPw == dbPw2) {
						log = 2;
						System.out.println(dbAcc2 + "��, ȯ���մϴ�");
					} else {
						System.out.println("[�ý���]��й�ȣ�� Ȯ���ϼ���");
					}
					
				} else {
					System.out.println("[�ý���]ID�� Ȯ���ϼ���");
				}
				
			} else if (sel == 2) {
				if (log == -1) {
					System.out.println("[�ý���]�α��� ��, �̿� �����մϴ�");
					continue;
				}
				
				log = -1;
				
				System.out.println("�α׾ƿ� �Ǿ����ϴ�");
				
			} if (sel == 3) {
				
				if (log == -1) {
					System.out.println("[�ý���]�α��� ��, �̿� �����մϴ�");
					continue;
				}
				
				System.out.print("[�Ա�]�ݾ� �Է� : ");
				int money = scan.nextInt();
				
				dbMoney1 += money;
				
				System.out.println("�Ա� �Ϸ�");
				
			} else if (sel == 4) {
				
				if (log == -1) {
					System.out.println("[�ý���]�α��� ��, �̿� �����մϴ�");
					continue;
				}
				
				System.out.print("[���]�ݾ� �Է� : ");
				int money = scan.nextInt();
				
				if (money > dbMoney1) {
					System.out.println("[�ý���]�ܾ��� �����մϴ�");
				} else {
					dbMoney1 -= money;
					
					System.out.println("��� �Ϸ�");
				}
				
			} else if (sel == 5) {
				
				if (log == -1) {
					System.out.println("[�ý���]�α��� ��, �̿� �����մϴ�");
					continue;
				}
				
				System.out.print("[��ü]���¹�ȣ �Է� : ");
				int yourAcc = scan.nextInt();
				
				if (yourAcc == dbAcc2) {
					System.out.print("[��ü]�ݾ� �Է� : ");
					int money = scan.nextInt();
					
					if (money > dbMoney1) {
						System.out.println("[�ý���]�ܾ��� �����մϴ�");
					} else {
						dbMoney1 -= money;
						dbMoney2 += money;
						
						System.out.println("��ü �Ϸ�");
					}
				} else {
					System.out.println("[�ý���]�ش� ���´� ���� �����Դϴ�");
				}
				
			} else if (sel == 6) {
				
				if (log == -1) {
					System.out.println("[�ý���]�α��� ��, �̿� �����մϴ�");
					continue;
				}
				
				System.out.println(dbAcc1 + "���� �ܾ� = " + dbMoney1 + "��");
				System.out.println(dbAcc2 + "���� �ܾ� = " + dbMoney2 + "��");
				
			} else if (sel == 0) {
				System.out.println("���α׷� ����");
				break;
			}
			
		}

	}

}
