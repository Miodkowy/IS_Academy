package zieloni;

import org.json.simple.JSONObject;

import java.io.FileReader;

import static org.json.simple.JSONValue.parse;

/*
 Klasa ładuje  plik JSON w podanej lokalizacji i zwraca JSON
 The class loads the JSON file at the specified location and returns JSON
 */

public class JsonLoader {


    public static JSONObject load(String filePath) {

        JSONObject json = new JSONObject();
        try {
            Object obj = parse(new FileReader(filePath));
            JSONObject jsonObject = (JSONObject) obj;
            System.out.println("Pobranie pliku z podanej lokalizacji zakończone sukcesem.");
            return jsonObject;

        } catch (Exception e) {
            System.out.println("Problem z ładowaniem pliku \n" + e);
            // e.printStackTrace();
        }

        return null;
    }

}
