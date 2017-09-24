import Earth.Animal;
import Earth.Animals.Cat;
import Earth.Animals.Tiger;
import java.util.HashSet;
import java.util.Set;




/*Opracuj kod który deklaruje klasy (włączając to klasy abstrakcyjne jak i
wszystkie formy zagnieżdżonych klas), interfejsy i typy wyliczeniowe, które
się zawierają w odpowiednich paczkach. Użyj wyrażeń import w tym też statycznych.
 (tym razem tłumaczenie mogło mi nie wyjść)
 */
public class Main {
    public static void main(String[] arg) {
        Cat smallCat = new Cat();
        //smallCat.run();

        Tiger smallTiger = new Tiger();

        //smallTiger.run();
        smallTiger.setName("Tygrysek");

        Set<Animal> zoo = new HashSet<>();
        zoo.add(smallCat);
        zoo.add(smallTiger);


        Cat.NestedClass wiekszyKot = new Cat.NestedClass(" fvvv");
        //wiekszyKot.nrestedRun();

        System.out.println(wiekszyKot.nestedRun());
        /*System.out.println(" Mam na imię "+ smallTiger.getName());
        System.out.println(" głos tygrysa "+ smallTiger.giveAsound());
        System.out.println(" głos kota "+ smallCat.giveAsound());

        System.out.println(" ile oczek "+Cat.EYES);
        System.out.println(" ile oczek "+Tiger.EYES);*/

    }

}
