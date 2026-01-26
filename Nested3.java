class Nested3{
 public static void main(String args[]){
    int x=1;
	while(x<=5){
		int y=1;
		while(y<=5){
			System.out.print(x);
			y++;
		}
	    System.out.println("");
		x++;
	}
  System.out.println("--------------------");
    int b=5;
	while(b>0){
		int a=1;
		while(a<=5){
			System.out.print(b);
			a++;
		}
	    System.out.println("");
		b=b-1;
	}
  }
}