import java.io.*;
import java.util.*;

/**
 * This class reads in the given file, parses the string.
 * It also initializes a new ArrayList to store the full String of the vehicle number
 * Finds the total number of vehicles with the same letter, by looking through
 * the letterVehicles ArrayList and prints these out correctly using the toString method
 * 
 * @author Diego Cifuentes
 * @version 1
 */
public class LetterAvg 
{
	private char letter; 
	
	/** Where the vehicle numbers will be stored */
	private ArrayList<String> vehicles;
	/** Where whole vehicle String will be stored */
	private ArrayList<String> storeVehiclesWithSame;
		
	//From prior project, modified for ArrayList
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
	
	//Advice from Braden
	/**
	 * Creates a new ArrayList to store in the vehicles with their letters. 
	 * Goes through the ArrayList and checks if the beginning letter is the same as the 
	 * instance variable letter. If so then add that to the ArrayList
	 * and increment numVehicles and return.
	 * 
	 * @return the amount of vehicles beginning with the same letter
	 */
	public int numberOfVehicleWithLetterAvg() 
	{
		try 
		{
			readFile();
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		
		//counter
		int numOfSameLetter = 0;
		
		//Creates a new ArrayList of String to store the whole vehicle number letters included.
		//Uses the whole vehicle number in this scenario in order to correctly outprint
			//as it is asking in the txt file
		storeVehiclesWithSame = new ArrayList<String>();
		
		//for loop to go through the vehicles ArrayList
		for(int i = 0; i < vehicles.size(); i++)
		{
			//Checks if the vehicle at i is equal to the letter passed in the method below
			if(vehicles.get(i).charAt(0) == letter)
			{
				//If so add that index to the letterVehicles 
				storeVehiclesWithSame.add(vehicles.get(i));
				
				//Increment numVehicles to keep count and print out the vehicles with the same number
					//of 'D' (in this case).
				numOfSameLetter++;
			}
		}
		
		return numOfSameLetter; 
	}
	
	/**
	 * Assigns the passed letterAverage to the instance variable letter 
	 * 
	 * @param letterAverage		the passed letter to be assigned to the instance variable letter
	 */
	public LetterAvg(char letterAverage)
	{
		//Assigns this class's instance variable "letter" to the passed
			//letterAverage parameter.
		this.letter = letterAverage;
	}

	//From prior lab
	//Uses the toString method to correctly print out the object
	/**
	 * Creates a StringJoiner object and adds the given vehicles to it and then 
	 * returns them with the given statement.
	 */
	public String toString()
	{
		//From API
		StringJoiner sj = new StringJoiner(" ");
		
		//Iterates through the letterVehicles ArrayList
		for (int i = 0; i < storeVehiclesWithSame.size(); i++)
		{
			//Adds those to the sj object
			sj.add(storeVehiclesWithSame.get(i));
		}
		
		//prints out those vehicles 
		return "These vehicles are: " + sj.toString();
	}
}
