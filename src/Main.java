import java.util.ArrayList;
import java.util.Random;
import java.util.Set;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> harfler = new ArrayList<>();
        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 4; i++) {
            char randomChar = (char) ('a' + rand.nextInt(26));
            harfler.add(String.valueOf(randomChar));
        }
       //  --> rastgele harf atadığında found değişimini kontrol edilemeyebilir o yüzden aşağıdaki kodu açıklamasını kaldırınız

       // System.out.println("Güncellenmiş liste: " + harfler);

       //Kullanıcıdan harf alma
        for (int i = 0; i < 4; i++) {
            System.out.print((i + 1) + ". harfi girin: ");
            String input = scanner.nextLine().toLowerCase();

            if (harfler.contains(input)) {
                int index = harfler.indexOf(input);
                harfler.set(index, "found");
            } else {
                harfler.add(input);
            }
        }
        System.out.println("Güncellenmiş liste: " + harfler);
        }
}