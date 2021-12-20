import java.time.*;

/**
 * This subclass extends the AbstractDateTime class.
 * This class sets and gets the month and year, and then prints out them out, 
 * along with the first day of a month and the last day
 * 
 * @author Diego Cifuentes
 * @version 1
 */
public class InheritDateTime extends AbstractDateTime
{
	/** Holds the value of the given month */
	private int month;
	/** Holds the value of the given year */
	private int year;
	
	//Help from Office Hours
	/**
	 * Sets the month and year. Creates a new YearMonth objects that will be used in order
	 * to help print out given message
	 */
	public void daysOfAnyMonth(int monthOfYear, int theYear) 
	{
		//Calls the set methods for the month and year, and sets those values to the ones passed in the 
			//parameter
		setMonth(monthOfYear);
		setYear(theYear);
		
		//Creates an object of YearMonth, 
			//will help for getting things such as the last day of the month, and printing it out.
		YearMonth monthAndYear = YearMonth.of(theYear, monthOfYear);
		
		//Where the given statement is printed out with its respective month and year value.
		System.out.println("In the year " + theYear + ", for the " + monthOfYear 
				+ "th month: the first day is " + monthAndYear.atDay(1).getDayOfWeek().name() + " and the last day is " 
				+ monthAndYear.atEndOfMonth().getDayOfWeek().name());
	}

	/**
	 * Gets the month
	 * 
	 * @return the month
	 */
	public int getMonth() 
	{
		return month;
	}

	/**
	 * Sets the month variable to the given month
	 * 
	 * @param month 		The month value to be set to
	 */
	public void setMonth(int month) 
	{
		this.month = month;
	}

	/**
	 * Gets the year 
	 * 
	 * @return the year
	 */
	public int getYear() 
	{
		return year;
	}

	/**
	 * Sets the year variable to the given year
	 * 
	 * @param year		The year value to be set to
	 */
	public void setYear(int year) 
	{
		this.year = year;
	}
}