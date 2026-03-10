class $2Darray1{
	public static void main(String args[]){
		int[][] x;
		x=new int[3][4];
		
		x[0][0]=12;
		x[0][1]=15;
		x[0][2]=54;
		x[0][3]=85;
		x[1][0]=6;
		x[1][1]=58;
		x[1][2]=74;
		x[1][3]=32;
		x[2][0]=12;
		x[2][1]=22;
		x[2][2]=14;
		x[2][3]=9;
		
		int a=0;
		while(a<=2){
			int b=0;
			while(b<=3){
				System.out.println(x[a][b]);
				b++;
			}
		    System.out.print("");
			a++;
		}
	}
}
		