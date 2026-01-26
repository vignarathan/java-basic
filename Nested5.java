class Nested5{
	public static void main(String args[]){
		int x=1;
		while(x<=5){
			int y=5;
			while(y>0){
				if(y%2==0){
					System.out.print("*");
				}else{
					System.out.print(y);
				}
				y=y-1;
			}
		    System.out.println("");
			x++;
		}
		System.out.println("------------------------");
		int a=1;
		while(a<=5){
			int b=1;
			while(b<=5){
				if(a%2==0){
					System.out.print("*");
				}else{
					System.out.print(a);
				}
				b++;
			}
			System.out.println("");
			a++;
		}
	}
}