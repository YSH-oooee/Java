package �迭�⺻;

import java.util.Random;

/*
 * �ߺ����ڱ���[1�ܰ�] (�ҿ�ð� 02:16.38)
 * 1.0~4������ ���ڸ� arr�迭�� ����
 * 2.��, �ߺ��Ǵ� ���ڴ� ����� ��
 * ��Ʈ : ���� ���ڸ� check�迭�� �ε����� Ȱ��
 */
public class No_07_ArrayEx_�ߺ����ڱ���1 {

	public static void main(String[] args) {
		
		Random ran = new Random();
		
		int[] check = new int[5];
		int[] arr = new int[5];
		
		for (int i = 0; i < arr.length; i++) {
			int r = ran.nextInt(5);
			if (check[r] == 0) {
				arr[i] = r;
				check[r] = 1;
			} else {
				i--;
			}
		}
		
		System.out.print("arr = [ ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		} System.out.println("]");

	}

}
