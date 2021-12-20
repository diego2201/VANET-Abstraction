import java.io.*;
import java.util.*;

/**
 * This class reads in the given file, parses the string.
 * Gets the index of the passed vehicleID
 * Finds the vehicle numbers that will average out to the that given vehicleID
 * 
 * @author Diego Cifuentes
 * @version 1
 */
public class PosAvg 
{
	/** Where the passed vehicle ID will be stored */
	private String vehicle;
	/** Where the parsed vehicles will be read in */
	private ArrayList<String> vehicles;
		
	//From prior project modified for ArrayList
	/**
	 * Reads in the file, stores each line temporarily and then parses the 
	 * vehicle numbers in order to be stored into an ArrayList
	 * 
	 * @throws IOException if file cannot be found/read in
	 */
	public void readFile() throws IOException
	{
		ArrayList<String> fileLines = new ArrayList<String>();
		File file = new File("VANETdata.txt");
		
		try(BufferedReader br = new BufferedReader(new FileReader(file)))
		{
			//Advice from Office Hours
			
			//Calls the readLine method 3x 
				//in order to avoid reading in the 
				//3 first lines in the file, which do not have
				//anything that we need.
			br.readLine();
			br.readLine();
			br.readLine(); 
			
			//Initializes a String variable where the lines of the file will be read into
			String line;
			
			//While the line in the file contains something
				//(e.g not null), go through the while loop
			while((line = br.readLine()) != null)
			{
				//Stores the read in line into a temporary
					//ArrayList
				fileLines.add(line);
			}
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
		
		//Initializes an arrayList where the vehicle numbers will be stored into.
		vehicles = new ArrayList<String>();
		
		//Uses a for loop to iterate through the ArrayList where 
			//the file lines were stored into
		for (int i = 0; i < fileLines.size(); i++)
		{
			//Passes each line grabbing the vehicle numbers, 
				//and then stores it into the vehicles ArrayList
			vehicles.add(fileLines.get(i).substring(4,10));
		}
	}
	
	/**
	 * Assigns the passed vehicleeID to the instance variable vehicle
	 * 
	 * @param vehicleID		The vehicleID to be assigned to the vehicle instance variable
	 */
	public PosAvg(String vehicleID) 
	{
		try 
		{
			readFile();
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		
		//Assigns the class's instance variable to the passed vehicleID
		this.vehicle = vehicleID;
	}

	
	//Help from Office Hours
	/**
	 * Gets the vehicleID from the vehicles ArrayList and assigns that to the index and returns it
	 * 
	 * @return index number of the passed vehicleID
	 */
	public int indexOfVehicle() 
	{
		try 
		{
			readFile();
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		
		//Advice from Braden & Office Hours
		
		//Initializes and assigns the variable index to the passed index of the array vehicles,
			//which store the vehicle numbers
		//Used +1 at the end to correctly grab the right index
		int index = vehicles.indexOf(vehicle) + 1;

		//returns the index of the vehicle as an int
		return index;
	}
	
	//Advice from Braden
	/**
	 * Gets the given index of the vehicles that average out to the given ID 
	 * and then prints them out correctly
	 */
	public String toString()
	{
		//Calls the indexOfVehicle method and assigns that returned index to a new 
			//initialized index variable
		int index = indexOfVehicle();
		
		//Initializes four new String variables and gets a vehicle number from the vehicles
			//ArrayList. 
		//In some instances would need to use arithmetic in order to grab the correct vehicle
			//as shown in the Sample Output.txt
		//gets the vehicles that numbers average out to the one in the index found
		String average1V1 = vehicles.get(index - 2);
		String average1V2 = vehicles.get(index);
		String average2V1 = vehicles.get(index - 3);
		String average2V2 = vehicles.get(index + 1);
		
		//Print statement, uses the vehicles obtained from above
		return "This index is average of " + average1V1 
				+ " and " + average1V2 + ", " + average2V1 + " and " + average2V2 + ", and so on.";
	}
}
