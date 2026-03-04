class ForLoop3{
	public static void main(String args[]){
		for(int x=1;x<=5;x++){
			for(int y=5;y>0;y=y-1){
				if(y%2==0){
					System.out.print("*");
				}else{
					System.out.print(y);
				}
			}
			System.out.println("");
		}
		System.out.println("-----------------");
		for(int x=1;x<=5;x++){
			for(int y=1;y<=5;y++){
				if(x%2==0){
					System.out.print("*");
				}else{
					System.out.print(x);
				}
			}
		System.out.println("");
	    }
	}
}