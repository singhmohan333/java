class Array3{
	public static void main(String arg[]){
	int sum=0;
	int arr[]= new int [5];
	arr[0]=9;
	arr[1]=8;
	arr[2]=7;
	arr[3]=6;
	arr[4]=5;

	for(int i=0;i<arr.length;i++){
		System.out.println(arr[i]);
		sum=sum+arr[i];
	}
	System.out.println("sum of all " + sum);
	}
}