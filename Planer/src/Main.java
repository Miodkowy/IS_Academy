import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {



        System.out.println("Wybierz:\n1) jeśli chcesz coś tam \n2) jśli chesz cos tam");
        Scanner inScanner = new Scanner(System.in);
        while (inScanner.hasNextLine()) {
            String text = inScanner.nextLine();
            if (text.equals("1")) {
                System.out.println("Wybrałeś opcje nr 1");
                break;

            }else if (text.equals("2")) {
                System.out.println("Wybrałeś opcje nr 2");
                break;

            }
        }
        System.out.println("________________________________2");

        while (inScanner.hasNextLine()) {
            String text = inScanner.nextLine();
            if (text.equals("1")) {
                System.out.println("Wybrałeś opcje nr 1");
                break;

            }
            if (text.equals("2")) {
                System.out.println("Wybrałeś opcje nr 2");
                break;

            }
        }



    }
}
