import java.util.Scanner;
class Simplecalculator{
	public static void main(String args[]){
		double x,y,z;
		String c;
		
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter first number:");
		x=scan.nextDouble();
		System.out.print("Enter second number:");
		y=scan.nextDouble();
		System.out.print("Enter operator:");
		c=scan.next();
			
			if(c.equals("+")){
				z=x+y;
				System.out.println("Answer:"+z);
			}else if(c.equals("-")){
				z=x-y;
				System.out.println("Answer:"+z);
			}else if(c.equals("*")){
				z=x*y;
				System.out.println("Answer:"+z);
			}else if(c.equals("/")){
				z=x/y;
				System.out.println("Answer:"+z);
			}else{
				System.out.println("Invalid operation");
			}
		
	}
}