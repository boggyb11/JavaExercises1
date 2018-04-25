
public class UniqueSum {

	
	public int Sum(int A, int B, int C)
	{
		if(A==B) {
			if(A==C)
			{
				C=0;
			}
			A =0;B=0;
		}
		if(B==C) {
			B=0;C=0;
		}
		if(A==C) {
			A=0;C=0;
		}
		
		int total = A + B + C;
		
		
		return total;
		
	}
}
