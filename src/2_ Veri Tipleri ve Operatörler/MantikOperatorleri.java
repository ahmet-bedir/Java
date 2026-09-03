public class MantikOperatorleri {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;

        System.out.println("a && b: " + (a && b));   // false (VE)
        System.out.println("a || b: " + (a || b));   // true  (VEYA)
        System.out.println("!a: " + (!a));           // false (DEĞİL)

        //  örnek
        int yas = 20;
        boolean ogrenci = true;

        boolean indirimVar = (yas < 25) && ogrenci;
        System.out.println("İndirim var mı? " + indirimVar);  // true
    }
}
/*
&& (VE): İki taraf da true ise true.
|| (VEYA): En az bir taraf true ise true.
! (DEĞİL): true'yu false, false'u true yapar.
*/