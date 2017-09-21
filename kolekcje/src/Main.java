import java.util.*;

public class Main {

    public static void main(String[] arg) {
        OfficeWorker officeWorker1 = new OfficeWorker();
        officeWorker1.setName("Michał");
        officeWorker1.setSurname("Dąbrowski");

        OfficeWorker officeWorker2 = new OfficeWorker("Adam", "Kowalski", 18);
        OfficeWorker officeWorker3 = new OfficeWorker("Anna", "Wisniewska", 18);

        /*------------------------------------------LISTA------------------------
        Kolekcja w której
                    -w której każdy element ma przyporządkowany numer kolejny (indeks).
                    -elementy mogą sie powtarzać
         */
        System.out.println("-----------------------LISTA-------------------------------");
        List<OfficeWorker> lista_pracownikow = new ArrayList<OfficeWorker>();
        lista_pracownikow.add(officeWorker1);
        lista_pracownikow.add(officeWorker2);
        lista_pracownikow.add(officeWorker3);

        // lista_pracownikow.remove(pracownik2);
        System.out.println("pracownik: " + lista_pracownikow.get(2).introduceYourSelf());
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

        Set<OfficeWorker> set_pracowników = new HashSet<OfficeWorker>();
        set_pracowników.add(officeWorker1);
        set_pracowników.add(officeWorker2);
        set_pracowników.add(officeWorker3);
        set_pracowników.add(officeWorker3); //nie wyświetli drugi raz

        for (OfficeWorker pracownik : set_pracowników) {
            System.out.println("pracownik: " + pracownik.introduceYourSelf());
        }




      /*------------------------------------------QUEUE---------------------------
       Kolejka (stos) to kolekcja:
                    kolejek typu FIFO (first-in-first-out) i FILO (first-in-last-out).
       */
        System.out.println("------------------------QUEUE------------------------------");

        Queue<OfficeWorker> kolejka = new ArrayDeque<>();
        kolejka.add(officeWorker1);
        kolejka.add(officeWorker2);
        System.out.println(kolejka.remove().introduceYourSelf()); //wypisze pierwszy



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
