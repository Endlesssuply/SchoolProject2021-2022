//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class VowelWord implements Comparable<VowelWord>
{
	private String word;

	public VowelWord( String s) {
		word = s;
	}

	public String getVowelWord() {
		return word;
	}

	private int numVowels() {
		String vowels = "AEIOUaeiou";
		int vowelCount=0;
		for (int i  = 0; i < word.length(); i++) {
			if (vowels.indexOf(word.substring(i, i+1)) != -1)
				vowelCount++;
		}
		return vowelCount;
	}

	public int compareTo(VowelWord rhs)
	{
		if (this.numVowels() == rhs.numVowels())
			return this.getVowelWord().compareTo(rhs.getVowelWord());
		else
			return this.numVowels() - rhs.numVowels();
	}

	public String toString()
	{
		return word;
	}
}