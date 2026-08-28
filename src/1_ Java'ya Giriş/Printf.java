public class Printf {
    public static void main(String[] args) {
        String isim = "Ali";
        int yas = 25;
        double not = 3.75;

        System.out.printf("Ad: %s, Yaş: %d, Not: %.2f%n", isim, yas, not);
    }
}

/*
println — Yazdırdıktan sonra, alt satıra geçer
print — Yazdırdıktan sonra, alt satıra geçmez

printf — Formatlı yazdırma

%s → String (metin)

%d → Integer (tam sayı)

%f → Float/Double (ondalıklı sayı)

%.2f → Ondalıklı sayı, virgülden sonra 2 basamak

%n → Yeni satır (platform bağımsız)
*/