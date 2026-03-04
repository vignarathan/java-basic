import java.util.Scanner;
class Name{
	public static void main(String args[]){
		
		Scanner scan=new Scanner(System.in);
		
		System.out.print("Enter your name:");
		String x=scan.next();
		
		System.out.print("Enter your name(with space):");
		String y=scan.nextLine();
		
		System.out.println(x);
		System.out.println(y);
	}
}
		
		
		