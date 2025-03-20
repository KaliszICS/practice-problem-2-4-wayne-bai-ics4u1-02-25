
class Notes {
	public static void main(String[] args) {

		int[] testArray = {5, 9, 1, 2, 3, 5, 7, 8, 2, 3, 14, 356, 25, 8, 26, 8, 3, 5};


		for (int i = 0; i < testArray.length - 1; i++) {
			int smallestIndex = i;
			for (int j = i + 1; j < testArray.length; j++) {
				if (testArray[smallestIndex] > testArray[j]) {
					smallestIndex = j;
				}
			}
			//we have smallest element
			//swap
			int temp = testArray[smallestIndex];
			testArray[smallestIndex] = testArray[i];
			testArray[i] = temp;
		}
		

		for (int i = 0; i < testArray.length; i++) {
			System.out.print(testArray[i] + " ");
		}



		
		// //Selection Sort

		// int smallestIndex;

		// for (int i = 0; i < testArray.length; i++) { //this is reducing the unsorted portion of the array
			
		// 	smallestIndex = i; //setting smallestIndex to the first element of the UNSORTED portion of the array
			
		// 	for (int j = i + 1; j < testArray.length; j++) {//these are the elements we compared TO - unsorted array
		// 		//smallestIndex to the current element of the array
		// 		if (testArray[j] < testArray[smallestIndex]) { //replace smallest index if the current index is smaller
		// 			smallestIndex = j;
		// 		}
		// 	}

		// 	//Swap the smallestIndex to the beginning of the unsorted portion of the array
		// 	int tempVar = testArray[smallestIndex];
		// 	testArray[smallestIndex] = testArray[i];
		// 	testArray[i] = tempVar;
		// }
		



		// System.out.println(Arrays.toString(testArray));
	}
}
