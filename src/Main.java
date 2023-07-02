import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String userName , password , select ,newPassword ;

        Scanner inp = new Scanner(System.in);

        System.out.print("Kullanıcı Adınız :");
        userName = inp.nextLine();

        System.out.print("Şifreniz : ");
        password = inp.nextLine();

        if (userName.equals("melike") && password.equals("mlk123")){
            System.out.println("Giriş Yaptınız !");

        }else if(!(userName.equals("melike")) && !(password.equals("mlk123"))){
            System.out.println("Hatalı Giriş ! Kullanıc adı ve şifre yanlış ! Lütfen bilgileri kontrol edip tekrar deneyiniz.");
            System.out.println("Şifrenizi umuttuysanız yeni şifre oluşturmak için \nYeni şifre oluşturmak için :OK \nGiriş ekranına dönmek için:BACK yazın ");
            System.out.println("Seçiminiz : ");
            select = inp.nextLine();

            if (select.equals("OK")|| select.equals("ok")){
                System.out.println("Yeni şifre giriniz.(Lütfen daha önceki şifrelerinizden farklı bir şifre oluşturun !");
                newPassword = inp.nextLine();

                if (!newPassword.equals("mlk123")) {
                    System.out.println("Yeni şifre başarılı şekilde oluşturuldu !");

                } else {
                    System.out.println("Hatalı deneme!Eski şifre ile yeni şifre aynı olamaz!Lütfen tekrar deneyiniz!");
                }
            }else if (select.equals("BACK")||select.equals("back")) {
                System.out.println("Giriş sayfasına yönlendiriliyorsunuz !");

            }else{
                System.out.println("Hatalı giriş yaptınız!lütfen sadece 'OK ve BACK' seçeneklerini giriniz!");
            }

        }
    }

    }
