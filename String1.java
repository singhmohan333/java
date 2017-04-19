class String1{
public static void main(String arg[]){

	int arr[]={12,44,77,33,23,32,55,900};
	System.out.print("given list ");
	for(int i=0;i<5;i++)
	{
	System.out.print("  " + arr[i] +"\n");
	}

for(int i=0;i<arr.length;i++)
{
	for (int j=i+1;j<arr.length;j++)
	{
		if(arr[i]<arr[j]){
			int temp = arr[i];
		      arr[i]=arr[j];
		      arr[j]=temp;
		}
	}
}
System.out.print("short list");
for(int i=0;i<arr.length;i++)
{
	System.out.print(" " + arr[i] +"\n");

}
}	

}
