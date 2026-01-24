import java.util.Scanner;
 class WaterBill{
	 public static void main(String args[]){
		 int x=0;
		 int y,a,z;
		 double b;
		 Scanner scan=new Scanner(System.in);
		 System.out.println("*******************************");
		 System.out.println("*WATER BILL*");
		 System.out.println("*******************************");
		 System.out.print("Enter Your Water Usage (in litres) : ");
		 x=scan.nextInt();
		 if(1000>=x){
		  System.out.println("Amount Payable : LKR500");
		 }else if(5000>=x){
			y=500+((x-1000)*3);
			System.out.println("Amount Payable : LKR"+y);
		 }else if(15000>=x){
			a=x-5000;
			z=500+(4000*3)+(a*5);
			System.out.println("Amount Payable : LKR"+z);
		 }else{
			a=x-5000;
			z=500+(4000*3)+(a*5);
			b=z+(z*0.03);
			System.out.println("Amount Payable (with 3% tax) : LKR"+z);
	      }
		  System.out.println("*********************************************************");
	 }
 }