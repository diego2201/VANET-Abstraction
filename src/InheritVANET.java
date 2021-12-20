
/**
 * This subclass extends the AbstractVANET class.
 * This class creates a new InheritVANET object and stored the values
 * of the given vehicle in their respective variables.
 * It also sets and gets the cost, and prints out the mail price of
 * said vehicle 
 * 
 * @author Diego Cifuentes
 * @version 1
 */
public class InheritVANET extends AbstractVANET
{
	/** Where the value of the car cost will be stored */
	private int cost;
	
	/**
	 * Calls upon the parent class to construct the InheritVANET object.
	 * sets and then stores the passed price into a separate cost variable
	 * 
	 * @param brandName			The brand name of the vehicle passed to be set to the object
	 * @param vehicleNumber		The vehicle number of the vehicle passed to be set to the object
	 * @param vehicleAddress	The location (state) of the vehicle to be stored to the object
	 * @param price				The tag price of the vehicle to be stored to a separate vehicle. 
	 */
	public InheritVANET(String brandName, int vehicleNumber, String vehicleAddress, int price) 
	{
		//Calls the parent constuctor and assigns the passed values.
		super(brandName, vehicleNumber, vehicleAddress);
		
		//Assigns the price of the vehicle to the variable cost/
		int cost = price;
		
		//Sets the private int variable cost to the passed price.
		this.setCost(cost);
	}

	/**
	 * Prints out the mail price of the vehicle
	 */
	public void mailPriceCheck() 
	{
		//Print statements 
		System.out.println("Sending check from InheritVANET.");
		System.out.println("Mailing check to " + super.getName() + " company for price " + this.cost + ".");
	}

	/**
	 * Gets the cost 
	 * 
	 * @return the cost
	 */
	public int getCost() 
	{
		return cost;
	}

	/**
	 * Sets the cost of the vehicle
	 * 
	 * @param cost		The cost passed to be set to the cost variable
	 */
	public void setCost(int cost) 
	{
		this.cost = cost;
	}

}
