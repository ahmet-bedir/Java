public class VeriTurleri {
    public static void main(String[] args) {
        int maxInt = Integer.MAX_VALUE; // 2,147,483,647
        int minInt = Integer.MIN_VALUE; // -2,147,483,648

        System.out.println("Max int: " + maxInt);
        System.out.println("Min int: " + minInt);
    }
}
/*
Tip	    Boyut	Varsayılan	Min Değer	                    Max Değer	                Kullanım
byte	1 byte	0	        -128	                        127	                        Küçük sayılar, dosya verileri
short	2 byte	0	        -32,768	                        32,767	                    Orta küçük sayılar
int	    4 byte	0	        -2,147,483,648	                2,147,483,647	            Genel amaçlı tam sayı
long	8 byte	0L	        -9,223,372,036,854,775,808	    9,223,372,036,854,775,807	Çok büyük tam sayılar
float	4 byte	0.0f	    ≈ ±1.4 × 10⁻⁴⁵	                ≈ ±3.4 × 10³⁸	            Ondalıklı (düşük hassasiyet)
double	8 byte	0.0d	    ≈ ±4.9 × 10⁻³²⁴	                ≈ ±1.8 × 10³⁰⁸	            Ondalıklı (yüksek hassasiyet)
char	2 byte	'\u0000'	0	    65,535	Tek karakter (Unicode)
boolean	~1 bit	false	    false	true	Doğru/yanlış
*/
