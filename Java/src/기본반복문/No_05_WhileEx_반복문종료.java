package �⺻�ݺ���;

import java.util.Scanner;

/*
 * �ݺ��� ����(-100) (�ҿ�ð� 01:06.83)
 * 1.���� �ݺ��� �ϸ鼭 ���ڸ� �Է� �޴´�
 * 2.�Է��� ���ڰ� -100�̸�, ���α׷� ����
 */
public class No_05_WhileEx_�ݺ������� {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		while (true) {
			
			System.out.print("���� �Է� : ");
			int num = scan.nextInt();
			
			if (num == -100) {
				System.out.println("���α׷� ����");
				break;
			}			
		}

	}

}
