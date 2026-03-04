import java.util.Scanner;
class Result3{
	public static void main(String args[]){
	  int num1,num2,num3,total;
	  Scanner scan=new Scanner(System.in);
	  
	  System.out.print("Enter your maths marks : ");
	  num1=scan.nextInt();
	  
	  System.out.print("Enter your science marks : ");
	  num2=scan.nextInt();
	  
	  System.out.print("Enter your tamil marks : ");
	  num3=scan.nextInt();
	  
	  total=num1+num2+num3;
	  
	  System.out.println("Total"+total);
}
}