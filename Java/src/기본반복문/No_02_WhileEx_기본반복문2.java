package �⺻�ݺ���;

//�ݺ��� �⺻����[2�ܰ�] (�ҿ�ð� 03:09.60)

public class No_02_WhileEx_�⺻�ݺ���2 {

	public static void main(String[] args) {
		
		//��1)1~5������ �� ��� (����:15)
		
		int i = 1;
		int tot = 0;
		
		while (i <= 5) {
			tot += i;
			i++;
		}
		
		System.out.println("tot = " + tot);
		
		//��2)1~10���� �ݺ���, 3 �̸� 7 �̻� ��� (����:1, 2, 7, 8, 9, 10)
		
		i = 1;
		
		while (i <= 10) {
			if (i < 3 || 7 <= i) {
				System.out.print(i + " ");
			}
			i++;
		} System.out.println();
		
		//��3)����2�� ���ǿ� �´� ������ �� ��� (����:37)
		
		i = 1;
		tot = 0;
		
		while (i <= 10) {
			if (i < 3 || 7 <= i) {
				tot += i;
			}
			i++;
		}
		
		System.out.println("tot = " + tot);
		
		//��4)����2�� ���ǿ� �´� ������ ���� ��� (����:6)
		
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
