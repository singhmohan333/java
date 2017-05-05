//average length of numbers of argument in a method

class ArgumentAverage{
	public static void main(String arg[]){
		System.out.println(average(1,3,4,5));

	}
	public static int average(int...numbers){

		int sum=0;
		for(int x : numbers )
			sum+=x;
		return sum/numbers.length;
	}

}
