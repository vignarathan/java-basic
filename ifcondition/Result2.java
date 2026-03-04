import java.util.Scanner;
class Result2{
	public static void main(String args[]){
		int marks1,marks2,marks3,tot,ave;
		Scanner scan=new Scanner(System.in);
	     
		System.out.print("Enter Your Combined Maths marks : ");
		marks1=scan.nextInt();
		
		System.out.print("Enter Your Physics marks        : ");
		marks2=scan.nextInt();
		
		System.out.print("Enter Your Chemistry marks      : ");
		marks3=scan.nextInt();
	    
		tot=marks1+marks2+marks3;
		ave=tot/3; 
		
	    System.out.println("Total   : "+ tot);
		System.out.println("Average : "+ ave);
	     
		if (ave>50){
			 System.out.println("Result  : Pass");
		 }else{ 
		     System.out.println("Result  : Fail");
		 }
	    System.out.print("******************************************************");	
			
	}
}
		