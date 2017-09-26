package zieloni;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.util.Scanner;
/*
 Klasa pobiera JSON ze strukturą menu  i wyświetla go na Ekranie

 */

public class ContextMenu {


    private static Scanner inScanner = new Scanner(System.in);
    private static void getAnswer(StringBuilder question, JSONArray array, JSONObject parentJson) {

        System.out.println(question);
        Integer selectedOption = null;
        Boolean isRunning = true;
        while (inScanner.hasNextLine()) {
            String text = inScanner.nextLine();

            if (text.equals("exit") || text.equals(String.valueOf(array.size()))) {
                System.out.println("Do zobaczenia! Program zakończony!");
                isRunning = false;
               return;
            }
            for (int i = 0; i < array.size(); i++) {

                if (text.equals(String.valueOf(i))) {
                    System.out.println("Przechodzimy do sekcji: " + parentJson.keySet().toArray()[i].toString().toUpperCase());
                    selectedOption = i;
                    showMenu((JSONObject) array.get(selectedOption));
                    isRunning = false;
                   return;
                }
            }
            if (isRunning)
                System.out.println("Nie masz takiej opcji do wyboru");

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
                taskDistriburor(op);
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

    private static void taskDistriburor(String task) {

        if (task.equals("showEvents")) {
            showEvents();
        }

        if (task.equals("busSchedule")) {
            busSchedule();
        }

        if (task.equals("showMotto")) {
            showMotto();
        }
    }

    private static void showMotto() {
        System.out.println("NIE MAM ZIELONEGO POJĘCIA");
    }

    private static void busSchedule() {
        //TODO wyświetl rozkład jazdy np klasa BusSchedule
        System.out.println("Wczytywanie rozkładów jazdy z plików");
    }

    private static void showEvents() {

        //TODO wyświetl wydarzenia
        System.out.println("Wczytywanie kalendarza wydarzeń z plików");
    }

}
