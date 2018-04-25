
public class Main {

	public static void main(String[] args) {

		String Hello = "Hello My Friends !"; // string 
		
		HelloMyFriends myFriends = new HelloMyFriends();// creating object
			myFriends.HelloMyFriend(Hello);// calling method
		
		Summation mySum = new Summation (); // creating sum object
			System.out.println(mySum.Sum(2, 3, true)); // printing out returned result from method where true is addition
			System.out.println(mySum.Sum(3, 3, false));// false is multiplication
		
		Iteration myIteration = new Iteration();// creating iteration object
			myIteration.myIteration(3);// calling method passing in value for number of iterations 
		
		Arrays myArray = new Arrays();// creates "Arrays" object
			myArray.arraySum(true);//calls method to use array values in the sum method or multiply if set to false
			myArray.arrayIteration();// prints out all members in array
			myArray.arrayCrazyIteration(10); // call my iteration method for arrays
	}

}
