import java.io.Console;

public class GirdiConsole {
    public static void main(String[] args) {
        Console console = System.console();
        if (console != null) {
            String isim = console.readLine("Kullanıcı adı: ");
            char[] parola = console.readPassword("Parola: ");  // Ekranda gözükmez!

            String kayitliParola = "abc";
            String parolaDonusum = String.valueOf(parola);
            
            if (kayitliParola.equals(parolaDonusum)){
            System.out.println("Giriş başarılı");
            }
            
        }
    }
}