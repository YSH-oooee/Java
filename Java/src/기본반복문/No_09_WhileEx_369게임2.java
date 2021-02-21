package 기본반복문;
/*
 * 369게임[2단계] (소요시간 11:00.04)
 * 1.1~50까지 반복
 * 2.그 안에서 해당 숫자의 369게임 결과를 출력
 * 예)1 2 짝 4 5 짝 7 8 짝 10 11 12 짝 ...
 */
public class No_09_WhileEx_369게임2 {

	public static void main(String[] args) {
		
		int num = 1;
		
		while (true) {
			
			if (num == 51) {
				break;
			}
			
			int x = num / 10;
			int y = num % 10;
			
			int cnt = 0;
			
			if (x != 0 && x % 3 == 0) {
				cnt++;
			}
			if (y != 0 && y % 3 == 0) {
				cnt++;
			}
			
			if (cnt == 1) {
				System.out.println("짝");
			} else if (cnt == 2) {
				System.out.println("짝짝");
			} else {
				System.out.println(num);
			}
			
			num++;
			
		}

	}

}
