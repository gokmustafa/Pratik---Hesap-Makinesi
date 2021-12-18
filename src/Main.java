import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        int n1, n2, select  ;
        Scanner input = new Scanner(System.in);

        System.out.print("n1 sayısınını giriniz:");
        n1 =input.nextInt();
        System.out.print("n2 sayısınını giriniz:");
        n2=input.nextInt();
        System.out.println("Secim yapiniz\n 1 - Topla\n 2 -Çıkar\n 3 -Çarp\n 4 -Böl");
        select=input.nextInt();

        switch (select){
            case 1:
                System.out.print("Toplam="+(n1+n2));
                break;
            case 2:
                System.out.print("Çıkar="+(n1-n2));
                break;
            case 3:
                System.out.print("Çarp="+(n1*n2));
                break;
            case 4:
                System.out.print("Böl="+(n1+n2));
                break;
            default:
                System.out.print("Yanlış numara girdiniz.Tekrar deneyiniz");
            
        }

    }
}
