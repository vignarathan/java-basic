class $2Darray3{
	public static void main(String args[]){
		int[][] x;
		x=new int[2][3];
		x[0][0]=12;
		x[0][1]=53;
		x[0][2]=63;
		x[1][0]=96;
		x[1][1]=45;
		x[1][2]=78;
		
		int a=0;
		int z=0;
		while(a<=1){
			int b=0;
			while(b<=2){
				z=z+x[a][b];
				b++;
			}
		    a++;
		}
		System.out.println(z);
	}
}
		
