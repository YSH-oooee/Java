package �⺻���ǹ�;

import java.util.Random;
import java.util.Scanner;

/*
 * ������ ��ȣ ���߱� ����(05:54.20)
 * 1.1~10 ������ ���� ���� 2�� ����
 * 2.1~4 ������ ���� ���� 1�� ����
 * 3.2�� ���ڴ� ������ ��ȣ
 *  1)+ 2)- 3)* 4)%
 * 4.������ ��ȣ�� �����
 *  ��) 3 ? 4 = 7
 *  1)+ 2)- 3)* 4)%
 *  ���� : 1��
 */
public class No_23_IfEx_�����ڱ�ȣ {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		int x = ran.nextInt(10) + 1;
		int y = ran.nextInt(10) + 1;		
		int z = ran.nextInt(4) + 1;
		int answer = 0;
		
		if (z == 1) {
			answer = x + y;
			System.out.println(x + " ? " + y + " = " + answer);
		} else if (z == 2) {
			answer = x - y;
			System.out.println(x + " ? " + y + " = " + answer);
		} else if (z == 3) {
			answer = x * y;
			System.out.println(x + " ? " + y + " = " + answer);
		} else if (z == 4) {
			answer = x % y;
			System.out.println(x + " ? " + y + " = " + answer);
		}
		
		while (true) {
			
			System.out.println("1)+  2)-  3)*  4)%");
			System.out.print("���� �Է� : ");
			int myAnswer = scan.nextInt();
			
			if (myAnswer == z) {
				System.out.println("����");
				break;
			} else {
				System.out.println("��");
			}
			
		}

	}

}
