package javaEx01;

import java.util.Scanner;

public class javaEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello, java!");
		System.out.print("Enter yout name:");
		
		// 콘솔 입력
		Scanner sc = new Scanner(System.in);
		/*String name = sc.nextLine(); //nextInt(), nextDouble()
		
		System.out.println("welcom, " + name + "!");
		*/
		// 변수 : 데이터 저장하는 메모리공간, 선언과 초기화
		// 데이터 타입
		// 정수형
		int age = 24;
		long pop = 8999999999L;
		// 실수형
		double height = 169.4;
		float weight = 70.5f;
		// 문자형
		char ch = '3';
		
		// 논리
		boolean isStudent = true; //true/false
		
		//출력
		System.out.println("Age" + age);

		// 명시적 형 변환(타입 캐스팅): 큰 타입에서 작은 타입으로 수동변환
		double pi = 3.14;
		int truncatedpi = (int) pi;
		
		System.out.println("pi: " + pi+", tpi" + truncatedpi);
		
		
		// 연산자
		// 산술연산자 : +,=,*,/,%
		// 비교연산자 : ==,!=,<,>,<=.>=
		// 논리연산자 : &&,||,!
		
		
		// 수를 입력 받아 홀수 인지 짝수인지 판별
		System.out.print("Enter Num");
		int num = sc.nextInt();
		
		if(num%2==0) {
			System.out.println(num);
			
		} else {
			System.out.println(num);
		}
		
		
	}

}
