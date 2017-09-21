import com.sun.xml.internal.ws.api.ha.StickyFeature;

public class Main {

    public static void main(String[] arg) {
        String myString = "helow";
        int myint = 12;
        People man = new People();

        ReturnType<String> str = new ReturnType<>(myString);
        ReturnType<Integer> sin = new ReturnType<>(myint);
        ReturnType<People> pep = new ReturnType<>(man);


    }
}
