/*
Girdi kontrol
Sayı beklediğin yere metin girilmesini hasNextInt() gibi metodlarla kontrol edebilirsin.
*/
import java.util.Scanner;

public class GirdiKontrol {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir tam sayı girin: ");

        if (scanner.hasNextInt()) {
            int sayi = scanner.nextInt();
            System.out.println("Girdiğiniz sayı: " + sayi);
        } else {
            System.out.println("Bu bir tam sayı değil!");
        }

        scanner.close();
    }
}