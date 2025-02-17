package class01;

//성적 처리 프로그램 //
class Grade{
	int e ;
	int m ;
	
	void output_grade() { // 성적의 합을 구하는 메소드
		System.out.println(e + m);;
	}
}

public class MainClass {

	public static void main(String[] args) {
		Grade g1, g2; // Grade 타입의 2명의 성적을 표현하기 위한 객체
		
		g1 = new Grade(); // 인스턴스 생성
		g2 = new Grade(); // 인스턴스 생성
		
		// 생성한 각 인스턴스에 성적 지정
		g1.e = 90;
		g1.m = 85;
		
		g2.e = 80;
		g2.m = 80;
		
		g1.output_grade();	// g1 의 성적의 합 (175)
		g2.output_grade();  // g2 의 성적의 합 (160)
	}
	
	// 주석
	// 1. /** 주석 */ : 주로 소스 코드 맨 앞에 소스 코드에 대한 전반적인 설명을 적는 주석
	// 2. /* 주석 */  : C 언어와 동일하게 사용되는 여러줄 주석
	// 3. //         : 한줄 주석
	
	// 자바 소스 코드는 최소한 하나의 클래스가 정의되어 있어야 함
	// 클래스가 프로그램 구성의 기본 단위
	/*
	- 객체의 데이터(필드)와 객체의 기능(메소드)이 클래스 구조로 캡슐화되어 있음
	- 클래스 정의로부터 객체(인스턴스)들이 만들어지고 객체간의 상호작용으로 프로그램 자공
	*/
	
}
