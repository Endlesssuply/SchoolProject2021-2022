//(c) A+ Computer Science
//www.apluscompsci.com

public class IteratorReplacerRunner
{
	public static void main (String[] args)
	{
		//add test cases
		String inputLine = "a b c a b c a";
		String inputWord = "a";
		String inputReplacement = "+";

		//c1
		IteratorReplacer iteratorReplacer = new IteratorReplacer(inputLine, inputWord, inputReplacement);
		System.out.println(iteratorReplacer);
		iteratorReplacer.replace();
		System.out.println(iteratorReplacer);

		//c2
		iteratorReplacer.setEmAll("a b c d e f g h i j x x x x", "x", "7");
		System.out.println(iteratorReplacer);
		iteratorReplacer.replace();
		System.out.println(iteratorReplacer);


		//c3
		iteratorReplacer.setEmAll("1 2 3 4 5 6 a b c a b c", "b", "#");
		System.out.println(iteratorReplacer);
		iteratorReplacer.replace();
		System.out.println(iteratorReplacer);
	}
}