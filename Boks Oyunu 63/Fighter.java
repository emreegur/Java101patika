package Giris;

public class Fighter {
    String name;
    int weight;
    int damage;
    int health;
    int dodge;
    int offensiveness;

    Fighter(String name, int weight, int damage, int health, int offensiveness, int dodge) {
        this.name = name;
        this.weight = weight;
        this.damage = damage;
        if(health > 0) {
            this.health = health;
        } else {
            health = 0;
        }
        if (dodge < 100 && dodge >= 0) {
            this.dodge = dodge;
        } else {
            this.dodge = 0;
            System.out.println(dodge);
        }
        this.offensiveness = offensiveness;
    }

    int hit(Fighter opponent){
        System.out.println("------------");
        System.out.println(this.name + " => " + opponent.name + " " +  this.damage + " hasar vurdu.");
        if(opponent.isDodge()) {
            System.out.println(opponent.name + " vuruşu dodgeladı.");
            return opponent.health;
        }
        if (opponent.health - this.damage < 0) {
            return 0;
        }
        return opponent.health - this.damage;
    }

    boolean isDodge() {
        double random = Math.random() * 100;  //0.0 to 99.9
        //System.out.println(random + "adlı random sayı dodgedan küçükse "+ this.name +" dodgelucak rakip vuruşu.");
        return random <= this.dodge;
    }

    boolean isOffensiveness() {
        double random = Math.random() * 100;  //0.0 to 99.9
        //System.out.println(random + " adlı random sayı ofsansiften küçükse " + this.name  +" ilk vuruşu bu vuracak.");
        return random <= this.offensiveness;
    }
}

