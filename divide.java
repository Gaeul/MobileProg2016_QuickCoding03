import java.util.Scanner;


public class divide {
	
	static void callException() throws MyException{
		throw new MyException();
	} //callException �Լ��� MyException()�� new�� ������ �� callException() �Լ��� ȣ���� main �Լ��� ������.

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1,s2;
		int x,y;

		
		try {
			
			Scanner scanner = new Scanner(System.in);
			
			System.out.println("���ڸ� �� �� �Է��Ͻÿ�");
			s1 = scanner.next(); //���ڿ� �о����
			s2 = scanner.next();		
			
			x=Integer.parseInt(s1);
			y=Integer.parseInt(s2);
			
			if (x>=1000 || y>=1000){
				callException();
			}//1000�� ������ ����ó��
			
			System.out.println("�������� �ϸ�:"+ x/y);
			
		}catch(ArithmeticException e){
			System.out.println("0���� ���� �� �����ϴ�.");
		}catch(NumberFormatException ie){
			System.out.println("���ڸ� �Է����ּ���.");
		}catch(MyException e){
			System.out.println(e.getMessage());
		}
	}

}
