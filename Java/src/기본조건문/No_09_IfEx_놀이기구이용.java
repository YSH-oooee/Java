package �⺻���ǹ�;

import java.util.Scanner;

/*
 * ���̱ⱸ �̿�����(01:54.78)
 * 1.Ű�� �Է�
 * 2.�Է¹��� Ű�� 120 �̻��̸�, ���̱ⱸ �̿� ����
 * 3.Ű�� 120 �̸��̸� ���̱ⱸ �̿� �Ұ�
 * 4.��, �θ�԰� �Բ� �� ���, ���̱ⱸ �̿� ����
 */
public class No_09_IfEx_���̱ⱸ�̿� {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Ű �Է� : ");
		int height = scan.nextInt();
		
		if (height >= 120) {
			System.out.println("�̿� �����մϴ�");
		} else {
			System.out.print("�θ�԰� �Բ� ���̳���(Yes:1, No:2)");
			int answer = scan.nextInt();
			
			if (answer == 1) {
				System.out.println("�̿� �����մϴ�");
			} else if (answer == 2) {
				System.out.println("�̿� �Ұ����մϴ�");
			}
		}

	}

}
