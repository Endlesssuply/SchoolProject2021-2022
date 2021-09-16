//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Dmitrii Vlasov

public class Word implements Comparable<Word> {
	private String word;

	public Word( String s ) {
		word = s;
	}

	public String getWord() {
		return word;
	}

	//compareTo method that allows us to sort arr
	public int compareTo(Word rhs) {
		if (word.length() == rhs.getWord().length())
			return word.compareTo(rhs.getWord());
		else
			return word.length() - rhs.getWord().length();
	}

	public String toString() {
		return "";
	}
}