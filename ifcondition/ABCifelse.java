import java.util.Scanner;
class ABCifelse{
	public static void main(String args[]){
		int marks=0;
		Scanner scan=new Scanner(System.in);
		System.out.println("*******************************");
		System.out.print("Enter Your Marks : ");
		marks=scan.nextInt();
		System.out.println("*******************************");
		if(marks>=75){
			System.out.println("A");
		}else{
			if(marks>=65){
			  System.out.println("B");
		    }else{
				if(marks>=55){
			      System.out.println("C");
		        }else{
					if(marks>=45){
			          System.out.println("S");
		            }else{
						System.out.println("F");
					}
				}
			}
		}
	System.out.println("*******************************");				
}
	
}