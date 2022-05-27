package Giris;

public class Match {
    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;

    Match(Fighter f1, Fighter f2, int minWeight, int maxWeight){
        this.f1 = f1;
        this.f2 = f2;
        this.maxWeight = maxWeight;
        this.minWeight = minWeight;
    }
    void run (){
        if (checkWeight()) {
            System.out.println("First punch !!! ");
            if (this.f1.isOffensiveness()) {
                this.f2.health = this.f1.hit(f2);
            } else if (this.f2.isOffensiveness()) {
                this.f1.health = this.f2.hit(f1);
            }
            printScore();
            while (this.f1.health > 0 && this.f2.health > 0) {
                System.out.println("--- New Round --- ");

                this.f2.health = this.f1.hit(f2);
                if (isWin()) {
                    break;
                }

                this.f1.health = this.f2.hit(f1);
                if (isWin()) {
                    break;
                }
                printScore();
            }
        }else{
                System.out.println("Sikletler uyuşmamaktadır.");
            }
    }


    boolean checkWeight() {
        return (f1.weight >= minWeight && f1.weight <= maxWeight) && (f2.weight >= minWeight && f2.weight <= maxWeight);
    }

    boolean isWin() {
        if (f1.health == 0) {
            System.out.println("Maçı Kazanan : " + f2.name);
            return true;
        } else if (f2.health == 0){
            System.out.println("Maçı Kazanan : " + f1.name);
            return true;
        }
        return false;
    }

    void printScore() {
        System.out.println("------------");
        System.out.println(f1.name + " Kalan Can :" + f1.health);
        System.out.println(f2.name + " Kalan Can :" + f2.health);
    }
}
