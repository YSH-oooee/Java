package �⺻�ݺ���;

import java.util.Scanner;

/*
 * �Ҽ�ã��[1�ܰ�] (�ҿ�ð� 02:40.53)
 * 1.�Ҽ���, 1�� �ڽ����θ� ���������� ��
 * 2.��)2, 3, 5, 7, 11, 13...
 * 3.��Ʈ
 *  - �ش� ���ڸ� 1���� �ڽű��� ����
 *  - �������� 0�� ������ ī��Ʈ ����
 *  - ī��Ʈ ���� 2�̸� �Ҽ�
 */
public class No_10_WhileEx_�Ҽ�ã��1 {

	public static void main(String[] args) {
		
		//���� �Ѱ��� �Է¹޾�, �ش� ���ڰ� �Ҽ����� �ƴ��� �Ǻ�
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("���� �Է� : ");
		int num = scan.nextInt();
		
		int cnt = 0;
		
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				cnt++;
			}
		}
		
		if (cnt == 2) {
			System.out.println("�Ҽ�");
		} else {
			System.out.println("����");
		}
		
	}

}
