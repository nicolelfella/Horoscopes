//CS 201 Assignment 1 Part 1d
//Nicole Fella

/** 
* Implement HoroscopeEngine for MohoscopeEngine
**/

public class MohoscopeEngine implements HoroscopeEngine
{
	//create randomly generated number to determine which of the Moho Places 
	int randOne = (int)(Math.random()*4);
	int randTwo = (int)(Math.random()*4);
	int randThree = (int)(Math.random()*4);

	//array of Moho Places
	String[] mohoPlaces = {"Clapp", "Kendade", "Skinner Green", 
		"Blanchard", "Upper Lake"};

	//array of phrases for horoscope
	String[] mohoscopeArray	= {"Make sure you visit ", " and ", 
		" on your way to ", " to have a great day!"};

	//intialize concatString for horoscope
	String concatString;

	public String getHoroscope()
	{
		concatString = mohoscopeArray[0] + mohoPlaces[randOne] + mohoscopeArray [1] 
			+ mohoPlaces[randTwo] + mohoscopeArray [2] + mohoPlaces[randThree] + mohoscopeArray[3];
		return concatString;
	}
}