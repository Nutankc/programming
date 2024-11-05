public class HelloWorld {

    public static void greet() {
        System.out.println("Hello! Welcome to the Java program.");
    }

    public static void main(String[] args) {
        greet();
        int sum = addNumbers(5, 10);
        System.out.println("The sum is: " + sum);
    }

    public static int addNumbers(int a, int b) {
        return a + b;
    }
}
