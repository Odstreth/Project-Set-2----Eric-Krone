
public class MyInteger {
	
	private int value;
	
	public MyInteger(int value){
		super();
		this.value = value;
	}
	
	public int getValue(){
		return this.value;
	}
	
	public void setValue(int value){
		this.value = value;
	}
	
	public boolean isEven(){
		return value % 2 == 0;
	}
	
	public boolean isOdd(){
		return value % 2 == 1;
	}
	
	public boolean isPrime(){
		boolean isPrime = true;
		int count = 2;
		while (isPrime && count <= Math.sqrt((double)this.value + 1)){
			if (this.value % count == 0){
				isPrime = false;
			}
			count++;
		}
		return isPrime;
	}
	
	public static boolean isEven(int value){
		return value % 2 == 0;
	}
	
	public static boolean isOdd(int value){
		return value % 2 == 1;
	}
	
	public static boolean isPrime(int value){
		boolean isPrime = true;
		int count = 2;
		while (isPrime && count <= (int)Math.sqrt((double)value)+1){
			if (value % count == 0){
				isPrime = false;
			}
			count++;
		}
		return isPrime;
	}
	
	public static boolean isEven(MyInteger value){
		return MyInteger.isEven(value.getValue());
	}
	
	public static boolean isOdd(MyInteger value){
		return MyInteger.isOdd(value.getValue());
	}

	public static boolean isPrime(MyInteger value){
		return MyInteger.isPrime(value.getValue());
	}

	
	public boolean equals(int value){
		return this.value == value;
	}
	
	public boolean equals(MyInteger value){
		return this.value == value.getValue();
	}
	
	public static int parseInt(char[] value){
		int intValue = 0;
		for ( int i = 0; i<value.length; i++){
			intValue += (int)value[i];
		}
		return intValue;
	}
	
	public static int parseString(String value){
		int[] values = new int[value.length()];
		for (int i = 0; i < value.length(); i++){
			int converter = 0;
			converter = value.charAt(i) - 48;
			values[i] = converter;
		}
		int intValue = 0;
		for ( int i = 0; i<values.length; i++){
			intValue += values[i]* (int)Math.pow(10,(values.length - (i+1)));
		}
		return intValue;
		
		
	}
	public static void main(String[] args) {
		char[] testChar = {1,2,3,4,0,9};
		System.out.println(MyInteger.parseInt(testChar));
		String testString = "123490";
		System.out.println(MyInteger.parseString(testString));
		MyInteger test = new MyInteger(827);
		System.out.println(test.getValue());
		System.out.println(test.isEven());
		System.out.println(test.isPrime());
		System.out.println(MyInteger.isPrime(800));
		
	}

}
