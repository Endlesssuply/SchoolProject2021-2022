//(c) A+ Computer Science
//www.apluscompsci.com

import java.util.ArrayList;
import java.util.Arrays;
import java.util.ListIterator;

public class IteratorReplacer
{
	private ArrayList<String> list;
	private String toRemove, replaceWith;

	public IteratorReplacer(String line, String rem, String rep)
	{
		list =  new ArrayList<String>(Arrays.asList(line.split(" ")));
		toRemove = rem;
		replaceWith = rep;
	}

	public void setEmAll(String line, String rem, String rep)
	{
		list =  new ArrayList<String>(Arrays.asList(line.split(" ")));
		toRemove = rem;
		replaceWith = rep;
	}

	public void replace()
	{
		ListIterator<String> it1 = list.listIterator();
		while (it1.hasNext())
			if (toRemove.equals(it1.next()))
				it1.set(replaceWith);
	}

	public String toString()
	{
		return list.toString() + "       " + toRemove + "       " + replaceWith;
	}
}