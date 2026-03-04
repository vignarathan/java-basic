class Nested8{
	public static void main(String args[]){
	int x=1;
	while(x<=5){
		int y=5;
		while(y>=x){
			 System.out.print(y);
			 y=y-1;
		}
	    System.out.println(" ");
	    x++;
	}
	System.out.println("-----------------");
	int a=5;
	while(a>0){
		int b=1;
		while(b<=a){
			 System.out.print(a);
			 b++;
		}
	    System.out.println(" ");
	    a=a-1;
	}
	
			
	}
}