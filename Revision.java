public class Revision {
	
	public int fibonacci(int index) {
		switch(index){
			case 1 : return 0;
			case 2 : return 1;
			default : return fibonacci(index-1) + fibonacci(index-2);
		} 
	}

	public int factorial (int number) {
		return (number <= 0) ? 1 : number * factorial(number-1);
	}

	public int[] add (int[] numbers, int toBeIncrementBy) {
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] += toBeIncrementBy;
		}
		return numbers;
	}

	public int readBinary(int binaryNumber){
		int decimalNumber = 0;
		int i = 0;
		while(binaryNumber > 0){
			int remainder = binaryNumber % 10;
			int remOfOneDigit = remainder*(int)Math.pow(2,i);
			decimalNumber += remOfOneDigit;
			binaryNumber /= 10;
			i++;
		}
		return decimalNumber;
	}

	public int[] convertToBinary(int decimalNumber){
		int[] binaryNumber = new int[25];
		int index = 0;
		while(decimalNumber > 0){
			binaryNumber[index] = decimalNumber % 2;
			decimalNumber /= 2;
		}
		int[] number = new int[index+1];
		for (int count = 0; count <= index; count++) {
			number[count] = binaryNumber[index];
			index--;
		}
		return number;
	}
}