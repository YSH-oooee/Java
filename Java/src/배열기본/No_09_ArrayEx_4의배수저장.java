package �迭�⺻;
/*
 * 4�� ��� ���� (�ҿ�ð� 06:53.55)
 * arr�迭���� 4�� ����� ��� temp�迭�� ����
 */
public class No_09_ArrayEx_4�ǹ������ {

	public static void main(String[] args) {
		
		int[] arr = {44, 11, 29, 24, 76};
		int[] temp = null;
		
		int cnt = 0;
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 4 == 0) {
				cnt++;
			}
			
			temp = new int[cnt];
			
		}
		
		temp = new int[cnt];
		int j = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 4 == 0) {
				temp[j] = arr[i];
				j++;
			}
		}
		
		System.out.print("temp = [ ");
		for (int i = 0; i < temp.length; i++) {
			System.out.print(temp[i] + " ");
		} System.out.println("]");
		
	}

}
