package �迭�⺻;
/*
 * �迭 �⺻����2 (�ҿ�ð� 02:39.78)
 */
public class No_02_ArrayEx_�⺻ {

	public static void main(String[] args) {
		
		int[] arr = {10, 20, 30, 40, 50};
		int[] temp1 = new int[5];
		int[] temp2 = new int[5];
		int[] temp3 = new int[5];
		
		//��1)arr�� ���� temp1�� ���� ��, ���(10, 20, 30, 40, 50)
		
		System.out.print("temp1 = { ");
		for (int i = 0; i < temp1.length; i++) {
			temp1[i] = arr[i];
			System.out.print(temp1[i] + " ");
		} System.out.println("}");
		
		//��2)arr�� ���� 2�踦 temp2�� ���� ��, ���(20, 40, 60, 80, 100)
		
		System.out.print("temp2 = { ");
		for (int i = 0; i < temp2.length; i++) {
			temp2[i] = arr[i] * 2;
			System.out.print(temp2[i] + " ");
		} System.out.println("}");
		
		//��3)arr�� ���� i�� ���� ���� temp3�� ���� ��, ���(10, 21, 32, 43, 54)
		
		System.out.print("temp3 = { ");
		for (int i = 0; i < temp3.length; i++) {
			temp3[i] = arr[i] + i;
			System.out.print(temp3[i] + " ");
		} System.out.println("}");

	}

}
