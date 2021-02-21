package �迭�⺻;

import java.util.Random;
import java.util.Scanner;

/*
 * �Ｎ���� (�ҿ�ð� 03:08.89)
 * 1.���� 7�� �������� 3�� ������ ��÷
 */
public class No_06_ArrayEx_�Ｎ���� {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		int[] lotto = new int[8];
		
		for (int i = 0; i < 3; i++) {
			int r = ran.nextInt(8);
			if (lotto[r] == 0) {
				lotto[r] = 7;
			} else {
				i--;
			}
		}
		
		System.out.print("Lotto = [ ");
		for (int i = 0; i < lotto.length; i++) {
			System.out.print(lotto[i] + " ");
		} System.out.println("]");
		
		while (true) {
			
			System.out.println("1.���Ȯ��");
			System.out.println("2.����");
			
			System.out.print("�޴� ���� : ");
			int sel = scan.nextInt();
			
			if (sel == 1) {
				
				int cnt = 0;
				for (int i = 0; i < lotto.length; i++) {
					if (cnt == 3) {
						break;
					}
					if (lotto[i] == 7) {
						cnt++;
					} else {
						cnt = 0;
					}
				}
				
				if (cnt == 3) {
					System.out.println("��÷!");
				} else {
					System.out.println("��÷");
				}
				
			} else if (sel == 2) {
				System.out.println("����");
				break;
			}
			
		}

	}

}
