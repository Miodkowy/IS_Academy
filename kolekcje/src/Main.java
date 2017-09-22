import java.util.*;
import java.util.logging.Logger;

public class Main {

    public static void main(String[] arg) {
        OfficeWorker officeWorker1 = new OfficeWorker();

        officeWorker1.setName("Michał");
        officeWorker1.setSurname("Dąbrowski");
        officeWorker1.setAge(13);

        OfficeWorker officeWorker2 = new OfficeWorker("Adam", "Kowalski", 18);
        OfficeWorker officeWorker3 = new OfficeWorker("Anna", "Wisniewska", 18);
        Boss boss = new Boss("Rałał", "Cebula", 40);
        boss.showString(" to moja wiadomoc" + officeWorker2.getName());
        officeWorker2.showString("jestem zwykłym pracownikiem "+ officeWorker2.getName());


        Logger l = Logger.getLogger("");

       /*--------------------------------------ARRAY------------------------------
       Róznica miedzy ARRAY A LIst jest taka ze w LISCIE mozemy zwiekszac ilość elemntów
       a w Array nie mozemy dodac wiecej elementow niż zadeklarowaliśmy na poczatku

       Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 3
        */

        System.out.println("----------------------ARRAY-------------------------------");

        OfficeWorker workerArray[] = new OfficeWorker[3];

        workerArray[0] = officeWorker1;
        workerArray[1] = officeWorker3;
        workerArray[2] = boss;
        try {
            workerArray[3] = officeWorker2;
        } catch (Exception e) {

            System.out.println(e + ":  Nie mozesz zrobić tablicy o wiekszej ilości elementów niż zadeklarowałes ");
        }


        for (int i = 0; i < workerArray.length; i++) {

            System.out.println("arr: " + workerArray[i].introduceYourSelf());

        }



        /*------------------------------------------LISTA------------------------
        Kolekcja w której
                    -w której każdy element ma przyporządkowany numer kolejny (indeks).
                    -elementy mogą sie powtarzać
         */
        System.out.println("-----------------------LISTA-------------------------------");
        List<OfficeWorker> workerLIST = new ArrayList<OfficeWorker>();
        workerLIST.add(officeWorker1);
        workerLIST.add(officeWorker2);
        workerLIST.add(officeWorker3);

        // lista_pracownikow.remove(pracownik2);

        int count = 0;


        do {
            ++count;

            System.out.println("pracownik: " + workerLIST.get(2).introduceYourSelf());
        } while (count <= 4);

      /*  for (OfficeWorker pracownik : lista_pracownikow) {
            System.out.println("pracownik: " + pracownik.przedstawiaSiebie());
        }*/


      /*------------------------------------------SET----------------------------
       Set (zbiór) to kolekcja:
                    -elementy NIE MAJĄ przyporządkowanego numeru kolejnego (indeksu)
                    -dostęp do nich odbywa się za pośrednictwem iteratora.
                    -obiekty NIE MOGĄ SIE powtarzać
       */
        System.out.println("------------------------SET------------------------------");

        Set<OfficeWorker> workerSET = new HashSet<OfficeWorker>();
        workerSET.add(officeWorker1);
        workerSET.add(officeWorker2);
        workerSET.add(officeWorker3);
        workerSET.add(officeWorker3); //nie wyświetli drugi raz

        for (OfficeWorker pracownik : workerSET) {
            System.out.println("pracownik: " + pracownik.introduceYourSelf());
        }




      /*------------------------------------------QUEUE---------------------------
       Kolejka (stos) to kolekcja:
                    kolejek typu FIFO (first-in-first-out) i FILO (first-in-last-out).
       */
        System.out.println("------------------------QUEUE------------------------------");

        Queue<OfficeWorker> workerQUEUE = new ArrayDeque<>();
        workerQUEUE.add(officeWorker1);
        workerQUEUE.add(officeWorker2);
        System.out.println(workerQUEUE.remove().introduceYourSelf()); //wypisze pierwszy



     /*------------------------------------------MAP---------------------------
       Mapy, choć nie są formalnie kolekcjami z punktu widzenia języka Java (nie są typu Collection), także służą do przechowywania elementów.
       Wyróżnia je to, że przechowują nie tyle same elementy, co mapowanie klucz-wartość, tzn. jeden obiekt (klucz) wskazuje na inny obiekt (wartość).
       */

        System.out.println("------------------------MAP-----------------------------");

        Map<String, OfficeWorker> mapa = new HashMap<String, OfficeWorker>();
        mapa.put("pierwszy", officeWorker1);
        mapa.put("drugi", officeWorker2);
        System.out.println(mapa.get("drugi").introduceYourSelf());

    }

}
