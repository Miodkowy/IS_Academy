public class OfficeWorker implements Worker {

    private String name;
    private String surname;
    private int age;

    public OfficeWorker() {
    }

    public OfficeWorker(String imie, String nazwisko, int wiek) {
        this.name = imie;
        this.surname = nazwisko;
        this.age = wiek;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;

    }

    @Override
    public String introduceYourSelf() {

        return "Mam na imię " + getName() + " " + getSurname();
    }
}
