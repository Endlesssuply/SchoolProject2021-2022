public class DupeRunner {
    public static void main (String [] args) {
        UniqueDupes ud1 = new UniqueDupes("a b c d e f g h a b c d e f g h i j k");
        UniqueDupes ud2 = new UniqueDupes("one two three one two three six seven one two");
        UniqueDupes ud3 = new UniqueDupes("1 2 3 4 5 1 2 3 4 5 1 2 3 4 5 6");

        System.out.println(ud1);
        System.out.println(ud2);
        System.out.println(ud3);
    }
}
