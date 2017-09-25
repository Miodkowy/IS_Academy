package zieloni;

import org.json.simple.JSONObject;

import java.util.Iterator;
import java.util.Scanner;

public class ContextMenu {





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

    public static void showMenu(JSONObject json) {
        int state = 0;

        Iterator<JSONObject> iterator = json.keySet().iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        getAnswer("Wybierz :\n1) Planer \n2) Transport \n3) Exit", 0);

    }
}
