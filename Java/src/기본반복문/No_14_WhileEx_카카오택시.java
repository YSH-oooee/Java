package �⺻�ݺ���;

import java.util.Random;
import java.util.Scanner;

/*
 * īī���ý� (�ҿ�ð� 09:38.64)
 * 1.�մ��� �¿� ���������� �̵�
 * 2.-10~10 ������ �������� 2���� ������ �������� ����
 * 3.�޴�
 *  1)�ӵ� ���� : 1~3���� ����
 *  2)���� ���� : ��(1)��(2)��(3)��(4)
 *  3)�̵��ϱ�  : ������ ��������, ������ �ӵ���ŭ �̵�
 * 4.�Ÿ� 2ĭ ��, 50���� �߰��Ǿ� �ѿ�� ���
 */
public class No_14_WhileEx_īī���ý� {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		int desX = 0, desY = 0;
		int x = 0, y = 0;
		int dir = 0;
		int speed = 0;
		int distance = 0;
		int fee = 0;
		
		desX = ran.nextInt(21) - 10;
		desY = ran.nextInt(21) - 10;
		
		while (true) {
			
			System.out.println("==īī���ý�==");
			System.out.println("�� �� ��  : " + desX + "," + desY);
			System.out.println("�� �� ġ  : " + x + "," + y);
			System.out.println("��      �� : " + dir);
			System.out.println("��      �� : " + speed);
			System.out.println("�̵��Ÿ� : " + distance);
			System.out.println("===========");
			
			if (desX == x && desY == y) {
				System.out.println("�����߽��ϴ�");
				break;
			}
			
			System.out.println("1.�ӵ�����");
			System.out.println("2.���⼳��");
			System.out.println("3.�̵��ϱ�");
			
			System.out.print("�޴� ���� : ");
			int sel = scan.nextInt();
			
			if (sel == 1) {
				
				System.out.print("�ӵ�(1~3) �Է� : ");
				speed = scan.nextInt();
				
			} else if (sel == 2) {
				
				System.out.print("��(1)��(2)��(3)��(4) �Է� : ");
				dir = scan.nextInt();
				
			} else if (sel == 3) {
				
				if (dir == 1) {
					x -= speed;
				} else if (dir == 2) {
					x += speed;
				} else if (dir == 3) {
					y += speed;
				} else if (dir == 4) {
					y -= speed;
				}
				
				distance += speed;
				
			}
			
		}
		
		if (distance % 2 == 0) {
			fee = distance / 2 * 50;
		} else {
			fee = (distance / 2 * 50) + 50;
		}
		
		System.out.println("�� ��� : " + fee + "��");

	}

}
