package �迭�⺻;

import java.util.Scanner;

/*
 * ��ȭ�� �¼����� (�ҿ�ð� 04:11.79)
 * 1.�¼���ȣ(index)�� �Է¹޾� ����
 * 2.���Ű� �Ϸ�Ǹ� �ش� �¼� ���� 1�� ����
 * 3.�̹� ���Ű� �Ϸ�� �¼��� �籸���� �� ����
 * 4.�� �¼���, 12000��
 * 5.���α׷� ���� ��, �ش� ��ȭ���� �� ������� ���
 */
public class No_05_ArrayEx_��ȭ���¼����� {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] seat = new int[7];
		int cnt = 0;
		int ticket = 12000;
		
		while (true) {
			
			System.out.print("�¼� = [ ");
			for (int i = 0; i < seat.length; i++) {
				if (seat[i] == 0) {
					System.out.print("�� ");
				} else {
					System.out.print("�� ");
				}
			} System.out.println("]");
						
			System.out.println("=�ް� ��ȭ��=");
			System.out.println("1.�¼�����");
			System.out.println("2.����");
			
			System.out.print("�޴� ���� : ");
			int sel = scan.nextInt();
			
			if (sel == 1) {
				
				System.out.print("�¼� ��ȣ(1~7) �Է� : ");
				int idx = scan.nextInt() - 1;
				
				if (seat[idx] == 0) {
					
					seat[idx] = 1;
					cnt++;
					System.out.println("���Ű� �Ϸ�Ǿ����ϴ�");
					
				} else {
					System.out.println("�ش� �¼��� ���Ű� �Ϸ�� �¼��Դϴ�");
				}
				
			} else if (sel == 2) {
				break;
			}
			
		}
		
		System.out.println("�� ����� = " + (cnt * ticket) + "��");
		
	}

}
