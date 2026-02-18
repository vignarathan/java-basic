class Irregulararray{
	public static void main(String args[]){
		int[][] x=new int[3][];
		x[0]=new int[2];
		x[1]=new int[4];
		x[2]=new int[3];
		
		x[0][0]=65;
		x[0][1]=85;
		x[1][0]=96;
		x[1][1]=45;
		x[1][2]=87;
		x[1][3]=63;
		x[2][0]=85;
		x[2][1]=75;
		x[2][2]=68;
		
		for(int a=0;a<3;a++){
			for(int b=0;b<x[a].length;b++){
				System.out.println(x[a][b]);
			}
		}
	}
}