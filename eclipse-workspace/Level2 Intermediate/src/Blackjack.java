
public class Blackjack {

	
	String closest;
	int ADiff;
	int BDiff;
	
	public String blackjackGame(int A , int B)
	{
		if((A>21)&&(B>21))
		{
			return closest = "neither as they have both gone over 21!";
		}
		if(A ==0 || B==0)
		{
			return closest = " Please enter values above 0";
		}
		if(A>0){
			if(A>21) {
				 closest = "B was the closest value : " + B;
			}
			if ((A==21) && (B == 21)) {
				 closest = "They are both 21 so neither is the closest!";
			}
			else
				ADiff = 21- A;
		}
		if(B>0){
			if(B>21) {
				 closest = "A was the closest value: "+ A;
			}
			else
				BDiff = 21- B;
		}
			
			if(ADiff <BDiff){
				closest = "A was the closest value: "+ A;
			}
			else if(BDiff<ADiff) {
				closest = "B was the closest value : " + B;
			}
			else if(BDiff == ADiff) {
				closest = "it's a Tie !";
			}
				return closest;
	}
	
	
}
//given 2 int values > 0 return the closest to 21 without being over 21 !!! if they both go over, return 0 