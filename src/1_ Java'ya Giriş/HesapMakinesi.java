import java.util.Scanner;

public class HesapMakinesi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("╔═══════════════════════════╗");
        System.out.println("║   BASİT HESAP MAKİNESİ    ║");
        System.out.println("╚═══════════════════════════╝");
        System.out.println();

        System.out.print("Birinci sayıyı girin: ");
        double sayi1 = Double.parseDouble(scanner.nextLine());

        System.out.print("İkinci sayıyı girin: ");
        double sayi2 = Double.parseDouble(scanner.nextLine());

        System.out.print("İşlem seçin (+, -, *, /): ");
        String islem = scanner.nextLine().trim();

        double sonuc = 0;
        boolean gecerli = true;

        switch (islem) {
            case "+":
                sonuc = sayi1 + sayi2;
                break;
            case "-":
                sonuc = sayi1 - sayi2;
                break;
            case "*":
                sonuc = sayi1 * sayi2;
                break;
            case "/":
                if (sayi2 != 0) {
                    sonuc = sayi1 / sayi2;
                } else {
                    System.out.println("Hata: Sıfıra bölme yapılamaz!");
                    gecerli = false;
                }
                break;
            default:
                System.out.println("Hata: Geçersiz işlem!");
                gecerli = false;
        }

        if (gecerli) {
            System.out.printf("%.2f %s %.2f = %.2f%n", sayi1, islem, sayi2, sonuc);
        }

        scanner.close();
    }
}
