package �⺻���ǹ�;

import java.util.Random;
import java.util.Scanner;

/*
 * ������ ����[2�ܰ�](01:59.38)
 * 1.������ ���� ������ ���� ���� 2���� �����ϰ� ����
 * 2.����� ���ڷ� ������ ���� ���
 * 3.���� �Է�
 * 4.������ ���Ͽ� ���� �Ǵ� �� ���
 */
public class No_16_RandomEx_������2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		int x = ran.nextInt(8) + 2;
		int y = ran.nextInt(9) + 1;
		int answer = x * y;
		
		System.out.println(x + " * " + y + " = ?");
		int me = scan.nextInt();
		
		if (me == answer) {
			System.out.println("����");
		} else {
			System.out.println("��");
		}

	}

}
