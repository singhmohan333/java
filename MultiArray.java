class MultiArray{
	public static void main(String arg[])
	{
	int arrayfirst[][]={{1,2,3,4},{7,8,9,10},{8,9}};
	int arraysecond[][]={{10,20,30,40},{50,60},{70,80}};

 	 	System.out.println("first arry is");
 	 	display(arrayfirst);	
 	 	System.out.println("second arry is");
 	 	display(arraysecond);
	}

	public static void display(int x[][]){
		for(int i=0;i<x.length;i++){
			for(int j=0;j<x[i].length;j++){
				System.out.print(x[i][j]+ "\t");
			}
			System.out.println();
		}


	}
	
}