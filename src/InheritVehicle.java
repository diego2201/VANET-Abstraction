
/**
 * This subclass extends AbstractVehicle. It calculates the average of the passed vehicleID and then finds
 * its corresponding ASCII value, as a letter and prints out.
 * 
 * @author Diego Cifuentes
 * @version 1 
 */
public class InheritVehicle extends AbstractVehicle
{
	/** Where the passed vehicle ID value will be stored */
	private String passedVehicle;
	
	/** Where the averages will be stored */
	private int[] average;
	
	/**
	 * Initializes an InheritVehicle object with the passed value of vanet.
	 * 
	 * @param vanet		The passed vehicleID to be initialized
	 */
	public InheritVehicle(Vanet vanet) 
	{
		this.passedVehicle = vanet.getVehicleID();
	}

	//Help from Office Hours
	/**
	 * The passed vehicleID will be used to find its averages, and then store and return an int array 
	 * containing these values
	 * 
	 * @return the an array of int holding the values of the averageAscii
	 */
	public int[] calAverage() 
	{
		//The vehicle being tested
		String vehicle = passedVehicle; //test
		
		//Initializing an int array where the values will be stored.
		average = new int[10]; 
		
		//Keeps track of the length of the vehicle ID.
		double idLength = 0;
		//Keeps track of the sum of the ASCii values.
		double asciiValue = 0;
		
		//Goes through the vehicleID
		for(int i = 0; i < vehicle.length(); i++)
		{
			//Adds the values of vehicleID into the asciiValue variable
			asciiValue += vehicle.charAt(i);
			
			//Increment length in order to keep track of the length of the vehicleID
			idLength++;
		}
		
		//Finds the average of the ASCii value, casts to double.
		double averageAscii = asciiValue / idLength;
		
		//Rounds the value of averageAscii up, using the Math.ceil method, and then casting to an int
		int averageCeil =  (int) Math.ceil(averageAscii);
		
		//Rounds the value of averageAscii down, using the Math.floor method, and then casting to an int
		int averageFloor = (int) Math.floor(averageAscii);
		
		//Statements to store the value into the array
		average[0] = averageCeil;
		average[1]= averageFloor;
		
		//Stores the average of averageAscii, using the Math.round method, which automatically
			//rounds up
		average[2] = (int) Math.round(averageAscii);
		
		return average;
	}

	//Help from Office Hours
	/**
	 * Initializes a char variable, to store the value of the Ascii. Assigns the value of average[2] to the variable
	 * casting it to an int and returning the letter.
	 * 
	 * @return the letter value of the averageAscii value
	 */
	public char letterAverage() 
	{
		//Initializes a char variable called letter, where the value of the Ascii will be stored
		char letter;		
		
		//Assigns the value of averageAscii, using the .round method, to letter, casting to a char
			//where eclipse automatically converts.
		letter = (char) average[2];
		
		return letter;
	}
}
