class average{
	public static void main(String args[]){
		int array[] = {2,3,5,7};
		int result = 0;
		int i;
		for(i=0;i<4;i++)
			result = result + array[i];

		System.out.println("Average of the array is " + result/4);
	}
}
