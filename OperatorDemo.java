public class OperatorDemo
{
	public static void main(String [] args)
	{
		int num1=100;
		int num2=50;
		int num3=1;
		boolean res=false;
		
		System.out.println((num1>num2)&&(num2>num3));
		System.out.println((num1<num2)&&(num2>num3));
		System.out.println((num1<num2)&&(res=(num2>num3)));
		System.out.println(res);
		
	}
}