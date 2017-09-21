public class Boss extends OfficeWorker {

    public Boss(String imie, String nazwisko, int wiek) {
        super(imie, nazwisko, wiek);
    }

    public Boss() {
        super();
    }

    @Override
    public String introduceYourSelf() {
        String intro = "Jestem Szefem i mam na imie " + getName() + " " + getSurname();
        return intro;
        //return super.introduceYourSelf();
    }

    @Override
    public void showString(String msg) {
        super.showString(msg);
        System.out.println(" - to mówie ja ..Jarząbek Wacław");
    }
}
