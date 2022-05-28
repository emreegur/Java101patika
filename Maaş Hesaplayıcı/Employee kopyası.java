package Giris;

public class Employee {
    String name;
    int salary;
    int workHours;
    int hireyear;

    Employee(String name, int salary, int workHours, int hireyear){
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireyear = hireyear;
    }

    public double tax(){
        double tax = 0;
        if ((this.salary < 1000) && (this.salary > 0)){
            tax = 0.0;
            return tax;
        } else{
            tax = this.salary * 3/100;
            return tax;
        }
    }

    public double bonus(){
        double bonus = 0.0;
        if (workHours > 40){
            for (int i = 1; i <= (workHours-40);i++){
                bonus += 30;
            } return bonus;
        }else{
            bonus = 0;
            return bonus;
        }
    }

    public double raiseSalary(){
        double raise = 0.0;
        if ((2022 - hireyear) < 10){
            raise = this.salary *5/100;
        } if ((2022 - hireyear) < 20 && (2022 - hireyear) > 9){
            raise = this.salary *1/10;
        } if ((2022 - hireyear) > 19){
            raise = this.salary *15/100;
        }return raise;
    }

    public void toStrings(Employee employee){
        System.out.println("Adı : " + this.name);
        System.out.println("Maaşı : " + this.salary + "TL");
        System.out.println("Çalışma Saati : " + this.workHours);
        System.out.println("Başlangıç Yılı : " + this.hireyear);
        double tax = employee.tax();
        double bonus = employee.bonus();
        double raise = employee.raiseSalary();
        System.out.println("Vergi : " + tax);
        System.out.println("Bonus : " + bonus);
        System.out.println("Maaş Artışı : " + raise);
        System.out.println("Vergi ve Bonuslar ile birlikte maaş : " + (this.salary + (bonus - tax)) + "TL");
        System.out.println("Toplam Maaş : " + (this.salary + (raise + bonus - tax)));



    }
}
/*
Vergi : 60.0
Bonus : 150.0
Maaş Artışı : 300.0
Vergi ve Bonuslar ile birlikte maaş : 2090.0
Toplam Maaş : 2300.0
 */