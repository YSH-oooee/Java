package 기본조건문;

import java.util.Scanner;

/*
 * 지하철 요금 계산(06:30.18)
 * 1.이용할 정거장 수를 입력
 * 2.정거장 수에 따라 요금이 정산
 * 3.요금표
 *  1) 1~5   : 500원
 *  2) 6~10  : 600원
 *  3) 11,12 : 650원(10정거장 이후는 2정거장마다 50원 추가)
 *  4) 13,14 : 700원(10정거장 이후는 2정거장마다 50원 추가)
 */
public class No_22_IfEx_지하철요금 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int fee = 600;
		
		System.out.print("정거장 수 입력 : ");
		int stop = scan.nextInt();
		
		System.out.print("요금 = ");
		if (0 < stop && stop < 6) {
			System.out.println("500원");
		}
		if (5 < stop && stop < 11) {
			System.out.println(fee + "원");
		}
		if (10 < stop) {
			int x = stop % 10;
			x = (x + 1) / 2;
			
			int add = x * 50;
			int tot = fee + add;
			
			System.out.println(tot + "원");
		}

	}

}
