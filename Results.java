class Results{
	public static void main(String args[]){
		int x=105;
		if(x<=100&&x>=0){
			if(x>=75){
				System.out.println("A");
			}else if(x>=65){
				System.out.println("B");
			}else if(x>=55){
				System.out.println("C");
			}else if(x>=45){
				System.out.println("S");
			}else{
				System.out.println("F");
			}
		}
		else{
		  System.out.println("Invalid marks");
		}
		
	}			
}		

