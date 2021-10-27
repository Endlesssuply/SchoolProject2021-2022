public class DupeRunner {
    public static void main (String [] args) {
        UniqueDupes ud1 = new UniqueDupes("a b c d e f g h a b c d e f g h i j k");
        UniqueDupes ud2 = new UniqueDupes("one two three one two three six seven one two");
        UniqueDupes ud3 = new UniqueDupes("1 2 3 4 5 1 2 3 4 5 1 2 3 4 5 6");

        System.out.println("Original List : " + ud1.getInitialInput());
        System.out.println("Uniques : " + ud1.getUniques());
        System.out.println("Dupes : " + ud1.getDupes());
        System.out.println();

        System.out.println("Original List : " + ud2.getInitialInput());
        System.out.println("Uniques : " + ud2.getUniques());
        System.out.println("Dupes : " + ud2.getDupes());
        System.out.println();

        System.out.println("Original List : " + ud3.getInitialInput());
        System.out.println("Uniques : " + ud3.getUniques());
        System.out.println("Dupes : " + ud3.getDupes());
    }
}
