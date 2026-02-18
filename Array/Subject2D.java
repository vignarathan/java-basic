import java.util.Scanner;
class Subject2D{
	public static void main(String args[]){
		
		int[][] st;
		st=new int[5][3];
		
		
		Scanner scan=new Scanner(System.in);
		
		//Asking marks
		for(int x=0;x<5;x++){
			for(int y=0;y<3;y++){
				System.out.print("Enter marks Subject"+(y+1)+" :");
				st[x][y]=scan.nextInt();
			}
			System.out.println("");
		}
		
		//Calculation
		double q;
		for(int x=0;x<5;x++){
			int p=0;
			for(int y=0;y<3;y++){
				p=p+st[x][y];
			}
			q=p/3;
			System.out.println("Student"+(x+1)+" Total marks : "+p);
			System.out.println("Student"+(x+1)+"Average : "+q);
		}
	}
}			
				