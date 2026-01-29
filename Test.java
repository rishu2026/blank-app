public class TestApp {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        int sum = a + b;

        System.out.println("Sum = " + sum);

        if (sum == 30) {
            System.out.println("Test Passed ✅");
        } else {
            System.out.println("Test Failed ❌");
        }
    }
}
