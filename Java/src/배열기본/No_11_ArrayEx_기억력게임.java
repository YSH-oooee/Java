package �迭�⺻;

import java.util.Random;
import java.util.Scanner;

/*
 * ���°��� (�ҿ�ð� 08:00.68)
 * 1.���� ������ ��ġ�� 2�� �Է��� ������ ���ߴ� ����
 * 2.������ ���߸� back������ �ش� ���ڸ� ����, back�迭�� ��� ���� ä������ ���� ����
 */
public class No_11_ArrayEx_���°��� {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		int[] front = {1, 1, 2, 2, 3, 3, 4, 4, 5, 5};
		int[] back = new int[10];
		
		for (int i = 0; i < 500; i++) {
			int r = ran.nextInt(10);
			int temp = front[0];
			front[0] = front[r];
			front[r] = temp;
		}
		
		System.out.print("���� = [ ");
		for (int i = 0; i < front.length; i++) {
			System.out.print(front[i] + " ");
		} System.out.println("]");
				
		int cnt = 0;
		while (cnt < 5) {
			
			for (int i = 0; i < front.length; i++) {
				if (back[i] == 0) {
					System.out.print("�� ");
				} else {
					System.out.print(front[i] + " ");
				}
			} System.out.println();
			
			System.out.print("ī��1 ���� : ");
			int idx1 = scan.nextInt();
			
			System.out.print("ī��2 ���� : ");
			int idx2 = scan.nextInt();
			
			if (front[idx1] == front[idx2]) {
				back[idx1] = front[idx1];
				back[idx2] = front[idx2];
				cnt++;
			}
			
		}

	}

}
