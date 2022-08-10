import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Lutfen boyunuzu(metre cinsinden giriniz) : ");
        double boy = inp.nextDouble();

        System.out.print("Lutfen kilonuzu giriniz : ");
        int kilo = inp.nextInt();

        double bmi = kilo / (boy * boy);

        System.out.println("Vucut kitle endeksiniz : "+bmi);

    }
}
