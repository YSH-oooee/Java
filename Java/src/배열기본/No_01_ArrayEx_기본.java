package �迭�⺻;
/*
 * �迭 �⺻���� (�ҿ�ð� 04:15.06)
 */
public class No_01_ArrayEx_�⺻ {

	public static void main(String[] args) {
		
		int[] arr = new int[5];
		
		//��1)10~50���� arr�迭�� ����(10 20 30 40 50)
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (i + 1) * 10;
		}
		
		System.out.print("arr = { ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		} System.out.println("}");
		
		//��2)4�� ����� ���(20 40)
		
		System.out.print("4�� ��� = ");
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 4 == 0) {
				System.out.print(arr[i] + " ");
			}
		} System.out.println();
		
		//��3)4�� ����� �� ���(60)
		
		int tot = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 4 == 0) {
				tot += arr[i];
			}
		}
		
		System.out.println("4�� ����� �� = " + tot);
		
		//��4)4�� ����� ���� ���(2��)
		
		int cnt = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 4 == 0) {
				cnt++;
			}
		}
		
		System.out.println("4�� ����� ���� = " + cnt + "��");
		
		//��5)¦���� ���� ���(5��)
		
		cnt = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				cnt++;
			}
		}
		
		System.out.println("¦���� ���� = " + cnt + "��");

	}

}
