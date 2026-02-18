class Array6{
	public static void main(String args[]){
		int[] x={65,89,74,52,13,52,14};
		int y=x.length-1; //here~y is the index(0 to 6),length is total count of values in array(7)
		while(y>=0){
			System.out.println(x[y]);
			y--;
		}
	}
}