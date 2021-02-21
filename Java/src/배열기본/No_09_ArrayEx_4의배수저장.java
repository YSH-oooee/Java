package 배열기본;
/*
 * 4의 배수 저장 (소요시간 06:53.55)
 * arr배열에서 4의 배수만 골라 temp배열에 저장
 */
public class No_09_ArrayEx_4의배수저장 {

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
