package 기본반복문;

import java.util.Random;

/*
 * 랜덤학생 (소요시간 04 : 36.23)
 * 1.10회 반복
 * 2.1~100 사이의 랜덤 숫자를 저장(성적)
 * 3.성적이 60점 이상이면 합격생
 * --------------------------------
 * -전교생(10명)의 총점과 평균을 출력
 * -합격자 수를 출력
 * -1등 학생의 번호와 성적 출력
 */
public class No_12_WhileEx_랜덤학생 {

	public static void main(String[] args) {
		
		Random ran = new Random();
		
		int maxScore = 0;
		int maxNum = 0;
		
		int tot = 0;
		int cnt = 0;
		
		int i = 0;
		while (i < 10) {
			
			int score = ran.nextInt(100) + 1;
			
			System.out.print(score + " ");
			
			tot += score;
			
			if (maxScore < score) {
				maxScore = score;
				maxNum = i + 1;
			}
			
			if (score >= 60) {
				cnt++;
			}
			
			i++;
			
		}
		
		double avg = tot / 10.0;
		
		System.out.println();
		System.out.println("총점 : " + tot + "점");
		System.out.println("평균 : " + avg + "점");
		System.out.println("합격자 : " + cnt + "명");
		System.out.println("1등 : " + maxNum + "번, 성적 : " + maxScore + "점");

	}

}
