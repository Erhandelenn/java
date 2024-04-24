package ödev2;

public class Main {
    public static void main(String[] args) {

        int a = 10;
        float ondalikliSayi = (float) a;
      
        System.out.println("Float Sayı Değeri: " + ondalikliSayi);

        int b = 25;
        double doubleDegeriTamSayidan = (double) b;
       
        System.out.println("Double Değeri: " + doubleDegeriTamSayidan);

        float ondalikliSayi2 = 3.14f;
        double doubleDegeriOndalikliSayidan = (double) ondalikliSayi2;
        System.out.println("Double Değeri: " + doubleDegeriOndalikliSayidan);

        long longSayi = 1000000L;
        double doubleDegerilongSayidan = (double) longSayi;
         System.out.println("Double Değeri: " + doubleDegerilongSayidan);
    }
}