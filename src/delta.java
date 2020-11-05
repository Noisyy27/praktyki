import java.util.Scanner;

public class delta {
    public static void main(String[] args) {

        System.out.println("Wpisz 3 liczby: \n\n");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj pierwszą liczbę: ");
        double a = scanner.nextDouble();
        System.out.println("Podaj drugą liczbę: ");
        double b = scanner.nextDouble();
        System.out.println("Podaj trzecią liczbę: ");
        double c = scanner.nextDouble();

        System.out.println("Podane liczby: \n");
        System.out.println("A:" + a + "\n" + "B:" + b + "\n" + "C:" + c + "\n");

        if (a == 0) {
            System.out.println("Liczba A nie może być równa 0");
        }


        else {

            double delta = b * b - 4 * a * c;

            if (delta < 0) {
                System.out.println("Delta < 0 \n więc to równanie nie ma rozwiązań");
            } else if (delta == 0) {

                double wynik = -b / 2 * a;
                System.out.println("Delta = 0 \n Rozwiązanie: x=" + wynik);

            }

            else if (delta > 0) {
                double wynik;
                System.out.println("Delta > 0 więc: \n");
                wynik = (-b - Math.sqrt(delta)) / 2 * a;
                System.out.println("1x1:" + wynik);
                wynik = (-b + Math.sqrt(delta)) / 2 * a;
                System.out.println("x2:" + wynik);

            }

        }
    }
}
