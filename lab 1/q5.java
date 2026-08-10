import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int id = sc.nextInt();
        String name = sc.next();

        int present = 0;
        int absent = 0;

        for (int i = 0; i < 7; i++) {

            int x = sc.nextInt();

            if (x != 0 && x != 1) {
                System.out.println("Invalid Attendance Input");
                return;
            }

            if (x == 1)
                present++;
            else
                absent++;
        }

        double percentage = present * 100.0 / 7;

        System.out.printf("Attendance = %.2f%%%n", percentage);
        System.out.println("Absent Days = " + absent);

        if (percentage >= 90)
            System.out.println("Eligible");
        else
            System.out.println("Not Eligible");
    }
}