import java.util.Scanner;

public class ContextMenu {


    private static String[][] question = {
            {"Wybierz :\n1) Planer \n2) Transport \n3) Exit",}
    };


    private static String getAnswer(String question, int state) {
        System.out.println(question);
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

        return "0";
    }

    public static void showMenu() {
        int state = 0;

        getAnswer(question[0][0], 0);
        getAnswer("Wybierz :\n1) Planer \n2) Transport \n3) Exit", 0);

    }
}
