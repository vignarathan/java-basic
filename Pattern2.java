class Pattern2{
	public static void main(String args[]){
		int x,y;
		for(x=5;x>0;x--){
			for(y=1;y<x;y++){
				System.out.print(" ");
			}
			for(y=1;y<=6-x;y++){
				System.out.print(y);
			}
				System.out.println("");
			
			
		}
	}
}