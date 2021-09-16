//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.io.File;
import java.io.IOException;
import java.util.*;
import java.util.ArrayList;
import static java.lang.System.*;

public class VowelWordRunner
{
	public static void main( String args[] ) throws IOException
	{
		// initializing scanner, creating array, etc.
		Scanner file = new Scanner(new File("src/main/java/words.dat"));
		int size = file.nextInt();
		VowelWord[] arr = new VowelWord[size];

		//clear the scanner
		file.nextLine();

		//parsing through the input and adding all to arr
		for (int i = 0; i < size; i++) {
			arr[i] = new VowelWord(file.nextLine());
		}

		//sorting the array using compareTo
		Arrays.sort(arr);

		//outputting the sorted array
		for (VowelWord elem: arr)
			System.out.println(elem.getVowelWord());
	}
}