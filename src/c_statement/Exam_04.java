package c_statement;

public class Exam_04 {

	public static void main(String[] args) {

		/*
		 * 조건식으로 if, switch, for, while이 있다.
		 * 
		 * [4-1] 다음의 문장들을 조건식으로 표현하라. 1. int형 변수 x가 10보다 크고 20보다 작을 때 true인 조건식
		 * 2. char형 변수 ch가 공백이나 탭이 아닐 때 true인 조건 3. char형 변수 ch가 ‘x' 또는 ’X'일 때
		 * true인 조건식 4. char형 변수 ch가 숫자(‘0’~‘9’)일 때 true인 조건식 5. char형 변수 ch가
		 * 영문자(대문자 또는 소문자)일 때 true인 조건식 6. int형 변수 year가 400으로 나눠떨어지거나 또는 4로
		 * 나눠떨어지고 100으로 나눠떨어지지 않을 때 true인 조건식 7. boolean형 변수 powerOn가 false일 때
		 * true인 조건식 8. 문자열 참조변수 str이 “yes”일 때 true인 조건식 1. (10<x && x<20) 2. ch
		 * != ' ' && ch !='\t' 3. (ch=='x' || ch=='X') 4. ('0'<=ch && ch<='9')
		 * 5. ('a'<=ch && ch<='z' || 'A'<=ch && ch<='Z') 6. (year%400==0 ||
		 * year%4==0 && year%100!=0) 7. powerOn==false 또는 !powerOn 8.
		 * str.equals("yes") 또는 "yes".equals(str)
		 * 
		 * [4-2] 1부터 20까지의 정수 중에서 2 또는 3의 배수가 아닌 수의 총합을 구하시오.
		 * 
		 * int sum = 0; for(int i=1; i <=20; i++) { if(i%2!=0 && i%3!=0) //i가
		 * 2또는 3의 배수가 아닐 때만 sum에 i를 더한다. sum +=i;}
		 * System.out.println("sum ="+sum);
		 * 
		 * [4-3] 1+(1+2)+(1+2+3)+(1+2+3+4)+...+(1+2+3+...+10)의 결과를 계산하시오.
		 * ????????????????? int a=1; int sum=0; int totalsum=0; for (a=1;
		 * a<=10; a++) {sum+=a; // 앞에숫자 totalsum+=sum; // 뒤의 숫자}
		 * System.out.println(totalsum);
		 * 
		 * int sum = 0; for(int i= 1; i <=10; i ++){ for(int j=1; j<=i; j++){sum
		 * += j;}}
		 * 
		 * [4-4] 1+(-2)+3+(-4)+... 과 같은 식으로 계속 더해나갔을 때, 몇까지 더해야 총합이 100이상이 되는지
		 * 구하시오.
		 * 
		 * int sum = 0; // 총합을 저장할 변수 int s = 1; // 값의 부호를 바꿔주는데 사용할 변수 int num
		 * = 0;
		 * 
		 * // 조건식의 값이 true이므로 무한반복문이 된다. for(int i=1;true; i++, s=-s) { // 매
		 * 반복마다 s의 값은 1, -1, 1, -1... num = s * i; // i와 부호(s)를 곱해서 더할 값을 구한다.
		 * (num을 계속 +, -, + 로 바꿔줌) sum += num; // 그렇게 나온 num끼리 누적해서 더함
		 * 
		 * if(sum >=100) // 총합이 100보다 같거나 크면 반복문을 빠져 나간다. break;}
		 * 
		 * System.out.println("num="+num); System.out.println("sum="+sum);
		 * 
		 * 
		 * 
		 * int i=0; int sum = 0; while (sum<100){ i++; if(i%2==0){ sum=sum-i
		 * }else if(i%2==1){ sum= sum+i } } System.out.println(i);
		 * 
		 * int 
		 * 
		 * 
		 * [4-5] 다음의 for문을 while문으로 변경하시오. 
		 * 
		 * 
		 * [연습문제]/ch4/Exercise4_5.java public
		 * class Exercise4_5 { public static void main(String[] args) { for(int
		 * i=0; i<=10; i++) { for(int j=0; j<=i; j++) System.out.print("*");
		 * System.out.println(); } } // end of main } // end of class
		 * 
		 * 답 int i=0; while(i<=10) { int j=0;
		 * 
		 * while(j<=i) { System.out.print("*"); j++;}
		 * 
		 * System.out.println(); i++; } ------------------------------ int i =
		 * 0; int j = 0;
		 * 
		 * while(i <=10){ j=0; while(j<=i) System.out.print("*"); j++; }i++;
		 * System.out.println();}
		 * 
		 * 
		 * 
		 * 
		 * [4-6] 두 개의 주사위를 던졌을 때, 눈의 합이 6이 되는 모든 경우의 수를 출력하는 프 로그램을 작성하시오.
		 * 
		 * for (int i=1; i<7; i++) { for (int j=1; j<7; j++) { if (i+j==6) {
		 * System.out.printf("%d + %d = %d", i, j, i+j);
		 * System.out.println(" "); } } }
		 * 
		 * 
		 * 
		 * [4-7] Math.random()을 이용해서 1부터 6사이의 임의의 정수를 변수 value에 저장하는 코드를 완성하라.
		 * (1)에 알맞은 코드를 넣으시오. [연습문제]/ch4/Exercise4_7.java class Exercise4_7 {
		 * public static void main(String[] args) { int value = ( (1) );
		 * System.out.println("value:"+value); } } : (int)(Math.random()*6)+1;//
		 * 소수점을 버리기위해 인트타입으로 형변환하고 1더하기 6까지의 수를 나타내기위해서 //Math.random():
		 * 0.0~1.0미만 0.99999999....랜덤한수를 곱하면 됨.
		 * 
		 * 
		 * 
		 * [4-8] 방정식 2x+4y=10의 모든 해를 구하시오. 단, x와 y는 정수이고 각각의 범위는 0<=x<=10,
		 * 0<=y<=10 이다.
		 * 
		 * int a=0; for(int x=0; x<=10; x++) { for(int y=0; y<=10; y++) {
		 * if(2*x+4*y==10) { System.out.printf("x=%d, y=%d \n", x, y); } } }
		 * 
		 * for(int i=0; i<=10; i++){ for(int j=0; j<= 10; j++){
		 * if(2*i+4*j==10){System.out.println("x=" + i + ", " + "y= "+ j)}}}
		 * 
		 * 
		 * [4-10] int타입의 변수 num 이 있을 때, 각 자리의 합을 더한 결과를 출력하는 코드를 완성하라. 만일 변수
		 * num의 값이 12345라면, ‘1+2+3+4+5’의 결과인 15를 출력하라. (1) 에 알맞은 코드를 넣으시오. [주의]
		 * 문자열로 변환하지 말고 숫자로만 처리해야 한다. [연습문제]/ch4/Exercise4_10.java class
		 * Exercise4_10 { public static void main(String[] args) { int num =
		 * 12345; int sum = 0;
		 * 
		 * System.out.println("sum="+sum); } }
		 * 
		 * int num = 12345; int sum = 0;
		 * 
		 * while(num > 0) { sum += num%10; // 10으로 나눈 나머지를 sum에 더한다. 처음에는 5. num
		 * /= 10; // num을 다시 10으로 나눈다 (int라 소숫점은 없어짐) }
		 * 
		 * System.out.println("sum="+sum);
		 * 
		 * [4-11] 피보나치(Fibonnaci) 수열(數列)은 앞을 두 수를 더해서 다음 수를 만들어 나가 는 수열이다. 예를 들어
		 * 앞의 두 수가 1과 1이라면 그 다음 수는 2가 되고 그 다음 수는 1과 2를 더해서 3이 되어서
		 * 1,1,2,3,5,8,13,21,... 과 같은 식으로 진행된다. 1과 1부터 시작하는 피보나치수열의 10번째 수는 무엇인지
		 * 계산하는 프로그램을 완성하시오. [연습문제]/ch4/Exercise4_11.java public class
		 * Exercise4_11 { public static void main(String[] args) { // Fibonnaci
		 * 수열의 시작의 첫 두 숫자를 1, 1로 한다. int num1 = 1; int num2 = 1; int num3 = 0;
		 * // 세번째 값 System.out.print(num1+","+num2); for (int i = 0 ; i < 8 ;
		 * i++ ) {
		 * 
		 * (1) 알맞은 코드를 넣어 완성하시오.
		 * 
		 * } } // end of main } // end of class [실행결과] 15 [실행결과]
		 * 1,1,2,3,5,8,13,21,34,55
		 * 
		 * // Fibonnaci 수열의 시작의 첫 두 숫자를 1, 1로 한다. int num1 = 1; int num2 = 1;
		 * int num3 = 0; // 세번째 값 System.out.print(num1+","+num2);
		 * 
		 * for (int i = 0 ; i < 8 ; i++ ) { num3 = num1 + num2; // 세번째 값은 첫번째와
		 * 두번째 값을 더해서 얻는다.
		 * 
		 * System.out.print(","+num3); // 세 번째 수열 출력 num1 = num2; // 두 번째 수열을 첫
		 * 번째 값으로 한다. num2 = num3; // 세 번째 수열을 두 번째 값으로 한다. }
		 * --------------------
		 * --------------------------------------------------------------
		 * num3=num1+num2; system.out.print(","+num3); num1 = num2; num2=num3;
		 * //num1 num2 num3 // num1 num2 num3
		 * 
		 * 
		 * 
		 * [4-15] 다음은 회문수를 구하는 프로그램이다. 회문수(palindrome)란, 숫자를 거꾸로 읽 어도 앞으로 읽는 것과
		 * 같은 수를 말한다. 예를 들면 ‘12321’이나 ‘13531’같은 수를 말한 다. (1)에 알맞은 코드를 넣어서 프로그램을
		 * 완성하시오. [Hint] 나머지 연산자를 이용하시오. 각각 분리해서 리저트에 담는건데 10을 곱한다음에
		 * 담을것................. [연습문제]/ch4/Exercise4_15.java class Exercise4_15
		 * { public static void main(String[] args) { int number = 12321; int
		 * tmp = number; int result =0; // 변수 number를 거꾸로 변환해서 담을 변수 while(tmp
		 * !=0) {
		 * 
		 * ?????????????????????????????????????
		 * 
		 * result *= 10; result += tmp % 10; // 왜 10을 나누면 1의자리 숫자가 되는지 잘 모르겠어요..
		 * tmp /= 10;
		 * 
		 * } if(number == result) System.out.println( number + "는 회문수 입니다.");
		 * else System.out.println( number + "는 회문수가 아닙니다."); } // main } [실행결과]
		 * 12321는 회문수 입니다.
		 * 
		 * 
		 * 
		 * 
		 * [4-3] 1+(1+2)+(1+2+3)+(1+2+3+4)+...+(1+2+3+...+10)의 결과를 계산하시오.
		 * ?????????????????
		 */

		/*int a = 1;
		int sum = 0;
		int totalsum = 0;
		for (a = 1; a <= 10; a++) {
			sum += a; // 앞에숫자
			totalsum += sum; // 뒤의 숫자}
			System.out.println(totalsum);*/
		
/*		public class Exercise4_5 {
			public static void main(String[] args) {
			for(int i=0; i<=10; i++) {
			for(int j=0; j<=i; j++)
			System.out.print("*");
			System.out.println();
			}
			} // end of main
			} // end of class
			
			while(i <=10){ j=0; while(j<=i) System.out.print("*"); j++; }i++;
		 * System.out.println();}
		*/
		
		int i = 0;
		int j = 0;
		while(i <=10){ j=0; while(j<=i) System.out.print("*"); j++; }i++;
		  System.out.println();

	}
}

