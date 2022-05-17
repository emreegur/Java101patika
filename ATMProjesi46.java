package Giris;
import java.util.Scanner;
public class ATMProjesi46 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String userName, password;
        // userName : emre password : java123
        int hak = 3, secim;
        int balance = 3000;
        while (hak > 0){
            System.out.print("Kullanıcı adınızı giriniz: ");
            userName = input.nextLine();
            System.out.print("Şifrenizi giriniz: ");
            password = input.nextLine();
            if (userName.equals ("emre") && password.equals ("java123")){
                System.out.println("Merhaba, G Bankasına hoşgeldiniz.");
                do {
                System.out.println("1-Para Yatırma\n" + "2-Para Çekme\n" + "3-Bakiye Sorgulama\n" + "4-Çıkış");
                System.out.println("Lütfen yapmak istediğiniz işlemi seçiniz: ");
                secim = input.nextInt();
                switch (secim){
                    case 1:
                        System.out.print("Yatırılacak para miktarı: ");
                        int ymiktar = input.nextInt();
                        balance += ymiktar;
                        break;
                    case 2:
                        System.out.print("Çekilecek para miktarı: ");
                        int cmiktar = input.nextInt();
                        if (cmiktar > balance){
                            System.out.println("Çekilecek miktar bakiyeden büyük olamaz.");
                        }else {
                            balance -= cmiktar;
                        }break;
                    case 3:
                        System.out.println("Bakiyeniz: " + balance);
                        break;
                    case 4:
                        System.out.println("Bizi tercih ettiğiniz için teşekkür eder, iyi günler dileriz.");
                        break;
                    default:
                        System.out.println("Yanlış seçim yaptınız. Tekrar deneyiniz.");
                }
                }while (secim != 4);
                break;

            }else{
                hak--;
                if (hak == 0){
                    System.out.println("Hesabınız bloke olmuştur, lütfen bankanız ile iletişime geçiniz.");
                }else{
                    System.out.println("Hatalı kullanıcı adı veya şifre. Tekrar Deneyiniz.");
                    System.out.println("Kalan hakkınız : " + hak);
            }
        }
    }
}
}



