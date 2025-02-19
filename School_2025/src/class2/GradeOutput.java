package class2;

public class GradeOutput {
	int e ;
	int m ;
	
	void input_grade(int a , int b) {
		e = a;
		m = b;
	}
	
	void output_grade() {
		System.out.println(e + m);
	}
	
	
	// String[] args 는 main 함수의 매개변수
	public static void main(String[] args) {
		GradeOutput g1, g2;
		g1 = new GradeOutput();
		g2 = new GradeOutput();
		
		g1.input_grade(90, 85);
		g2.input_grade(80, 80);
		
		g1.output_grade();
		g2.output_grade();
		
		
		// 선택문 (if 문)
		int a = 2;
		int b = 2;
		
		if(a == 1) {
			if(b == 2) {
				System.out.println("a was 1 and b was 2.");
			}
		}else {
			System.out.println("a wasn't 1.");
		}
		
		// 반복문 (향상된 for 문)
		int[] array = {1 ,2, 3, 4, 5, 6, 7};
		
		for(int i : array) { // int i 를 통해 배열 array 순회
			System.out.println(i + " ");
		}
		System.out.println();
		
		// 레이블을 사용한 continue 문
		int nSum = 0;
		my_loop:for(int j = 1; j <= 10; j++) {
			if(j % 2 == 0) {
				continue my_loop; // 만약 j 가 짝수 일 시 레이블을 통해 for 문으로 돌아감
			}
			nSum += j;
		}
		System.out.println(nSum);
	}
	
	/*
	* 변수의 종류 * 
	[데이터 필드]
	1. 인스턴스 변수 : 클래스 정의에서 non-static 필드 개별 객체가 소유한 변수
	2. 클래스 변수 : 클래스 정의에서 static 필드 동종 객체 간 공유 변수(=정적 변수)
		-> 해당 클래스의 모든 변수가 공유
	★ 클래스 외부에서의 사용 가능여부는 접근제어자에 따라 다름
	
	[지역변수]
	- 메소도 내부 (블록 내부)에서 선언된 변수
	★ 반드시 초기값을 지정한 후에 사용
	★ 지역변수 선언 시 접근 제어자 사용 X
	
	[파라미터]
	- 메소드 호출 시 전달하는 값을 저장하기 위한 변수
	*/
	
	/*
	* 리터럴 *
	- 소스 코드에서 사용되는 실제 데이터 값
	* 상수 *
	- 값이 한번 할당되는 변경 불가한 변수
	- 자바의 상수 표현 : final 
	*/
	
	/*
	* 기본형 자료형 *
	1. 문자 : char    -> 2byte
	2. 논리 : boolean -> 1byte
	3. 정수
		1) byte   -> 1byte
		2) short  -> 2byte
		3) int    -> 4byte
		4) long   -> 8byte
	4. 실수
		1) float  -> 4byte
		2) double -> 8byte
	- 기본형 변수는 저장공간에 값 자체를 저장
	
	* 참조형 자료형 *
	- 참조값(주소값)을 나타내는 자료형
	- 참조형 변수 -> 객체를 가리키는 변수로 객체의 참조값(주소값)을 저장
	- 실제 객체는 동적 메모리 공간에 저장
	
	예] 클래스 / 배열 / 인터페이스 / 열거형 
	*/
	
	/*
	* 형변환 *
	[묵시적 형변환]
	- 작은 타입 -형변환-> 큰타입
	byte -> short -> int -> long -> float -> double
	
	[명시적 형변환(=강제캐스팅)]
	- 큰타입 -> 작은타입
	- 형식 : (변환자료형)변환할변수
	★ 자바는 엄격한 형검사 실시 
	*/
	
	/*
	* 문장의 종류 *
	1. 수식문 : 변수 / 연산자 / 함수 호출 등으로 구성되어 결과값을 계산하는 문장
	2. 변수 선언분
	3. 제어문
		1) 선택문
	 	2) 반복문
		3) 점프문
	4. 블록문
	5. 레이블문 
	 	1) 레이블 : 반복문  -> 반복에 레이블 지정 
	 	2) break 레이블	 -> 특정 블록 / 반복문으로 빠져나갈수 있음
		3) continue 레이블  -> 특정반복문의 다음 반복으로 이동
	6. 예외처리 : try - catch 문
	7. 동기화문 : synchronized 블록문	 
	*/
}
