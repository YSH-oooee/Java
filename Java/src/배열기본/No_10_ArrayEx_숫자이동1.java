package �迭�⺻;

import java.util.Scanner;

/*
 * �����̵�[1�ܰ�] (�ҿ�ð� 07:33.90)
 * 1.����2�� ĳ����
 * 2.���� 1�� �Է��ϸ�, ĳ���Ͱ� ��������
 *   ���� 2�� �Է��ϸ�, ĳ���Ͱ� ���������� �̵�
 * 3.��, �¿� ���� �������� �� ����ó��
 */
public class No_10_ArrayEx_�����̵�1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] game = {0, 0, 2, 0, 0, 0, 0};
		
		int player = 0;
		for (int i = 0; i < game.length; i++) {
			if (game[i] == 2) {
				player = i;
			}
		}
		
		while (true) {
			
			System.out.print("[ ");
			for (int i = 0; i < game.length; i++) {
				System.out.print(game[i] + " ");
			} System.out.println("]");
			
			System.out.print("[�̵�]��(1)��(2) �Է� : ");
			int move = scan.nextInt();
			
			if (move == 1) {
				
				if (player - 1 >= 0) {

					game[player] = 0;
					player--;
					game[player] = 2;

				} else {
					System.out.println("���̻� �̵��� �� �����ϴ�");
				}
								
			} 
			if (move == 2) {
				
				if (player + 1 < game.length) {

					game[player] = 0;
					player++;
					game[player] = 2;

				} else {
					System.out.println("���̻� �̵��� �� �����ϴ�");
				}
				
			}
			
		}

	}

}
