public class Shadowing {

    static int x = 50;

    public static void main(String[] args) {

        System.out.println(x); //50

        int x = 52; //the class variable in line 3 is shadowed by this.
        int y = 0;
        {
            // int y = 10; this will throw an error because shadowing method doesn't work in methods. [IMP]
            // You can make a local variable shadow an instance/static variable - but you can't make one local variable (your loop counter) shadow another local variable or parameter (your parameter).
            System.out.println(y);
        }
        System.out.println(x);

        fun();
    }

    private static void fun(){
        System.out.println(x); // 50
    }
}
