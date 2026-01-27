class Results1{
	public static void main(String args[]){
		int marks=105;
		if((marks<=100)&&(marks>=75)){
			System.out.println("A");
		}else if((marks<75)&&(marks>=65)){
			System.out.println("B");
		}else if((marks<65)&&(marks>=55)){
			System.out.println("C");
		}else if((marks<55)&&(marks>=45)){
			System.out.println("S");
		}else{
			System.out.println("Invalid marks,Please enter a valid marks");
	    }
	  
	}			
}		