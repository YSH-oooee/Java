package �⺻�ݺ���;

import java.util.Scanner;

/*
 * ���θ� �ڷΰ��� (�ҿ�ð� 05:56.78)
 * 1.�����Ƿ�
 *  1)����
 *  2)����
 *  3)�ڷΰ���
 * 2.�����Ƿ�
 *  1)����
 *  2)����
 *  3)�ڷΰ���
 * 3.����
 */
public class No_13_WhileEx_�ڷΰ��� {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		while (true) {
			
			System.out.println("1.�����Ƿ�");
			System.out.println("2.�����Ƿ�");
			System.out.println("3.����");
			
			System.out.print("�޴� ���� : ");
			int sel = scan.nextInt();
			
			if (sel == 1) {
				
				while (true) {
					
					System.out.println("1)����");
					System.out.println("2)����");
					System.out.println("3)�ڷΰ���");
					
					System.out.print("��ǰ ���� : ");
					int choice = scan.nextInt();
					
					if (choice == 1) {
						System.out.println("�����Դϴ�...");
					} else if (choice == 2) {
						System.out.println("�����Դϴ�...");
					} else if (choice == 3) {
						break;
					}
					
				}
				
			} else if (sel == 2) {
				
				while (true) {
					
					System.out.println("1)����");
					System.out.println("2)����");
					System.out.println("3)�ڷΰ���");
					
					System.out.print("��ǰ ���� : ");
					int choice = scan.nextInt();
					
					if (choice == 1) {
						System.out.println("�����Դϴ�...");
					} else if (choice == 2) {
						System.out.println("�����Դϴ�...");
					} else if (choice == 3) {
						break;
					}
					
				}
				
			} else if (sel == 3) {
				System.out.println("�����մϴ�");
				break;
			}
			
		}

	}

}
