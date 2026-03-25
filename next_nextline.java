import java.util.Scanner;
 class next_nextline{
      public static void main(String args[]){
		String name,name1,name2;	
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter Your Fullname(with space) : ");
		name=scan.nextLine();
		name1=scan.next();
		name2=scan.nextLine();
		System.out.println("Your name is (with nextline first): "+name);
		System.out.println("Your name is (with next): "+name2);
		System.out.println("Your name is (with nextline after next): "+name2);
		
		System.out.println("*************************************");

	  }
 }	  
		