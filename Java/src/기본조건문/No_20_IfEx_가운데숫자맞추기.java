package �⺻���ǹ�;

import java.util.Random;
import java.util.Scanner;

/*
 * ��� ���� ���߱�(02:50.33)
 * 1.150~250 ����� ���� ���� ����
 * 2.���� ������ ��� ���ڸ� ���ߴ� ����
 * ��) 249 : 4
 */
public class No_20_IfEx_������ڸ��߱� {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		int rNum = ran.nextInt(100) + 150;
		
		System.out.println("���� = " + rNum + "�� ��� ����");
		System.out.print("���� �Է� : ");
		int answer = scan.nextInt();
		
		int center = rNum % 100;
		center = center / 10;
		
		System.out.println("���� : " + center);
		
		if (center == answer) {
			System.out.println("����");
		} else {
			System.out.println("��");
		}

	}

}
