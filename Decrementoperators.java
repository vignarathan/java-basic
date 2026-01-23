class Decrementoperators{
	public static void main(String args[]){
		int y=15;
		
		y =y- 5;
		System.out.println(y);//10
		
		y  -= 5;
		System.out.println(y);//5
		
		//post decrement
		y--;
		System.out.println(y);//4
		
		//pre decrement
		--y;
		System.out.println(y);//3
		
		System.out.println(y--);//3//post decrement
		System.out.println(y);//2
		System.out.println(--y);//1//pre decrement
	}
}