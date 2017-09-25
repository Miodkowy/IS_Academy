import java.util.Scanner;

public class ContextMenu {


    public static void showMenu() {

        int state = 0;

        System.out.println("Wybierz :\n1) Planer \n2) Transport \n3) Exit");

        Scanner inScanner = new Scanner(System.in);
        while (inScanner.hasNextLine()) {
            String text = inScanner.nextLine();
            if (text.equals("1")) {
                System.out.println("...Przechodzimy do Planera");
                state = 1;
                break;

            } else if (text.equals("2")) {
                System.out.println("Wybrałeś opcje nr 2");
                state = 2;
                break;

            } else {
                break;
            }
        }

        if (state == 1) {

            System.out.println("Witaj w Planerze . Od którego wydarzenia chesza rozpocząc:\n1) Wydarzenia 1\n2) Wydarzene2 \n3) Exit");
            while (inScanner.hasNextLine()) {
                String text = inScanner.nextLine();
                if (text.equals("1")) {
                    System.out.println("Startujesz od wydarzenia 1");
                    //state = 1;
                    break;

                } else if (text.equals("2")) {
                    System.out.println("Startujesz od wydarzenia 1");
                    //state = 2;
                    break;

                } else {
                    break;
                }
            }
        }
    }
}
