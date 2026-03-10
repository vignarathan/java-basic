class Sum2Darray{
	public static void main(String args[]){
		
		int[][] x={
					{1,3,2},    //sum=44
					{5,3,4},
					{3,5,6},
					{5,3,4}
				  };
					int a=0,z=0;
					while(a<=3){
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
