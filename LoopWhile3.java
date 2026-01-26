class LoopWhile3{
	public static void main(String args[]){
	int x=1;
    while(x<=5){
      if(x%2==0){
        System.out.println("*");
      }else{
		System.out.println(x); 
	  }
	  x++;
	}
	System.out.println("*************");
	int y=1;
	while(y<=5){
		if(y%2==0){
			System.out.println(y+"**");
		}else{
			System.out.println(y+"*");
		}
		y++;
	}
  }
}