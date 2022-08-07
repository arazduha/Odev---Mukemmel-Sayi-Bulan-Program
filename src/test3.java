import java.util.Scanner;
public class test3 {
    public static  void main (String[] args) {
        Scanner input = new Scanner(System.in);
        int a, toplam = 0;
        while (true) {
            System.out.print("Bir sayi giriniz: ");
            a = input.nextInt();
            for (int i = 1; i < a; i++) {
                if (a % i == 0) {
                    toplam += i;
                }
            }
            if (toplam == a) {
                System.out.println(a + " sayisi mukemmel sayidir.");
            } else {
                System.out.println(a + " sayisi mukemmel sayi degildir.");
            }
            toplam = 0;
        }
    }

}





