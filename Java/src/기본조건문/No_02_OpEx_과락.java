package 기본조건문;

public class No_02_OpEx_과락 {

	public static void main(String[] args) {
		
		//문1)3과목의 평균이 60점 이상이면 true(단, 어느 한 과목이라도 50점 미만이면 false)(02:11.82)
		
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
