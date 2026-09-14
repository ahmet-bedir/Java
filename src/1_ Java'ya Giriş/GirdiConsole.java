import java.io.Console;

public class GirdiConsole {
    public static void main(String[] args) {
        Console console = System.console();
        if (console != null) {
            String isim = console.readLine("Kullanıcı adı: ");
            char[] parola = console.readPassword("Parola: ");  // Ekranda gözükmez!
            System.out.println("Giriş yapılıyor: " + isim);
            String parolaDonusum = String.parseString(parola);
            if (parola.equals(parolaDonusum)){
            System.out.println("Giriş başarılı");
            }
            
        }
    }
}