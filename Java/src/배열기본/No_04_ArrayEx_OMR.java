package 배열기본;

import java.util.Random;

/*
 * OMR카드 (소요시간 04:00.83)
 * 1.배열 answer는 시험문제의 정답지
 * 2.배열 hgd에 1~5사이의 랜덤 숫자 5개 저장
 * 3.answer와 hgd의 값을 비교해 정오표를 출력
 * 4.한 문제당, 20점
 */
public class No_04_ArrayEx_OMR {

	public static void main(String[] args) {
		
		Random ran = new Random();
		
		int[] answer = {1, 3, 4, 2, 5};
		int[] hgd = new int[5];
		
		System.out.print("answer = { ");
		for (int i = 0; i < answer.length; i++) {
			System.out.print(answer[i] + " ");
		} System.out.println("}");
		
		System.out.print("hgd    = { ");
		for (int i = 0; i < hgd.length; i++) {
			hgd[i] = ran.nextInt(5) + 1;
			System.out.print(hgd[i] + " ");
		} System.out.println("}");
		
		int cnt = 0;
		
		System.out.print("정오표       = { ");
		for (int i = 0; i < answer.length; i++) {
			if (answer[i] == hgd[i]) {
				System.out.print("O ");
				cnt++;
			} else {
				System.out.print("X ");
			}
		} System.out.println("}");
		
		System.out.println("성적          = " + (cnt * 20) + "점");

	}

}
