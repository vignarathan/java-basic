import java.util.Scanner;
class Switchsimplecalculator{
	public static void main(String args[]){
		double x,y,z;
		String c;
	     
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter first number: ");
		x=scan.nextDouble();
		System.out.print("Enter second number: ");
		y=scan.nextDouble();
		System.out.print("Enter operator: ");
		c=scan.next();
		
		switch(c){
			case "+":
				z=x+y;
				System.out.println("Answer: "+z);
			break;
			case "-":
				z=x-y;
				System.out.println("Answer: "+z);
			break;
			case "*":
				z=x*y;
				System.out.println("Answer: "+z);
			break;
			case "/":
			    if((y==0) && (x!=0)){
					System.out.println("Infinity");
				}else if((x==0) && (y==0)){
					System.out.println("Undefined");
				}else{
					z=x/y;
					System.out.println("Answer: "+z);
				}
			break;
			default:
				System.out.println("Invalid operation");
		}
	}
}
			
