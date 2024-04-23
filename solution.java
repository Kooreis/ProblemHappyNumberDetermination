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