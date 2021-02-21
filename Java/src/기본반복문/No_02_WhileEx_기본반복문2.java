package 기본반복문;

//반복문 기본문제[2단계] (소요시간 03:09.60)

public class No_02_WhileEx_기본반복문2 {

	public static void main(String[] args) {
		
		//문1)1~5까지의 합 출력 (정답:15)
		
		int i = 1;
		int tot = 0;
		
		while (i <= 5) {
			tot += i;
			i++;
		}
		
		System.out.println("tot = " + tot);
		
		//문2)1~10까지 반복해, 3 미만 7 이상만 출력 (정답:1, 2, 7, 8, 9, 10)
		
		i = 1;
		
		while (i <= 10) {
			if (i < 3 || 7 <= i) {
				System.out.print(i + " ");
			}
			i++;
		} System.out.println();
		
		//문3)문제2의 조건에 맞는 수들의 합 출력 (정답:37)
		
		i = 1;
		tot = 0;
		
		while (i <= 10) {
			if (i < 3 || 7 <= i) {
				tot += i;
			}
			i++;
		}
		
		System.out.println("tot = " + tot);
		
		//문4)문제2의 조건에 맞는 수들의 개수 출력 (정답:6)
		
		i = 1;
		int cnt = 0;
		
		while (i <= 10) {
			if (i < 3 || 7 <= i) {
				cnt++;
			}
			i++;
		}
		
		System.out.println("cnt = " + cnt);

	}

}
