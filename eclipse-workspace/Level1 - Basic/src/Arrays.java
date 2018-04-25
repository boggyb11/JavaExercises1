
public class Arrays {

	int[] myArr = {1,2,3,4,5,6,7,8,9,10}; 
	
	
	public  void arraySum (boolean condition)
	{
		Summation mySum = new Summation();
			System.out.println(mySum.Sum(myArr[0], myArr[1], condition));
	}
	
	public void arrayIteration()
	{
		for (int numbers : myArr)
			System.out.println(numbers);
	}
	
	public void arrayCrazyIteration(int Max)
	{
		//populate an int array with values in a for loop
		//output them at each iteration
		
		//another loop goes through the array changing values to be 10* bigger and output them
		
		int [] newArray = new int [Max];
		
		for(int i =0; i<Max; i++)
		{
			newArray[i]= i;
			System.out.println(newArray[i]);
		}
		for(int number: newArray)
		{
			newArray[number]= number*10;
			System.out.println(newArray[number]);
		}
	}
	
	
}
