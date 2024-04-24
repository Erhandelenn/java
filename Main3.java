package ödev3;

public class Main3 {
    public static void main(String[] args) {

        boolean ifade1 = true;
        boolean ifade2 = false;

        boolean andSonucu = (ifade1 && ifade2);
        System.out.println("AND Sonucu: " + andSonucu);

        boolean orSonucu = (ifade1 || ifade2);
        System.out.println("OR Sonucu: " + orSonucu);

        boolean notSonucu = !ifade2;
        System.out.println("NOT Sonucu: " + notSonucu);
    }
}
