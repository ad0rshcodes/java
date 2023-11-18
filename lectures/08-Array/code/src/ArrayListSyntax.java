import java.util.ArrayList;

public class ArrayListSyntax {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(10); //we can't pass primitives in array list. It has to be a wrapper class.

        list.add(67);
        list.add(69);

        System.out.println(list.contains(67));
        System.out.println(list);

        // you can't use the index method to get access elements of an arraylist.
        // list.get(0)
        System.out.println(list.get(0));


        /*
        1/ Size of an array list is fixed.
        2/ Say Arraylist fills by some amount -> it will create a new arraylist of different size.
        3/ all the elements in the old arraylist would be copied in the new one.
        4/ All this happens in O(1) time complexity.

         */


    }
}
