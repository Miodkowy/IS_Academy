public class Main {
    public static void main(String[] arg) {

        Month styczen = Month.January;
        System.out.println(styczen);

        Directions[] a = Directions.values();
        Directions s = Directions.valueOf(a[1].toString()); // Directions.EAST

        System.out.println(s);

        Planet[] planets = Planet.values();
        Planet pla = Planet.valueOf(planets[1].toString());

        System.out.println(pla);




        // double earthWeight = Double.parseDouble( planets[0].toString());
        //double mass = earthWeight / Planet.EARTH.surfaceGravity();
        for (Planet p : Planet.values()) {
          //System.out.printf("Your weight on %s is %f%n", p, p.surfaceWeight(32));
            System.out.printf("Your weight on %s is %f%n", p, p.surfaceGravity());
        }
    }


}
