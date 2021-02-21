package 배열기본;

import java.util.Random;
import java.util.Scanner;

/*
 * 학생성적관리 : 학생 점수, 검색, 예외처리, 1등 (소요시간 11:43.50)
 */
public class No_03_ArrayEx_학생성적관리 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		int[] arr = new int[5];
		
		//문1)arr배열에 1~100점 사이의 정수를 랜덤으로 5개 저장
		
		System.out.print("arr = { ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = ran.nextInt(100) + 1;
			System.out.print(arr[i] + " ");
		} System.out.println("}");
		
		//문2)전교생의 총점과 평균점 출력
		
		int tot = 0;
		for (int i = 0; i < arr.length; i++) {
			tot += arr[i];
		}
		
		double avg = tot / (double)arr.length;
		System.out.println("총점 = " + tot + "점 / 평균점 = " + avg + "점");
		
		//문3)성적이 60점 이상이면 합격, 합격생 수 출력
		
		int cnt = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > 59) {
				cnt++;
			}
		}
		
		System.out.println("합격생 수 = " + cnt + "명");
		
		//문4)인덱스를 입력받아 성적 출력
		
		System.out.print("인덱스 입력 : ");
		int idx = scan.nextInt();
		
		System.out.println(idx + "번의 점수 = " + arr[idx] + "점");
		
		//문5)성적을 입력받아 인덱스 출력
		
		System.out.print("성적 입력 : ");
		int score = scan.nextInt();
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == score) {
				System.out.println(score + "점의 학생 번호= " + i + "번");
			}
		}
		
		//===========================================================
		
		int[] hakbuns = {1001, 1002, 1003, 1004, 1005};
		int[] scores  = {87, 11, 45, 98, 23};
		
		System.out.print("학번 = { ");
		for (int i = 0; i < hakbuns.length; i++) {
			System.out.print(hakbuns[i] + " ");
		} System.out.println("}");
		
		System.out.print("점수 = { ");
		for (int i = 0; i < scores.length; i++) {
			System.out.print(scores[i] + " ");
		} System.out.println("}");
		
		//문6)학번을 입력받아 성적 출력(단, 없는 학번 입력 시 예외처리)
		
		System.out.print("학번 입력 : ");
		int hak = scan.nextInt();
		
		idx = 0;
		for (int i = 0; i < hakbuns.length; i++) {
			if (hakbuns[i] == hak) {
				idx = i;
			}
		}
		
		if (idx == 0) {
			System.out.println("해당 학번은 없는 학번입니다");
		} else {
			System.out.println(hak + "번 학생의 성적 = " + scores[idx] + "점");
		}
		
		//문7)1등 학생의 학번과 성적 출력(1004번 98점)
		
		int maxScore = 0;
		int maxIdx = 0;
		
		for (int i = 0; i < scores.length; i++) {
			if (maxScore < scores[i]) {
				maxScore = scores[i];
				maxIdx = i;
			}
		}
		
		System.out.println("1등 = " + hakbuns[maxIdx] + "번 " + maxScore + "점");

	}

}
