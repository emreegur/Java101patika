package Giris;

public class Mainn {
    public static void main(String[] args) {
    Fighter f1 = new Fighter("Khabib", 77, 17, 175, 73,45);
    Fighter f2 = new Fighter("McGregor", 70, 23, 125, 34,37);

    Match m = new Match(f1, f2, 70, 77);
    m.run();

    }
}
