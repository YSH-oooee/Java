package �⺻�ݺ���;

import java.util.Scanner;

/*
 * ����Ų���31 (�ҿ�ð� 03:50.77)
 * 1.p1�� p2�� �����ư��鼭 1~3�� �Է�
 * 2.br�� p1�� p2�� �Է°��� �����ؼ� ����
 * 3.br�� 31�� ������ ���� ����
 * 4.�¸��� ���
 * 
 * ��)
 * 1�� : p1(2) >> br = 2
 * 2�� : p2(1) >> br = 3
 * 3�� : p1(3) >> br = 6
 * ...
 */
public class No_08_WhileEx_����Ų���31 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int p1 = 0;
		int p2 = 0;
		int br = 0;
		int turn = 0;
				
		while (true) {
						
			System.out.println("���� = " + br);
			
			if (br >= 31) {
				break;
			}
			
			if (turn % 2 == 0) {
				
				System.out.print("[p1]���� �Է�(1~3) : ");
				int p1Num = scan.nextInt();
				
				br += p1Num;
				
			}
			
			if (turn % 2 == 1) {
				
				System.out.print("[p2]���� �Է�(1~3) : ");
				int p2Num = scan.nextInt();
				
				br += p2Num;
				
			}
			
			turn++;
			
		}
		
		if (turn % 2 == 0) {
			System.out.println("p1 �¸�");
		} else if (turn % 2 == 1) {
			System.out.println("p2 �¸�");
		}

	}

}
