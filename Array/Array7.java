class Array7{
	public static void main(String args[]){
		String[] country={"India","Srilanka","England","Nepal","Korea","Japan"};
		int y=country.length-1;
		do{
			System.out.println(country[y]);
			y=y-1;
		}while(y>=0);
	}
}