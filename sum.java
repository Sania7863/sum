package practiceit;

public class Sum {
    public static void main(String[] args) {
        int sum = 0;
        int n = 10; // Number of terms to sum

        for (int i = 1; i <= n; i++) {
            sum += i;
        }

        System.out.println("The sum of the first " + n + " natural numbers is: " + sum);
    }
}
