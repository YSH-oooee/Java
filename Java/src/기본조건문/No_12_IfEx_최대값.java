package �⺻���ǹ�;

import java.util.Scanner;

/*
 * �ִ밪 ���ϱ�[1�ܰ�]
 * 1.���� 3�� �Է�
 * 2.�Է¹��� 3���� ���� ��
 * 3.���� ū ���� ���
 */
public class No_12_IfEx_�ִ밪 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("����1 �Է� : ");
		int num1 = scan.nextInt();
		
		System.out.print("����2 �Է� : ");
		int num2 = scan.nextInt();
		
		System.out.print("����3 �Է� : ");
		int num3 = scan.nextInt();
		
		int max = num1;
		
		if (max < num2) {
			max = num2;
		}
		if (max < num3) {
			max = num3;
		}
		
		System.out.println("�ִ밪 = " + max);

	}

}
