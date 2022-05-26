package Giris;

public class Main {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("MAHMUT", "0541", "TRH");
        Teacher t2 = new Teacher("EMRE", "0542", "MAT");
        Teacher t3 = new Teacher("FARABİ", "044","FZK");

        Course tarih = new Course("Tarih", "101", "TRH");
        tarih.addTeacher(t1);
        Course matematik = new Course("Matematik", "102","MAT");
        matematik.addTeacher(t2);
        Course fizik = new Course("Fizik","103","FZK");
        fizik.addTeacher(t3);

        Student s1 = new Student("Emre", "13", "1", tarih, matematik, fizik);
        s1.addBulkNotes(0,21,72,100,45,90);
        s1.isPass();
        Student s2 = new Student ("Ali","21","1",tarih, matematik, fizik);
        s2.addBulkNotes(35,49,11,100,45,90);
        s2.isPass();
    }
}
