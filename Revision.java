public class Revision {
	public int fibonacci(int index){
		if(index==1)
			return 0;
			
		if(index==2)
			return 1;

		return fibonacci(index-1) + fibonacci(index-2);
	}

	public int factorial (int number){
		return (number <= 0) ? 1 : number * factorial(number-1);
	}
}