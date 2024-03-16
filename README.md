public class Main {
    public static void main(String[] args) {

        String b = "21.16";
        double doubleDeger = Double.parseDouble(b);

        String c = "12.145512";
        float floatDeger = Float.parseFloat(c);

        long longDeger = 10000L;
        int intDeg= (int) longDeger;

        int intDe= 61;
        String stringDe = String.valueOf(intDe);

        System.out.println("doubleDeger: " + doubleDeger);
        System.out.println("floatDeger: " + floatDeger);
        System.out.println("intDeger: " + intDeg);
        System.out.println("stringDeger: " + stringDe);

    }
}
