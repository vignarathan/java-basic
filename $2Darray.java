class $2Darray{
	public static void main(String args[]){
		int[][] x; //array declaration
		
		x=new int[2][5]; //array constraction
		
		x[0][0]=5;
		x[0][1]=8;
		x[0][2]=6;
		x[0][3]=7;
		x[0][4]=4;
		x[1][0]=3;
		x[1][1]=2;
		x[1][2]=1;
		x[1][3]=9;
		x[1][4]=10;
		
		System.out.println(x[1][4]);//10
		System.out.println(x[0][4]);//4
		System.out.println(x[1][3]);//9
		
		
	}
}