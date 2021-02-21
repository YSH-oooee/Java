package 배열기본;
/*
 * 배열 기본문제 (소요시간 04:15.06)
 */
public class No_01_ArrayEx_기본 {

	public static void main(String[] args) {
		
		int[] arr = new int[5];
		
		//문1)10~50까지 arr배열에 저장(10 20 30 40 50)
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (i + 1) * 10;
		}
		
		System.out.print("arr = { ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		} System.out.println("}");
		
		//문2)4의 배수만 출력(20 40)
		
		System.out.print("4의 배수 = ");
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 4 == 0) {
				System.out.print(arr[i] + " ");
			}
		} System.out.println();
		
		//문3)4의 배수의 합 출력(60)
		
		int tot = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 4 == 0) {
				tot += arr[i];
			}
		}
		
		System.out.println("4의 배수의 합 = " + tot);
		
		//문4)4의 배수의 개수 출력(2개)
		
		int cnt = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 4 == 0) {
				cnt++;
			}
		}
		
		System.out.println("4의 배수의 개수 = " + cnt + "개");
		
		//문5)짝수의 개수 출력(5개)
		
		cnt = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				cnt++;
			}
		}
		
		System.out.println("짝수의 개수 = " + cnt + "개");

	}

}
