package Earth.Animals;

import Earth.Animal;

import java.util.logging.Logger;

public class Cat implements Animal {

    private String name;

    public Cat() {
        this.name = name;
    }
    public Cat(String name) {
        this.name = name;
    }

    public String getName() {
        return  name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String run() {
       // Logger log = Logger.getLogger("");
        //NestedClass msgNested = new NestedClass("haha");
        String msg = "Kot biegnie";// + msgNested;
        System.out.println(msg);
       // log.info(msg);
        return msg;
    }

    @Override
    public String giveAsound() {
        return "miaaał";
    }

    public static class NestedClass {
        private String nested;

        public NestedClass(String nested) {
            this.nested = nested;
        }

        public String nestedRun() {
            // Logger log = Logger.getLogger("");
            String msg = "to jest klasa wewnetrzna" +this.nested;
            //System.out.println(msg);
            // log.info(msg);
            return msg;
        }
    }
}
