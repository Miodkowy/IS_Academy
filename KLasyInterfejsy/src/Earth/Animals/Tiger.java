package Earth.Animals;

import Earth.Animals.Cat;

public class Tiger extends Cat {




    @Override
    public String run() {
       // return super.run();
        String msg = "Tygrys biegnie";
        System.out.println(msg);
        // log.info(msg);
        return msg;
    }

    @Override
    public String giveAsound() {
        String msg = "Ryczy";
        return msg;
    }
}
