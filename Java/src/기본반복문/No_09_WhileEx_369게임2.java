package �⺻�ݺ���;
/*
 * 369����[2�ܰ�] (�ҿ�ð� 11:00.04)
 * 1.1~50���� �ݺ�
 * 2.�� �ȿ��� �ش� ������ 369���� ����� ���
 * ��)1 2 ¦ 4 5 ¦ 7 8 ¦ 10 11 12 ¦ ...
 */
public class No_09_WhileEx_369����2 {

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
				System.out.println("¦");
			} else if (cnt == 2) {
				System.out.println("¦¦");
			} else {
				System.out.println(num);
			}
			
			num++;
			
		}

	}

}
