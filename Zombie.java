//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Dmitrii Vlasov

public class Zombie implements Monster {
    //add instance variables
    private String name;
    private int size;
    private int attackRange;
    //add a constructor
    public Zombie(String name, int size) {
        this.name = name;
        this.size = size;
        this.attackRange = 10;
    }
    //add code to implement the Monster interface
    public String getName() {
        return name;
    }
    public int getHowBig() {
        return size;
    }

    public boolean isBigger(Monster other) {
        return size > other.getHowBig();
    }
    public boolean isSmaller(Monster other) {
        return size < other.getHowBig();
    }
    public boolean namesTheSame(Monster other) {
        return name.equals(other.getName());
    }

    //add a toString
    public String toString() {
        return "Zombie " + name + " " + size;
    }
}