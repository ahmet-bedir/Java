import java.util.Scanner;  // Scanner'ı import et

public class UygScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // Klavyeyi dinlemeye başla

        System.out.print("Adın ne? ");  // Kullanıcıya sor
        String isim = scanner.nextLine();  // Cevabı oku

        System.out.println("Merhaba, " + isim + "!");  // Cevabı kullan

        scanner.close();  // İşin bitince kapat
    }
}