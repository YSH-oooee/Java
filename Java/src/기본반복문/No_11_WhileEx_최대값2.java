package �⺻�ݺ���;

import java.util.Scanner;

/*
 * �ִ밪[2�ܰ�] (�ҿ�ð� 04:02.58)
 * 1.3ȸ �ݺ��Ͽ� ������ �Է¹޴´�
 * 2.�Է¹��� 3���� ���� ��, ���� ū ���� ���
 */
public class No_11_WhileEx_�ִ밪2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int max = 0;
		
		int i = 0;
		while (i < 3) {
			
			System.out.print("����" + (i + 1) + " �Է� : ");
			int x = scan.nextInt();
			
			if (max < x) {
				max = x;
			}
			
			i++;			
		}
		
		System.out.println("�ִ밪 : " + max);

	}

}
