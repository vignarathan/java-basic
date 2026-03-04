import java.util.Scanner;
class PhoneBill{
 public static void main(String args[]){
 int x=0;
 int a;
 double b,c,d;
  Scanner scan=new Scanner(System.in);
  System.out.println("*******************************");
	System.out.println("*PHONE BILL*");
	System.out.println("*******************************");
	System.out.print("Enter Your Phone Call Time (in minutes) :");
	x=scan.nextInt();
	if(30>=x){
		a=x*2;
		System.out.println("Amount Payable :LKR"+a);
	}else if(60>=x){
		b=(x-30)*1.50+(30*2);
		System.out.println("Amount Payable :LKR"+b);
	}else if(120>=x){
		c=(x-60)*1+(30*1.50)+(30*2);
		System.out.println("Amount Payable :LKR"+c);
	}else{
		d=(x-120)*0.50+(60*1)+(30*1.50)+(30*2);
		System.out.println("Amount Payable :LKR"+d);
	}
	System.out.println("*********************************************************");
		 
 }
} 