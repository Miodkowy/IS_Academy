package zieloni;

import org.json.simple.JSONObject;

import java.io.FileReader;

import static org.json.simple.JSONValue.parse;

public class App {

    // private static final String filePath = "D:\\KURS_JAVA\\IS_Academy\\zel\\src\\main\\java\\zieloni\\JsonFile\\context_menu.json";
    // private static final String filePath = "D:\\KURS_JAVA\\IS_Academy\\zel\\src\\main\\java\\zieloni\\test.json";

    private static final String filePath = "C:\\Users\\mstasinski\\Desktop\\IS_Academy\\zel\\src\\main\\java\\zieloni\\JsonFile\\context_menu.json";

    public static void main(String[] args) {

        JSONObject contextMenuJSON = JsonLoader.load(filePath);
        ContextMenu.showMenu(contextMenuJSON);


    }
}
