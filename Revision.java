public class Revision {
	
	public int fibonacci(int index){
		switch(index){
			case 1 : return 0;
			case 2 : return 1;
			default : return fibonacci(index-1) + fibonacci(index-2);
		} 
	}

	public int factorial (int number){
		return (number <= 0) ? 1 : number * factorial(number-1);
	}
}