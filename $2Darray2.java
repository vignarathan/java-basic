class $2Darray2{
	public static void main(String args[]){
		int[][] x;
		x=new int[2][5];
		x[0][0]=25;
		x[0][1]=45;
		x[0][2]=84;
		x[0][3]=87;
		x[0][4]=63;
		x[1][0]=12;
		x[1][1]=45;
		x[1][2]=36;
		x[1][3]=45;
		x[1][4]=85;
		
		for(int a=0;a<=1;a++){
			for(int b=0;b<=4;b++){
				System.out.println(x[a][b]);
			}
		}
	}
}
		