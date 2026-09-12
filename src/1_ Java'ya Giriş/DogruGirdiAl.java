// Klavyeden sayı girilinceye kadar girdiyi tekrar eden program.
import java.util.Scanner;

public class DogruGirdiAl {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sayi = 0;
        boolean gecerli = false;

        while (!gecerli) {
            System.out.print("Bir tam sayı girin: ");
            if (scanner.hasNextInt()) {
                sayi = scanner.nextInt();
                gecerli = true;
            } else {
                System.out.println("Geçersiz! Lütfen sayı girin.");
                scanner.next();  // Geçersiz girdiyi temizle
            }
        }

        System.out.println("Teşekkürler! Girdiğiniz: " + sayi);
        scanner.close();
    }
}
