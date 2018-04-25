
public class TooHot {

	
	public boolean weather (int temperature, boolean isSummer)
	{
		if(isSummer) {
			if((temperature >=60) &&(temperature<=100)){
				return true;
			}
		}
		
		if((temperature >=60) &&(temperature<=90)){
			return true;
		}
		
		else
		
		return false;
		
	}
}
