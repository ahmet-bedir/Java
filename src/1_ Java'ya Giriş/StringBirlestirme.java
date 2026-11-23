public class StringBirlestirme {
    public static void main(String[] args) {
        String ad = "Java";
        int versiyon = 21;
        boolean populer = true;

        // + operatörü ile birleştirme
        String mesaj = ad + " " + versiyon + " kullanıyoruz. Popüler mi? " + populer;
        System.out.println(mesaj);

        // printf ile formatlı yazdırma
        System.out.printf("%s %d kullanıyoruz. Popüler mi? %b%n", ad, versiyon, populer);
    }
}