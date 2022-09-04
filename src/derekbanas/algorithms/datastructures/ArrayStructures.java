package derekbanas.algorithms.datastructures;

/* - Algorithms are steps you take to manipulate data
- Data Structures: The way data is arranged in memory
- Main Data Structure Operations
     - Creating
     int[] arrayName - new int[];    or      int[] arrayName = {5, 12, 3};
     - Inserting
     int thirdValue = arrayName[2]; ---> the value of thirdValue variable would come from index 2
     - Deleting
     - Searching
     arrayName[1] ----> Returns index 1 in array
*/

public class ArrayStructures {

	// creating array with 50 values
	private int[] theArray = new int[50];

	private int arraySize = 10;

	public void generateRandomArray() {

		// arraySize is set to 10 above so we only need to generate 10
		for (int i = 0; i < arraySize; i++) {

			// adding to the array, only numbers between 10-19
			theArray[i] = (int) (Math.random() * 10) + 10;

		}
	}

	public void printArray() {

		System.out.println("----------");

		for (int i = 0; i < arraySize; i++) {

			// print index
			System.out.print("| " + i + " | ");

			// print array
			System.out.println(theArray[i] + " |");

			System.out.println("----------");
		}
	}

	public int getValueAtIndex(int index) {

		if (index < arraySize)

			return theArray[index];

		return 0;
	}

	public boolean doesArrayContainThisValue(int searchValue) {

		// boolean variable
		boolean valueInArray = false;

		//
		for (int i = 0; i < arraySize; i++) {

			// checando o valor de cada index comparando com o valor procurado
			if (theArray[i] == searchValue) {

				valueInArray = true;
			}
		}
		return valueInArray;
	}

	// get an index to delete from
	public void deleteIndex(int index) {

		if (index < arraySize) {
			/*
			 * overright the value of the supplied index and keep 
			 * overrighting every index
			 * that follows untill get to the last index of the array
			 */
// start from index provided / -1 because we have one less value than array size
			//because of the zero index
			for (int i = index; i < (arraySize - 1); i++) {

				theArray[i] = theArray[i + 1]; //move up values
			}
			
			arraySize--; //decrement size of the array
		}
	}
	
	public void InsertValue(int value) {
		
		if(arraySize < 50) {
			
			theArray[arraySize] = value;
			
			arraySize++;
			
		}
	}
	
	public String linearSearchForValue(int value) {
		
		boolean valueInArray = false;
		
		String indexesWithValue = "";
		
		System.out.print("The value was found in the following indexes: ");
		
		for (int i = 0; i < arraySize; i++) {
			
			if(theArray[i] == value) {
				
				valueInArray = true;
				
				System.out.print(i + "8 ");
				
				indexesWithValue += i + " ";
			}
		}
		
		if(!valueInArray) {
			
			indexesWithValue = "None";
			
			System.out.println(indexesWithValue);
			
		}
		
		System.out.println();
		
		return indexesWithValue;
		
	}

	public static void main(String[] args) {

		ArrayStructures newArray = new ArrayStructures();

		newArray.generateRandomArray();

		newArray.printArray();

		System.out.println(newArray.getValueAtIndex(3));

		System.out.println(newArray.doesArrayContainThisValue(12));
		
		newArray.deleteIndex(4);
		
		newArray.printArray();
		
		newArray.InsertValue(55);

		newArray.printArray();
		
		newArray.linearSearchForValue(17);

	}

}
