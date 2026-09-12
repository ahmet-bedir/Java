import java.util.Scanner;
import java.util.Locale;

public class LocaleOrnegi {
    public static void main(String[] args) {
        // ABD locale'i ile Scanner oluştur (nokta = ondalık ayırıcı)
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Bir ondalıklı sayı girin (nokta ile): ");
        double sayi = scanner.nextDouble();
        System.out.println("Girdiğiniz: " + sayi);

        scanner.close();
    }
}

/*
💡 İpucu: scanner.useLocale(Locale.US) kullanarak ondalık ayırıcının her zaman nokta olmasını sağlayabilirsin. Bu, kodunun farklı ülkelerdeki sistemlerde tutarlı çalışmasını garanti eder.
*/