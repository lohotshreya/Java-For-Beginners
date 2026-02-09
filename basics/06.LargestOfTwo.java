import java.util.Scanner;

class LargestOfTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b;
        System.out.print("Enter two numbers: ");
        a = sc.nextInt();
        b = sc.nextInt();

        if (a > b)
            System.out.println("Largest number is: " + a);
        else
            System.out.println("Largest number is: " + b);

        sc.close();
    }
}
