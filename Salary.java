class Salary{
	public static void main(String args[]){
		double salary=120000.00;
	    double tax,x;
	    if(salary>=100000){
			tax=salary*3/100;
		}else{
			tax=salary*1/100;
		}
		x=salary-tax;
    System.out.println("Basic Salary : LKR"+salary);
	System.out.println("TAX : LKR"+tax);
	System.out.println("Net Salary : LKR"+x);
	

	}
}