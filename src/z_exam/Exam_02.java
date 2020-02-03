package z_exam;

public class Exam_02 {

}
/*
[ 연습문제 ]
		
[2-1] 다음 표의 빈 칸에 8개의 기본형(primitive type)을 알맞은 자리에 넣으시오.

          1 byte   2 byte   4 byte   8 byte

 논리형           boolean

문자형                               char

정수형             byte     short     int     long

실수형                                                 float    double

[2-2] 주민등록번호를 숫자로 저장하고자 한다. 이 값을 저장하기 위해서는 어떤 자료형
(data type)을 선택해야 할까? regNo라는 이름의 변수를 선언하고 자신의 주민등록번호로
초기화 하는 한 줄의 코드를 적으시오.

참조형타입
System.out.println(_String);
String _주민등록번호 = new String("0000000000000");

**13자리를 나타낼수 있는건 long타입**


[2-3] 다음의 문장에서 리터럴, 변수, 상수, 키워드를 적으시오.

int i = 100;
long l =100L;
final float PI = 3.14f;

- 리터럴 : 3.14f, 100, 100L, 
- 변수 : i,ㅣ
- 키워드 : int,long, final float
- 상수 : pi
	
	
[2-4] 다음 중 기본형(primitive type)이 아닌 것은?
                                              b
a. int
b. Byte
c. double
d. boolean

**앞글자가 소문자여야 되는데 대문자라서(class) 

[2-5] 다음 문장들의 출력결과를 적으세요. 오류가 있는 문장의 경우, 괄호 안에 ‘오
류’라고 적으시오.

System.out.println(“1” + “2”) → (12 )
System.out.println(true + “”) → (true )
System.out.println(‘A'65 + 'B'66) → ( 131)
System.out.println('1' 49+ 2) → (51)
System.out.println('1' 49+ '2'50) → (99 )
System.out.println('J'문자 + “ava”문자열) → ( java) 스트링은 다연산이 된다~
System.out.println(true + null) → ( 오류)

**아스키코드 보궁



[2-6] 다음 중 키워드가 아닌 것은?(모두 고르시오)
                                       b,c,d,e 
                                       **다 앞글자가 대문자라서 대문자로 시작하는 키워드
                                       *는 없다.
a. if
b. True
c. NULL
d. Class
e. System


[2-7] 다음 중 변수의 이름으로 사용할 수 있는 것은? (모두 고르시오)
                                       a,g
a. $ystem ㅇ
b. channel#5  x 우물정자때문에 사용이 안됨..
c. 7eleven  x 숫자가 맨앞에 와서
d. If ㅇ
e. 자바 ㅇ 한글이긴 한데 변수이름으로 사용할수 있다.
f. new x
g. $MAX_NUM ㅇ
h. hello@com x 골뱅이떄문에 사용할수 없다. 


[2-8] 참조형 변수(reference type)(4바이트)와 같은 크기의 기본형(primitive type)은? (모두 고
르시오)
                             a,d
                             ** 4바이트인거 찾을것..
a. int
b. long
c. short
d. float
e. double


[2-9] 다음 중 형변환을 생략할 수 있는 것은? (모두 고르시오)
                                             d,e
byte b = 10;
char ch = 'A';
int i = 100;
long l = 1000L;

a. b = (byte)i; 바이트와 인트 비교 인트가 더 큼
b. ch음수표현 안됨 = (char)b바이트 :음수표현할수있다.; 캐랙터와  바이트 비교 
c. short s음수 표현할수있다 = (short)ch음수표현안됨; 둘다 2바이트
d. float f = (float)l; 플롯 4바이트 롱 8바이트 플롯이 더 용량이 더큼 생략됨.
e. i = (int)ch; 캐랙터에서 인트로 형변환 인트가 훨씬더 큼

** 오른쪽이 더작을때 형변환이 가능함..
*값을 표현할수 있는 표현범위

[2-10] char타입의 변수에 저장될 수 있는 정수 값의 범위는? (10진수로 적으시오)
		
		char max:127 char min:-128


[2-11] 다음중 변수를 잘못 초기화 한 것은? (모두 고르시오)
                                      a,b,c,d
a. byte b = 256; 범위를 벗어나서 바이트 값은127까지
b. char c = ''; 따옴표안에 아무것도 없으면 안됨
c. char answer = 'no'; char 이라 한글자만 표현할수 잇는데 2글자가 들어감
d. float f = 3.14 뒤에 f빠짐
e. double d = 1.4e3f; 가능



[2-13] 다음 중 타입과 기본값이 잘못 연결된 것은? (모두 고르시오)
                                             c,e,f     
a. boolean - false
b. char - '\u0000'
c. float - 0.0 뒤에 f가 붙어야됨
d. int - 0
e. long - 0 뒤에 L이 붙어야됨
f. String - "" 기본값이 null이다.
*/