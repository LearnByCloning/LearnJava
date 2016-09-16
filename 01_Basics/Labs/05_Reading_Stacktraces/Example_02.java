public class Example_02 {

    public static void main(String[] args) {
        int x = getIntegerFromString("123");
        int y = getIntegerFromString("hello world");
        System.out.println(x);
        System.out.println(y);
    }

    public static int getIntegerFromString(String myString) {
        return Integer.parseInt(myString);
    }

}
