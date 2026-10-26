public class EmailDogrulama {
    public static boolean gecerliMi(String email) {
        if (email == null || email.isBlank()) {
            return false;
        }
        
        email = email.strip();
        
        // @ işareti var mı?
        int atIndex = email.indexOf('@');
        if (atIndex <= 0) return false; // @ yok veya başta
        
        // @ sonrasında . var mı?
        int dotIndex = email.lastIndexOf('.');
        if (dotIndex <= atIndex + 1) return false;
        
        // Sonda . olmamalı
        if (dotIndex == email.length() - 1) return false;
        
        // Birden fazla @ olmamalı
        if (email.indexOf('@') != email.lastIndexOf('@')) return false;
        
        return true;
    }
    
    public static void main(String[] args) {
        System.out.println(gecerliMi("ali@example.com"));  // true
        System.out.println(gecerliMi("ali@example"));       // false
        System.out.println(gecerliMi("@example.com"));      // false
        System.out.println(gecerliMi("ali@@example.com"));  // false
        System.out.println(gecerliMi(null));                 // false
    }
}