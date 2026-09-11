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
/*
`import java.util.Scanner;` → Scanner sınıfını programa dahil ettik. Bu satır olmadan Scanner kullanamazsın.

`Scanner scanner = new Scanner(System.in);` → Yeni bir Scanner nesnesi oluşturdum. System.in = klavye girdisi.

`System.out.print("Adın ne? ");` → println değil print kullandık — böylece kullanıcı aynı satırda yazar.

`scanner.nextLine();` → Kullanıcı bir satır yazıp Enter'a basana kadar bekler, sonra yazdığını String olarak döndürür.

`scanner.close();` → Scanner'ı kapattık. Kaynak sızıntısını önler.
/