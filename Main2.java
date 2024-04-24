package ödev3;

public class Main2 {
    public static void main(String[] args) {
        int sayi1 = 10;
        int sayi2 = 5;

        boolean esitMi = (sayi1 == sayi2);
        System.out.println("Eşitlik Kontrolü: " + esitMi);

        boolean esitDegilMi = (sayi1 != sayi2);
        System.out.println("Eşit Değil Kontrolü: " + esitDegilMi);

        boolean buyukMu = (sayi1 > sayi2);
        System.out.println("Büyüklük Kontrolü: " + buyukMu);
    
        boolean buyukEsitMi = (sayi1 >= sayi2);
        System.out.println("Büyük eşit Kontrolü: " + buyukEsitMi);

        boolean kucukMu = (sayi1 < sayi2);
        System.out.println("Küçüklük Kontrolü: " + kucukMu);
        
        boolean kucukEsitMi = (sayi1 <= sayi2);
        System.out.println("Küçük Eşit Kontrolü: " + kucukEsitMi);
    }
}