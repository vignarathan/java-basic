import java.util.Scanner;
class Subjectarray{
	public static void main(String args[]){
		int[] x;
		x=new int[5];
		
		Scanner scan=new Scanner(System.in);
		
		for(int y=0;y<5;y++){
			System.out.print("Enter marks Subject"+(y+1)+":");
			x[y]=scan.nextInt();
			
		}
		int p=0,q=0;
		while(p<=4){
			q=q+x[p];
			p++;
		}
		System.out.println("Total marks : "+q);
			
		
		
			
	}
}	