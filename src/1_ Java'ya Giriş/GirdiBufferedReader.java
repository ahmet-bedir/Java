/*
Scanner Alternatifleri
Scanner en basit yol ama tek yol değil:

BufferedReader (Daha Hızlı)
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class GirdiBufferedReader {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Adınız: ");
        String isim = reader.readLine();

        System.out.print("Yaşınız: ");
        int yas = Integer.parseInt(reader.readLine());

        System.out.printf("Merhaba %s, %d yaşındasın!%n", isim, yas);
    }
}
// BufferedReader, Scanner'dan daha hızlıdır çünkü daha az işlem yapar. Ama kullanımı biraz daha zahmetli — her şeyi String olarak okur, tip dönüşümünü sen yaparsın.