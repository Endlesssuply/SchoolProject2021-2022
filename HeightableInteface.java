import java.util.ArrayList;
import java.util.Arrays;

interface Heightable {
    int getHeight();
    String getType();
}

class House implements Heightable {
    private int height;

    public House(int height) {
        this.height = height;
    }

    public int getHeight() {
        return height;
    }
    public String getType() {
        return "House";
    }
}

class Person implements Heightable{
    private int height;

    public Person(int height) {
        this.height = height;
    }

    public int getHeight() {
        return height;
    }
    public String getType() {
        return "Person";
    }
}

class HeightableInterface {
    public static void main(String args[]) {
        ArrayList<Heightable> heightList = new ArrayList<Heightable>(Arrays.asList(new Person(123), new Person(234), new House(321), new House(432)));

        for(int i = 0; i < heightList.size(); i++) {
            System.out.println(heightList.get(i).getType() + ": " + heightList.get(i).getHeight() + " meters tall");
        }
    }
}