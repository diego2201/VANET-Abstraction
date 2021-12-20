# Project 2: VANET Abstraction

## UML Class Diagram
![Project 2 - Page 1 (1)](https://user-images.githubusercontent.com/89539958/136307601-273b3a98-01b8-42d7-a8c6-00b51b6b59ff.jpeg)

![Project 2 - Page 1 (2)](https://user-images.githubusercontent.com/89539958/136307685-feca49d6-25dc-4048-8c1b-0c8ad5bdf849.jpeg)

![Project 2 - Page 1 (3)](https://user-images.githubusercontent.com/89539958/136307767-5bb58747-1b41-4f0e-96d8-ba3ccfa684a1.jpeg)

![Project 2 - Page 1 (4)](https://user-images.githubusercontent.com/89539958/136309252-f59b5aa2-f3b2-488f-ab9c-5e21c436ef1b.jpeg)

![Project 2 - Page 1 (5)](https://user-images.githubusercontent.com/89539958/136309276-19c15b36-78ce-4c31-bcb1-ee4aee5136c8.jpeg)

![Project 2 - Page 1 (6)](https://user-images.githubusercontent.com/89539958/136309294-2b8503cd-d77d-4136-ad0b-6b74ead88640.jpeg)

## InheritDateTime (extends AbstractDateTime)
* `daysOfAnyMonth(int monthOfYear, int theYear)`: Creates a new YearMonth object and then passes and assigns the passed parameters, using the setter methods, to that object. Uses the newly created YearMonth object and methods to create a print statement in the correct format.

* `getMonth()`: Returns the month .

* `setMonth(int month)`: Sets the instance variable to the passed month.

* `getYear()`: Returns the year.

* `setYear(int year)`: Sets the instance variable to the passed year.

## InheritVANET (extends AbstractVANET)
* `InheritVANET(String brandName, int vehicleNumber, String vehicleAddress, int price)`: Calls the parent constructor from the abstract class and assigns those passed variables. Uses the private variable cost, and the setter methods to set the passed price to cost. 

* `mailPriceCheck()`: Prints out the given statement from the Output file using super.getName() to get the vehicle name and the cost variable.

* `getCost()`: Returns the cost 

* `setCost(int cost)`: Sets the instance variable cost to the passed parameter.

## InheritVehicle
* `InheritVehicle(Vanet vanet)`: Assigns the passed vanet (vehicleID) to the instance variable passedVehicle.

* `calAverage()`: Used to find the averages of the vehicle number and then store it in an array and returns it. Does this by initalizing a new array, a double variable of length and asciiValue. Goes through a for loop to look at the vehicle at each Char and then add that to the asciiValue and increments length. Then does "double averageAscii = asciiValue / idLength;" to find the average. Next the method uses the Math.ceil, floor, and round, on the averageAscii value and stores then in the array and returns it.

* `letterAverage()`: Initalizes a new char variable named letter, and then assigns the value at array[2] to that variable. Also casts this value using (char) which automatically converts it to the letter.

## LetterAvg
* `readFile()`: Reads in the file. Uses br.readLine() three times in order to skip the first 3 lines as those have nothing that we need. Then goes through a while loop to go though each line of the file and stores them to a ArrayList named fileLines. After that initalize a new ArrayList named vehicles and goes through a for loop to go through file lines. While in the for loop we use substring to grab the vehicle info (ex: AAv001), and adds them to the vehicles ArrayList.

* `numberOfVehicleWithLetterAvg()`: This methods searches for how many vehicles have the same beginning letter. Creates a new ArrayList in order to store the whole vehicle information, which is needed in order to print out correctly. Then uses a for loop in order to go through the whole ArrayList of vehicles, which is obtained by calling the readFile method. Then checks if the first char of vehicles at a given line (i), is the same as the letter passed in the method below, if so then increment the counter and return. However, at the same time we store the vehicles to the new ArrayList storeVehiclesWithSame in order to help with the toString method.

* `LetterAvg(char letterAverage)`: Assigns the passed letterAverge to the instance variable letter.

* `toString()`: Used in order to print out correctly. In this case we use the StringJoiner. We use a for loop to go through the storeVehiclesWithSame and add those to the sj method and prints them out in the return statement.

## PosAvg
* `readFile()`: Reads in the file. Uses br.readLine() three times in order to skip the first 3 lines as those have nothing that we need. Then goes through a while loop to go though each line of the file and stores them to a ArrayList named fileLines. After that initalize a new ArrayList named vehicles and goes through a for loop to go through file lines. While in the for loop we use substring to grab the vehicle info (ex: AAv001), and adds them to the vehicles ArrayList.

* `PosAvg(String vehicleID)`: Assigns the passed vehicleID to the instance variable vehicle

* `indexOfVehicle()`: Gets the vehocleID from the vehicles ArrayList and assigns that to the index and returns it. Also uses "+1" in order to grad the right vehicle. 

* `toString()`: Used in order to print out correctly. We declare a new int variable named index and then call the indexOfVehicle method (described above) and assign what is returned to that variable. Then creates 4 String variables (the vehicle numbers whose average will equal that of the passed ID), and gets the index of each vehicle. Needed to use a few arithmetic operations in order to correctly grab the correct vehicles. Then uses the return statement and these String variables to print out.
