package �⺻�ݺ���;

import java.util.Random;
import java.util.Scanner;

/*
 * Up & Down[2�ܰ�] (�ҿ�ð� 03:03.15)
 * 1.������ ���߸� ���� ����
 * 2.100������ ������, ������ �Է��� ������ 5�� ����
 * 3.���� ���� ��, ���� ���
 */
public class No_06_WhileEx_���شٿ�2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		int score = 100;
		int answer = ran.nextInt(100) + 1;
		
		while (true) {
			System.out.print("���� �Է�[1~100] : ");
			int me = scan.nextInt();
			
			if (me < answer) {
				System.out.println("UP");
			} else if (me > answer) {
				System.out.println("Down");
			} else if (me == answer) {
				System.out.println("Bingo!");
				break;
			}
			score -= 5;
		}
		
		System.out.println("���� : " + score + "��");

	}

}
