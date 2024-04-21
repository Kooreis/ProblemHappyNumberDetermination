```java
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number to check if it is a happy number:");
        int num = scanner.nextInt();
        if (isHappy(num)) {
            System.out.println(num + " is a happy number");
        } else {
            System.out.println(num + " is not a happy number");
        }
    }

    public static boolean isHappy(int n) {
        Set<Integer> seen = new HashSet<>();
        while (n != 1) {
            int current = n;
            int sum = 0;
            while (current != 0) {
                sum += (current % 10) * (current % 10);
                current /= 10;
            }
            if (seen.contains(sum)) {
                return false;
            }
            seen.add(sum);
            n = sum;
        }
        return true;
    }
}
```