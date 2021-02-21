package 배열기본;
/*
 * 배열 기본문제2 (소요시간 02:39.78)
 */
public class No_02_ArrayEx_기본 {

	public static void main(String[] args) {
		
		int[] arr = {10, 20, 30, 40, 50};
		int[] temp1 = new int[5];
		int[] temp2 = new int[5];
		int[] temp3 = new int[5];
		
		//문1)arr의 값을 temp1에 복사 후, 출력(10, 20, 30, 40, 50)
		
		System.out.print("temp1 = { ");
		for (int i = 0; i < temp1.length; i++) {
			temp1[i] = arr[i];
			System.out.print(temp1[i] + " ");
		} System.out.println("}");
		
		//문2)arr의 값의 2배를 temp2에 복사 후, 출력(20, 40, 60, 80, 100)
		
		System.out.print("temp2 = { ");
		for (int i = 0; i < temp2.length; i++) {
			temp2[i] = arr[i] * 2;
			System.out.print(temp2[i] + " ");
		} System.out.println("}");
		
		//문3)arr의 값에 i를 더한 값을 temp3에 복사 후, 출력(10, 21, 32, 43, 54)
		
		System.out.print("temp3 = { ");
		for (int i = 0; i < temp3.length; i++) {
			temp3[i] = arr[i] + i;
			System.out.print(temp3[i] + " ");
		} System.out.println("}");

	}

}
