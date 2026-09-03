public class TextBlockOrnegi {
    public static void main(String[] args) {
        // Eski yöntem — escape karakterleriyle
        String eskiYontem = "{\n" +
                "  \"isim\": \"Ali\",\n" +
                "  \"yas\": 25\n" +
                "}";
                
        // Yeni yöntem — text block
        String yeniYontem = """
                {
                  "isim": "Ali",
                  "yas": 25
                }
                """;
                
        System.out.println(eskiYontem);
        System.out.println("---");
        System.out.println(yeniYontem);
    }
}
/*
En çok kullanılan escape karakterleri:

Karakter	Anlamı
\n      	Yeni satır (new line)
\t	        Tab (sekme)
\"      	Çift tırnak
\\      	Backslash
\'	        Tek tırnak
\r      	Satır başı (carriage return)

---

Text block """ ile başlar ve """ ile biter. İçinde \n ve \" kullanmana gerek kalmaz.
*/