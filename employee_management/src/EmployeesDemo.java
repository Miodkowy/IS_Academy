import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class EmployeesDemo {

    private static String companyName = "FIRMA XYZ";

    public static void main(String[] arg) {


        String operatorName = new String("Użytkownikiem programu jestem ja");
        Integer empoloyeesCounter = new Integer(14);
        int loggedEmployeesCounter = 6;
        int max_loggedEmployees = 5;

        System.out.println(arg.length);

        for (int i = 0; i < arg.length; i++) {
            System.out.println(arg[i]);
        }

        if (empoloyeesCounter == 0) {
            System.out.println("Brak pracowników");
        } else if (empoloyeesCounter > 0) {
            for (int i = 0; i < empoloyeesCounter; i++) {
                System.out.println("Jan Kowalski - kierownik");
            }
        }

        for (int i = 0; i <= loggedEmployeesCounter; i++) {
            System.out.println("pracownik");
            if (i > max_loggedEmployees) {
                System.out.println("...pracownik");
            }
        }


        Date dNow = new Date();
        SimpleDateFormat ft = new SimpleDateFormat("E yyyy.MM.dd 'at' hh:mm:ss a zzz");
        System.out.println("Current Date: " + ft.format(dNow));

        System.out.println("companyName: " + companyName);
        System.out.println("empoloyeesCounter: " + empoloyeesCounter);
        System.out.println("operatorName: " + operatorName);


    }
}
