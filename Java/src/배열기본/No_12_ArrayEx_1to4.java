package �迭�⺻;

import java.util.Random;
import java.util.Scanner;

/*
 * 1 to 50[1�ܰ�] : 1 to 4 (�ҿ�ð� 05:36.12)
 * 1.arr�迭�� 1~4������ ���ڸ� �ߺ����� ����
 * 2.����ڴ� 1���� ������� �ش� ��ġ ���� �Է�
 * 3.������ ���߸� �ش� ���� 9�� ����, ��� ���� 9�� �Ǹ� ���� ����
 */
public class No_12_ArrayEx_1to4 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		int[] arr = new int[4];
		int[] check = new int[4];
		
		for (int i = 0; i < arr.length; i++) {
			int r = ran.nextInt(4);
			
			if (check[r] == 0) {
				check[r] = 1;
				arr[i] = r + 1;
			} else {
				i--;
			}
		}
		
		int num = 1;
		while (num < 5) {
			
			System.out.print("arr = [ ");
			for (int i = 0; i < arr.length; i++) {
				System.out.print(arr[i] + " ");
			} System.out.println("]");
			
			System.out.print(num + "�� ��ġ �Է� : ");
			int idx = scan.nextInt();
			
			if (arr[idx] == num) {
				arr[idx] = 9;
				num++;
			}
			
		}

	}

}
