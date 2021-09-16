//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class RomanNumeral implements Comparable<RomanNumeral> {
	private int number;
	private String roman;

	private final static int[] NUMBERS= {1000,900,500,400,100,90,
													50,40,10,9,5,4,1};

	private final static String[] LETTERS = {"M","CM","D","CD","C","XC",
												  "L","XL","X","IX","V","IV","I"};

	public RomanNumeral(String str)
	{
		this.setRoman(str);
	}

	public RomanNumeral(int orig)
	{
		this.setNumber(orig);
	}

	//write a set number method
	public void setNumber(int num) {
		number = num;
		roman = "";
		for (int i = 0; i < NUMBERS.length; i++) {
			int romanCount = num / NUMBERS[i];
			while (romanCount > 0) {
				roman += LETTERS[i];
				num-= NUMBERS[i];
				romanCount--;
			}
		}
	}

	//write a set roman method
	public void setRoman(String num) {
		roman = num;
		number = 0;
		for(int i = 0; i < NUMBERS.length; i ++) {
			while(num.indexOf(LETTERS[i]) == 0) {
				number += NUMBERS[i];
				num = num.substring(LETTERS[i].length());
			}
		}
	}

	//write get methods for number and roman
	public int getNumber() {
		return number;
	}
	public String getRoman() {
		return roman;
	}
	

	public int compareTo(RomanNumeral r)
	{
		return this.getNumber() - r.getNumber();
	}

	//write  toString() method
	public String toString() {
		return roman;
	}
}