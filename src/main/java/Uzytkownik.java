public class Uzytkownik implements Observer {
    private String imie;
    public Uzytkownik(String imie) {
        this.imie=imie;
    }

    public void update() {
        System.out.println("Dodano nowy artykuł");
    }
}
