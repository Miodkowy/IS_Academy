package zieloni;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import java.util.Scanner;
/*
 Klasa pobiera JSON ze strukturą menu  i wyświetla go na Ekranie

 */

public class ContextMenu {

    private static void getAnswer(StringBuilder question, JSONArray array, JSONObject parentJson) {
        System.out.println(question);
        Scanner inScanner = new Scanner(System.in);

        Integer selectedOption = null;
        while (inScanner.hasNextLine()) {
            String text = inScanner.nextLine();

            if (text.equals("exit") || text.equals(String.valueOf(array.size()))) {
                System.out.println("Do zobaczenia! Program zakończony!");
                break;
            }
            for (int i = 0; i < array.size(); i++) {

                if (text.equals(String.valueOf(i))) {
                    System.out.println("Przechodzimy do sekcji: " + parentJson.keySet().toArray()[i].toString().toUpperCase());
                    selectedOption = i;
                    showMenu((JSONObject) array.get(selectedOption));
                    break;
                }
            }
        }
    }

    public static void showMenu(JSONObject json) {

        Boolean isMethod = false;
        JSONObject jsonObject = new JSONObject(json);
        // System.out.println(jsonObject.keySet().toArray().length);
        JSONArray jsonArray = new JSONArray();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < jsonObject.keySet().toArray().length; i++) {
            // System.out.println(jsonObject.get(jsonObject.keySet().toArray()[i]));
            // System.out.println(jsonObject.get(jsonObject.keySet().toArray()[i]).getClass().getSimpleName());


            if (jsonObject.get(jsonObject.keySet().toArray()[i]).getClass().getSimpleName().toString().equals("String")) {
                String op = (String) jsonObject.get(jsonObject.keySet().toArray()[i]);
                System.out.println("Wywołaj metodę " + op);
                isMethod = true;

            } else {
                JSONObject op = (JSONObject) jsonObject.get(jsonObject.keySet().toArray()[i]);

                jsonArray.add(op);
                sb.append((i + ") " + jsonObject.keySet().toArray()[i] + "\n").toUpperCase());
            }
        }

        if (isMethod == false) {
            sb.append(jsonObject.keySet().toArray().length + ") WYJSCIE");
        }

        getAnswer(sb, jsonArray, jsonObject);
    }

}
