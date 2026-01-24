import java.util.Scanner;
class Result{
	public static void main(String args[]){
		int marks1,marks2,marks3;
		Scanner scan=new Scanner(System.in);
	     
		System.out.print("Enter Your Combined Maths marks : ");
		marks1=scan.nextInt();
		
		System.out.print("Enter Your Physics marks        : ");
		marks2=scan.nextInt();
		
		System.out.print("Enter Your Chemistry marks      : ");
		marks3=scan.nextInt();
	  
		System.out.println("Total   : "+(marks1+marks2+marks3));
		System.out.println("Average : "+(marks1+marks2+marks3)/3);
	     
		 if (((marks1+marks2+marks3)/3)>50){
			 System.out.println("Result  : Pass");
		 }else{ 
		     System.out.println("Result  : Fail");
		 }
	    System.out.print("******************************************************");	
			
	}
}
		