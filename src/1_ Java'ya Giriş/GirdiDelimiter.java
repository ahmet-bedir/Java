/*
Delimiter (Ayırıcı) Değiştirme
Scanner varsayılan olarak boşluk ve yeni satır karakterlerini ayırıcı olarak kullanır. Bunu değiştirebilirsin.
*/
import java.util.Scanner;

public class GirdiDelimiter {
    public static void main(String[] args) {
        // Virgülle ayrılmış veri oku
        String veri = "Ali,25,Istanbul,Muhendis";
        Scanner scanner = new Scanner(veri);
        scanner.useDelimiter(",");

        String isim = scanner.next();
        int yas = scanner.nextInt();
        String sehir = scanner.next();
        String meslek = scanner.next();

        System.out.printf("%s, %d yaşında, %s'da %s%n", isim, yas, sehir, meslek);

        scanner.close();
    }
}