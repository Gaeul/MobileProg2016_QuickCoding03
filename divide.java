import java.util.Scanner;


public class divide {
	
	static void callException() throws MyException{
		throw new MyException();
	} //callException 함수는 MyException()을 new로 생성한 후 callException() 함수를 호출한 main 함수로 던진다.

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1,s2;
		int x,y;

		
		try {
			
			Scanner scanner = new Scanner(System.in);
			
			System.out.println("숫자를 두 개 입력하시오");
			s1 = scanner.next(); //문자열 읽어오기
			s2 = scanner.next();		
			
			x=Integer.parseInt(s1);
			y=Integer.parseInt(s2);
			
			if (x>=1000 || y>=1000){
				callException();
			}//1000이 넘으면 예외처리
			
			System.out.println("나눗셈을 하면:"+ x/y);
			
		}catch(ArithmeticException e){
			System.out.println("0으로 나눌 수 없습니다.");
		}catch(NumberFormatException ie){
			System.out.println("숫자를 입력해주세요.");
		}catch(MyException e){
			System.out.println(e.getMessage());
		}
	}

}
