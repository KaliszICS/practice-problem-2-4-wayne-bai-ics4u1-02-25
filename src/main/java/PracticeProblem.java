public class PracticeProblem {

	public static void main(String args[]) {
		selectionSortName(new String[] {"a","j","b","h","g","c","q"}, new int[] {1,2,3,4,5,6,7,8,9,10});
	}

	public static void printStringArray(String[] args) {

		for (int i = 0; i < args.length; i++) {
			System.out.print(args[i] + " ");
		}
		System.out.println();
	}

	public static void printIntegerArray(int[] args) {

		for (int i = 0; i < args.length; i++) {
			System.out.print(args[i] + " ");
		}
		System.out.println();
	}

	public static void selectionSortAge(String[] names, int[] ages) {



		for (int beginner = 0; beginner < names.length; beginner++) {
			int minNum = 2^31-1;
			int minIndex = -1;
			for (int i = beginner; i < names.length; i++) {
				if (minNum > ages[i]) {
					minNum = ages[i];
					minIndex = i;
				}
			}
			int middlemanAge = ages[beginner];
			String middlemanName = names[beginner];

			ages[beginner] = ages[minIndex];
			names[beginner] = names[minIndex];

			ages[minIndex] = middlemanAge;
			names[minIndex] = middlemanName;

		}

	}
	
	public static void selectionSortName(String[] names, int[] ages) {

		final String emptyString = "";

		for (int beginner = 0; beginner < names.length; beginner++) {
			String minString = emptyString; // only used while determining index, doesn't have to be exact
			int minIndex = -1;
			for (int i = beginner; i < names.length; i++) {
				// int compareResult = minString.toLowerCase().compareTo(names[i].toLowerCase());
				if (minString.toLowerCase().compareTo(names[i].toLowerCase()) > 0 ||  i == beginner) {
					System.out.println(minString + " is big");
					minString = names[i];
					System.out.println("new minimum " + minString);
					minIndex = i;
				} else {
					System.out.println(names[i] + " is bigger than " + minString); 
				}
			}
			
			int middlemanAge = ages[beginner];
			String middlemanName = names[beginner];

			ages[beginner] = ages[minIndex];
			names[beginner] = names[minIndex];

			ages[minIndex] = middlemanAge;
			names[minIndex] = middlemanName;
			
			printIntegerArray(ages);
			printStringArray(names);
			System.out.println();
		}

	}
	

}

/*
Create a method called selectionSortName(String[] names, int[] ages) that accepts two parallel arrays, one of Strings and one of ints. Sort the parallel arrays by their names. Ignore casing. Keep the arrays parallel.

Create a method called selectionSortAge(String[] names, int[] ages) that accepts two parallel arrays, one of Strings and one of ints. Sort the parallel arrays by their ages. Ignore casing. Keep the arrays parallel.
*/