
public class ComparisonOperator {

	public static void main(String[] args) {
		/*
		 * <<비교연산자>>
		 * - < : 작다
		 * - > : 크다
		 * - <=: 작거나 같다
		 * - >= : 크거나 같다
		 * - == : 같다
		 * - != : 같지 않다.
		 */
         
		 boolean b = 10 < 20;
		 System.out.println(b);
		 b = 10 <= 20-15;
		 System.out.println(b);
		// sysout + (ctrl+space : 자동완성)
		
		 //float과 double을 비교할때는 형변환에 주의해야한다.
		 b = 10.0f == 10.0; // 서로 타입이 다른 경우 작은쪽에서 큰쪽으로 형변환됨 플롯에서 더블로
		 System.out.println(b);
		 
		 b = 10.1f == 10.1; // 플롯은 7자리까지는 정확성 보장(정밀도),더블은 15자리까지 정확성보장
		 System.out.println(b);
		 
		 System.out.printf("%22.20f%n",10.1f); //플롯은 7자리까지 정확
		 System.out.printf("%22.20f%n",10.1); // 더블은 15자리까지 정확

		 //double을 float으로 형변환해야 정확하게 비교할수 있다.
		 b = 10.1f == (float)10.1;
		 System.out.println(b);
		 
		 b = "abc" == "abc";
		 System.out.println(b); // 같은 스트링 리터널 같은 주소를 갖는다.
		 b = "abc" == new String("abc");// new라는애가 새로운 주소를 만드는 역할을 함
		 System.out.println(b);
		 //참조형 타입은 저장된 메모리 주소를 비교하기 때문에 String은 등가비교 연산자로 내용을 비교할수 없다.
		 //String의 내용을 비교하기 위해서는 equals() 메소드를 사용한다.
		 b = "abc".equals(new String("abc"));
		 System.out.println(b);
		 b = ! "abc".equals("ABC");
		 System.out.println(b);
		 
		 //다음의 문장들을 코드로 작성해주세요.
		 
		 // 1보다 2가 큰가?
		 b = 2 > 1;
		 System.out.println(b);
	     
		 //0은 100보다 작거나 같은가?
		 b = 100 >= 0;
		 System.out.println(b);
		 
		 //3.14f와3.14는 다른가?
		 b = 3.14f != 3.14;
		 System.out.println(b); //이거 왜그런지 모르겠어 왜 낫인지..
		 
		 //"남자"와"여자"는 다른가?
		 
		 b = ! "남자".equals("여자");
		 System.out.println(b);
		 
		 
	}
	}


