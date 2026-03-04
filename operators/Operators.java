class Operators{
	public static void main(String args[]){
		
	int x=10;
	int y=3;
	
	System.out.println(x+y);
	System.out.println("x+y"+x+y);
	System.out.println(x+y+"x+y");
	System.out.println("x+y"+(x+y));
	System.out.println("*********************************************");
	
	System.out.println(x-y);
	//System.out.println("x-y"+x-y); Can't write like this
	System.out.println(x-y+"x-y");
	System.out.println("x-y"+(x-y));
	System.out.println("*********************************************");
	
	System.out.println(x*y);
	System.out.println("x*y"+x*y);
	System.out.println(x*y+"x*y");
	System.out.println("x*y"+(x*y));
	System.out.println("*********************************************");
	
	System.out.println(x/y);
	System.out.println("x/y"+x/y);
	System.out.println(x/y+"x/y");
	System.out.println("x/y"+(x/y));
	System.out.println("*********************************************");
	
	System.out.println(x%y);
	System.out.println("x%y"+x%y);
	System.out.println(x%y+"x%y");
	System.out.println("x%y"+(x%y));
	
	System.out.println("*********************************************");
	
	System.out.println(x>y);
	System.out.println(x<y);
	System.out.println(x>=y);
	System.out.println(x<=y);
	System.out.println(x!=y);
	System.out.println(x==y);
	
	System.out.println("*********************************************");
	
	//and &&
	System.out.println(true&&true);//true
	System.out.println(true&&false);//false
	System.out.println(false&&true);//false
	System.out.println(false&&false);//false
	
	System.out.println("*********************************************");
	//or ||
	System.out.println(true||true);//true
	System.out.println(true||false);//true
	System.out.println(false||true);//true
	System.out.println(false||false);//false
	
	//not
	
	}
}