import java.util.Scanner;
public class Demo{

    public static void main(String[] Strings) {


        double minutesInYear = 60 * 24 * 365;

        Scanner input = new Scanner(System.in);

        System.out.print("Input the number of minutes: ");

        double minutes = input.nextDouble();

        long years = (long) (minutes / minutesInYear);
        int days = (int) (minutes/ 60 / 24) % 365;

        System.out.println((int) minutes + " minutes is approximately " + years + " years and " + days + " days");
    }
}
