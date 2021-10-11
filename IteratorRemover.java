//(c) A+ Computer Science
//www.apluscompsci.com


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class IteratorRemover
{
	private ArrayList<String> list;
	private String toRemove;

	public IteratorRemover(String line, String rem)
	{
		list =  new ArrayList<String>(Arrays.asList(line.split(" ")));
		toRemove = rem;
	}

	public void setTest(String line, String rem)
	{
		list =  new ArrayList<String>(Arrays.asList(line.split(" ")));
		toRemove = rem;
	}

	public void remove()
	{
		Iterator<String> it1 = list.iterator();
		while (it1.hasNext())
			if (toRemove.equals(it1.next()))
				it1.remove();
	}

	public String toString()
	{
		return list.toString() + "       " + toRemove;
	}
}