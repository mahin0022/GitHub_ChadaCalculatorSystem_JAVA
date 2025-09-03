import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input Bus Info
        System.out.print("Enter Bus Service Name: ");
        String busName = sc.nextLine();
        System.out.print("Enter Bus Base Chada: ");
        float busBase = sc.nextFloat();

        BusChada bc = new BusChada(busName, busBase);

        // Input Auto Info
        sc.nextLine(); // clear buffer
        System.out.print("Enter Auto Service Name: ");
        String autoName = sc.nextLine();
        System.out.print("Enter Auto Base Chada: ");
        float autoBase = sc.nextFloat();

        AutoStandChada ac = new AutoStandChada(autoName, autoBase);

        // Use Methods
        System.out.print("Enter quantity for Bus: ");
        int q1 = sc.nextInt();
        System.out.println("Bus Chada = " + bc.calculateChada(q1));

        System.out.print("Enter quantity for Auto: ");
        int q2 = sc.nextInt();
        System.out.println("Auto Chada = " + ac.calculateChada(q2));

        System.out.print("Enter extra % for Bus: ");
        double extraBus = sc.nextDouble();
        System.out.println("Bus Chada with extra = " + bc.calculateChada(q1, extraBus));

        System.out.print("Enter extra % for Auto: ");
        double extraAuto = sc.nextDouble();
        System.out.println("Auto Chada with extra = " + ac.calculateChada(q2, extraAuto));

        // Display Info (Polymorphism)
        Chada ch1 = new BusChada(busName, busBase);
        Chada ch2 = new AutoStandChada(autoName, autoBase);

        System.out.println("\n--- Display Info ---");
        ch1.displayInfo();
        ch2.displayInfo();

        sc.close();
    }
}