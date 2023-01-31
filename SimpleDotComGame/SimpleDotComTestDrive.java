public class SimpleDotComTestDrive {
	public static void main(String[] args) {
		SimpleDotCom dot = new SimpleDotCom();

		int[] locations = {2, 3, 4};
		dot.setLocationCells(locations);

		String userGuess = "2";
		String result = dot.checkYourself(userGuess);
		//String testResult = "failed";
		
		//if (result.equals("hit"))
		//	testResult = "passed";

		//System.out.println(testResult);
	}
}

/*

Prep Code:

Declare an int array to hold the number of cells. Call it locationCells.

Declare an int to hold the number of hits. Call it numOfHits and set it to 0.

Declare a checkYourself() method that takes a string for the user's guess, checks it and returns a result representing a "hit", "miss" or "kill".

Declare a setLocationCells() setter method that takes an int array.

Method String checkYourself(String userGuess)
	Get the user guess as a String parameter
	Convert the user guess to an int
	REPEAT with each of the location cells in the int array
		// Compare the user guess to each location
		IF the user guess matches
			Increment the number of hits
			// Find OUT if it was the last location cell:
			IF number of hits is 3, RETURN kill as the result
			ELSE it was not a kill, so RETURN hit
			END IF
		ELSE the user guess did not match, so RETURN miss
		END IF
	END REPEAT	
END METHOD

*/