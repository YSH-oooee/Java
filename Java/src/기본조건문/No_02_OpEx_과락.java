package �⺻���ǹ�;

public class No_02_OpEx_���� {

	public static void main(String[] args) {
		
		//��1)3������ ����� 60�� �̻��̸� true(��, ��� �� �����̶� 50�� �̸��̸� false)(02:11.82)
		
		int kor = 100;
		int eng = 87;
		int math = 60;
		
		double avg = (kor + eng + math) / 3.0;
		
		if (avg > 60) {
			if (kor < 50 || eng < 50 || math < 50) {
				System.out.println("false");
			} else {
				System.out.println("true");
			}			
		}
		
		

	}

}
