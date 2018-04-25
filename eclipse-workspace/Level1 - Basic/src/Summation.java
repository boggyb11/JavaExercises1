
public class Summation {
	int C;
	
	public int Sum ( int A, int B,boolean condition )
	{
		if(A==0){
			return B;
		}
		if(B==0){
			return A;
		}
		if(condition == true){
			 C = A + B ;
		}
		if(condition == false) {
			 C = A*B;
		}
		
		return C;
	}
}
