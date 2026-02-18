class Highestarray{
	public static void main(String args[]){
		int[] x={91,75,63,68,84,97,76,39,100,42,18};
		int max=x[0];
		
		for(int a=0;a<x.length;a++){
			if(x[a]>max){
				max=x[a];
			}
		}
		System.out.println(max);
	}
}
		
		