//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Dmitrii Vlasov

import java.util.Scanner;

public class MonsterRunner {
	public static void main( String args[] ) {
		Scanner keyboard = new Scanner(System.in);
		
		//ask for name and size
		//String input = keyboard.nextLine();
		//String firstName = input.substring(0, input.indexOf(" "));
		//int firstSize = Integer.parseInt(input.substring(input.indexOf(" ")+1));
		System.out.print("Enter 1st monster's name: ");
		String name = keyboard.nextLine();
		System.out.print("Enter 1st monster's size: ");
		int size = keyboard.nextInt();
		keyboard.nextLine();

		//instantiate monster one
		Skeleton s1 = new Skeleton(name, size);

		//ask for name and size
		//input = keyboard.nextLine();
		//String secondName = input.substring(0, input.indexOf(" "));
		//int secondSize = Integer.parseInt(input.substring(input.indexOf(" ")+1));
		System.out.print("Enter 2st monster's name: ");
		name = keyboard.nextLine();
		System.out.print("Enter 2st monster's size: ");
		size = keyboard.nextInt();
		keyboard.close();

		//instantiate monster two
		Zombie z1 = new Zombie(name, size);

		System.out.println();

		//output
		System.out.println("Monster 1 - " + s1);
		System.out.println("Monster 2 - " + z1);

		System.out.println();

		if (s1.isBigger(z1))
			System.out.println("Monster one is bigger than Monster two.");
		else if (s1.isSmaller(z1))
			System.out.println("Monster one is smaller than Monster two.");
		else
			System.out.println("Monster one is the same size as Monster two.");

		if (s1.namesTheSame(z1))
			System.out.println("Monster one has the same name as monster two.");
		else
			System.out.println("Monster one does not have the same name as monster two.");
	}
}