package �⺻���ǹ�;

import java.util.Scanner;

/*
 * �����ܰ���[1�ܰ�](02:03.55)
 * 1.������ ���� ������ ���� ���� 2���� �Է¹޴´�
 * 2.�Է¹��� ���ڷ� ������ ������ ���
 * 3.������ �ش��ϴ� ������ �Է¹޴´�
 * 4.������ ���Ͽ�, ���� �Ǵ� ���� ���
 */
public class No_08_IfEx_������1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("x �Է� : ");
		int x = scan.nextInt();
		
		System.out.print("y �Է� : ");
		int y = scan.nextInt();
		
		System.out.println(x + " * " + y + " = ?");
		System.out.print("���� �Է� : ");
		int answer = scan.nextInt();
		
		if (x * y == answer) {
			System.out.println("����!");
		} else {
			System.out.println("��!");
		}

	}

}
