//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Dmitrii Vlasov

import java.io.File; 
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class WordRunner {
	public static void main( String args[] ) throws IOException {
		// initializing scanner, creating array, etc.
		Scanner file = new Scanner(new File("src/main/java/words.dat"));
		int size = file.nextInt();
		Word[] arr = new Word[size];

		//clear the scanner
		file.nextLine();

		//parsing through the input and adding all to arr
		for (int i = 0; i < size; i++) {
			arr[i] = new Word(file.nextLine());
		}

		//sorting the array using compareTo
		Arrays.sort(arr);

		//outputting the sorted array
		for (Word elem: arr)
			System.out.println(elem.getWord());
	}
}