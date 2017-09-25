package zieloni;

import org.json.simple.JSONObject;

import java.io.FileReader;

import static org.json.simple.JSONValue.parse;

/**
 * Hello world!
 */
public class App {
    private static final String filePath = "D:\\KURS_JAVA\\IS_Academy\\zel\\src\\main\\java\\zieloni\\JsonFile\\context_menu.json";

    // private static final String filePath = "D:\\KURS_JAVA\\IS_Academy\\zel\\src\\main\\java\\zieloni\\test.json";
    public static void main(String[] args) {
        JSONObject json = new JSONObject();
        System.out.println("Hello World!");


       /* ArrayList<String> listdata = new ArrayList<String>();
        JSONArray jArray = (JSONArray)jsonObject;
        if (jArray != null) {
            for (int i=0;i<jArray.length();i++){
                listdata.add(jArray.getString(i));
            }
        }*/

        try {

            Object obj = parse(new FileReader(filePath));

            JSONObject jsonObject = (JSONObject) obj;
            // System.out.println(jsonObject.get("Planer"));

            JSONObject planer = (JSONObject) jsonObject;

            // JSONArray companyList = (JSONArray) jsonObject.get("Planer");


            // System.out.println(planer.keySet().iterator());


            ContextMenu.showMenu(planer);


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
