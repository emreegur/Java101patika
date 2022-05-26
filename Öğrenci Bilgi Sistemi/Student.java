package Giris;

public class Student {
    Course c1;
    Course c2;
    Course c3;
    String name;
    String stuNo;
    String classes;
    double average;
    double ort1;
    double ort2;
    double ort3;
    boolean isPass;


    Student(String name, String stuNo, String classes, Course c1, Course c2, Course c3) {
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        this.average = 0.0;
    }

    void addBulkNotes(int not1, int not2, int not3, int sozlu1, int sozlu2, int sozlu3) {
        if (not1 >= 0 && not1 <= 100) {
            this.c1.note = not1;
        }
        if (not2 >= 0 && not2 <= 100) {
            this.c2.note = not2;
        }
        if (not3 >= 0 && not3 <= 100) {
            this.c3.note = not3;
        } if (sozlu1 >= 0 && sozlu1 <= 100) {
            this.c1.sozlu = sozlu1;
        } if (sozlu2 >= 0 && sozlu2 <= 100) {
            this.c2.sozlu = sozlu2;
        } if (sozlu3 >= 0 && sozlu3 <= 100) {
            this.c3.sozlu = sozlu3;
        }
    }

    void isPass(){
        System.out.println("---------------------");
        this.ort1 = ((this.c1.note * 4) + (this.c1.sozlu)) / 5.0;
        this.ort2 = ((this.c2.note * 3) + (this.c2.sozlu * 2)) / 5.0;
        this.ort3 = ((this.c3.note * 35) + (this.c3.sozlu * 65)) / 100.0;
        this.average = (ort1 + ort2 + ort3) / 3.0;
        if(this.average > 55){
            System.out.println("Tebrikler " + this.name + ", sınıfı geçtin !");
            this.isPass = true;
        } else{
            System.out.println("Üzgünüz " + this.name + ", Kaldınız :(");
            this.isPass = false;
        }
        printNote();
    }

    void printNote(){
        System.out.println(this.c1.name + " Notu :" + this.c1.note + " %80 etki ediyor.");
        System.out.println(this.c1.name + " Sözlüsü :" + this.c1.sozlu + " %20 etki ediyor.");
        System.out.println(this.c1.name + " Ortalaması :" + this.ort1 );
        System.out.println(this.c2.name + " Notu :" + this.c2.note + " %60 etki ediyor.");
        System.out.println(this.c2.name + " Sözlüsü :" + this.c2.sozlu + " %40 etki ediyor." );
        System.out.println(this.c2.name + " Ortalaması :" + this.ort2 );
        System.out.println(this.c3.name + " Notu :" + this.c3.note + " %35 etki ediyor.");
        System.out.println(this.c3.name + " Sözlüsü :" + this.c3.sozlu + " %65 etki ediyor.");
        System.out.println(this.c3.name + " Ortalaması :" + this.ort3 );
        System.out.println("Genel Ortalamanız : " + this.average);
    }

}
