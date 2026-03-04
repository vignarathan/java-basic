import java.util.Scanner;
class UserInput{
    public static void main(String args[]){
			
		Scanner scan=new Scanner(System.in);
		
		String name;
		System.out.print("Enter Your Name : ");
		name=scan.next();
		System.out.println("Your name is : "+name);
		
		System.out.println("*************************************");

        int num=0;                                //0 is the default value
        System.out.print("Enter your Number : ");
        num=scan.nextInt();
		System.out.println("Your Number is : "+num);
	}
 }