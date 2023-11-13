public class Overloading {
//when 2 or more func have same name but diff number or type of arguments.

    public static void main(String[] args) {
        fun(69);
        fun("Adarsh");
    }

    private static void fun (int a){
        System.out.println(a);
    }

    private static void fun (String a){
        System.out.println(a);
    }
}
