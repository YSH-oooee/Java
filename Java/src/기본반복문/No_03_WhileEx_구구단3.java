package �⺻�ݺ���;

import java.util.Random;
import java.util.Scanner;

/*
 * ������ ����[3�ܰ�] (�ҿ�ð� 03:42.12)
 * 1.������ ������ 5ȸ �ݺ�
 * 2.������ ���߸� 20��
 * 3.���� ���� ��, ���� ���
 */
public class No_03_WhileEx_������3 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		int score = 20;
		int cnt = 0;
		
		int i = 1;
		
		while (i <= 5) {

			int x = ran.nextInt(8) + 2;
			int y = ran.nextInt(9) + 1;
			
			int answer = x * y;
			
			System.out.println("[" + i + "]" + x + " * " + y + " = ?");
			int me = scan.nextInt();
			
			if (me == answer) {
				cnt++;
			}
			i++;
		}
		
		int tot = score * cnt;
		
		System.out.println("���� = " + tot + "��");

	}

}
