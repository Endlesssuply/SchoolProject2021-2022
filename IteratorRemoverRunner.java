//(c) A+ Computer Science
//www.apluscompsci.com

public class IteratorRemoverRunner
{
	public static void main (String[] args)
	{
		//add test cases
		String inputLine = "a b c a b c a";
		String inputWord = "a";

		//c1
		IteratorRemover iteratorRemover = new IteratorRemover(inputLine, inputWord);
		System.out.println(iteratorRemover);
		iteratorRemover.remove();
		System.out.println(iteratorRemover);

		//c2
		iteratorRemover.setTest("a b c d e f g h i j x x x x", "x");
		System.out.println(iteratorRemover);
		iteratorRemover.remove();
		System.out.println(iteratorRemover);

		//c3
		iteratorRemover.setTest("1 2 3 4 5 6 a b c a b c", "b");
		System.out.println(iteratorRemover);
		iteratorRemover.remove();
		System.out.println(iteratorRemover);
	}
}