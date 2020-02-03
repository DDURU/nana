package c_statement;

import java.util.Scanner;

public class ConditionalStatement {

	public static void main(String[] args) {

		/*
		 * <<if문>> - if : 조건식의 결과가 true이면 블럭안의 문장을 수행한다. -else if : 다수의 조건이 필요할때
		 * if 뒤에 추가한다. -else :결과가 true인 조건식이 하나도 없는 경우를 위해 추가한다.
		 */

		int a = 10;
		if (a < 100) {
			System.out.println("조건식의 연산결과가 true이면 수행된다.");
		}

		if (a < 10) {
			System.out.println("조건식의 연산결과가 false이면 수행되지 않는다.");
		}

		int regNo = 1; // 주민등록번호 첫자리
		String gender = null;// 성별

		if (regNo == 1) {
			gender = "남자";
		} else if (regNo == 2) {// if블럭 뒤에 else if로 조건을 추가할 수있다.
			gender = "여자";
		} else if (regNo == 3) {
			gender = "남자";
		} else if (regNo == 4) {
			gender = "여자";
		} else {// true인 조건식이 하나도 없을때 수행된다.
			gender = "확인불가";
		}
		System.out.println("당신의 성별은" + gender + "입니다.");

		regNo = 1;
		gender = null;
		// 수행할 내용이 동일한 경우 논리연산자를 사용해 조건식을 결합할 수 있다.
		if (regNo == 1 || regNo == 3) // 수행할 내용이 한문장 일 경우 블럭을 생략할 수 있다.
			gender = "남자";
		else if (regNo == 2 || regNo == 4)
			gender = "여자";
		else
			gender = "확인불가";
		System.out.println("당신의 성별은" + gender + " 입니다.");

		

	

		// 성적에 등급을 부여하는 프로그램
		int score = 88;
		String grade = null;

		if (90 <= score) {
			grade = "A";
		} else if (80 <= score && score < 90) {
			grade = "B";
		} else if (70 <= score) {
			grade = "C";
		} else if (60 <= score) {
			grade = "D";
		} else {
			grade = "F";
		}

		System.out.println(score + "점에 해당하는 등급은" + grade + " 입니다.");

		score = 100;
		grade = null;

		if (90 <= score) {
			grade = "A";
			if (97 <= score) {
				grade += "+";
			} else if (score <= 93) {
				grade += "-";
			}
		} else if (80 <= score) {
			grade = "B";
			if (87 <= score) {
				grade += "+";
			} else if (score <= 83) {
				grade += "-";
			}
			System.out.println(score + "점에 해당하는 등급은" + grade + " 입니다.");
		}

		/*
		 * <<switch문>> - 조건식과 일치하는 case문 이후의 문장을 수행한다. - 조건식의 결과는 정수와
		 * 문자열만(JDK1.7부터 문자열 허용) 허용한다.
		 */

		regNo = 2;
		gender = null;
		switch (regNo) {
		case 1:
			case 3: gender = "남자";
			break; // break를 만나면 switch문을 빠져나간다.
		case 2:
			case 4: gender = "여자";
			break;
		default: // if문의 else와 같은 역할을 한다.
			gender = "확인불가";

		}
		System.out.println("당신의 성별은 " + gender + " 입니다.");

		score = 95;
		grade = null;
		switch (score / 10) {
		case 9:
		case 10:
			grade = "A";
			break;
		case 8:
			grade = "B";
			break;
		case 7:
			grade = "C";
			break;
		case 6:
			grade = "D";
			break;
		default:
			grade = "F";

		}
		System.out.println(score + "점수에 해당하는 등급은" + grade + " 입니다.");
		
		//숫자를 입력박아 그 숫자가 0인지 0이 아닌지 출력해주세요.
		
		System.out.println("숫자를 입력해주세요>");
		Scanner s = new Scanner(System.in);
		int input = Integer.parseInt(s.nextLine());
		
		if (input == 0){
			System.out.println(" 0입니다.");
		}else{
			System.out.println("0이 아닙니다");
		
		}
		//숫자를 입력받아 그 숫자가 홀수인지 짝수인지 출력해주세요.
		Scanner S = new Scanner(System.in);
		System.out.println("숫자를 입력해주세요>");
		int num = Integer.parseInt(s.nextLine());
		if (num % 2 == 0){
			
			System.out.println("짝수입니다.");
			}else {		System.out.println("홀수입니다.");}
		
		//두개의 숫자를 입력받아 더 큰 숫자를 출력해주세요.
		System.out.println("숫자를 입력해주세요>");
		int num1 = Integer.parseInt(s.nextLine());
		System.out.println("숫자를 입력해주세요>");
		int num2 = Integer.parseInt(s.nextLine());
		
		if (num1>num2){
			System.out.println(num1);
		} else if (num==num2){
			System.out.println("두 수가 같다");
		}else {
			System.out.println(num2);
		}
		
	// 세개의 숫자를 입력받아 가장 큰 숫자를 출력해주세요.
    System.out.println("숫자를 입력해주세요");
    int num3 = Integer.parseInt(s.nextLine());
    System.out.println("숫자를 입력해주세요");
    int num4 = Integer.parseInt(s.nextLine());
    System.out.println("숫자를 입력해주세요");
    int num5 = Integer.parseInt(s.nextLine());
    
    if(num3>num4){
    	System.out.println(num3);
    }else if (num4>num5){
    	System.out.println(num4);
    }else if (num5>num3){
    	System.out.println(num5);
	}

   
    System.out.println("숫자를 입력해주세요");
    int num6 = Integer.parseInt(s.nextLine());
    System.out.println("숫자를 입력해주세요");
    int num7 = Integer.parseInt(s.nextLine());
    System.out.println("숫자를 입력해주세요");
    int num8 = Integer.parseInt(s.nextLine());
    
    if(num6<num7 && num7<num8){
    	System.out.println(num8);
    }else if(num6<num7&&num8<num7){
    	System.out.println(num7);
    }else{
    	System.out.println(num6); ///겁내 조또 어려움...................
    }
    
    
    
    
    
    
    
    
    
    
	}}
	

