// args argümanı programa dışarıdan değer göndermeni sağlar.
/*
public class UygArgs {
    public static void main(String[] args) {
        if (args.length > 0) {
            System.out.println("Merhaba, " + args[0] + "!");
        } else {
            System.out.println("Merhaba, yabancı!");
        }
    }
}


$ javac UygArgs.java

$ java UygArgs Ali
# Çıktı: Merhaba, Ali!

$ java UygArgs
# Çıktı: Merhaba, yabancı!

args[0] ilk argümanı,
args[1] ikinci argümanı verir.
args.length toplam argüman sayısını döndürür.
*/

// Birden fazla argüman gönderme.

public class UygArgs {
    public static void main(String[] args) {
        System.out.println("Toplam argüman: " + args.length);
        for (int i = 0; i < args.length; i++) {
            System.out.println("args[" + i + "] = " + args[i]);
        }
    }
}

/*
$ javac UygArgs.java
$ java UygArgs Java çok güzel
# Çıktı:
# Toplam argüman: 3
# args[0] = Java
# args[1] = çok
# args[2] = güzel
*/