import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int largest = a[0];
        int second = Integer.MIN_VALUE;

        for (int i = 1; i < n; i++) {

            if (a[i] > largest) {
                second = largest;
                largest = a[i];
            }
            else if (a[i] > second && a[i] != largest) {
                second = a[i];
            }
        }

        if (second == Integer.MIN_VALUE)
            System.out.println("Second largest element does not exist");
        else
            System.out.println("Second Largest = " + second);
    }
}