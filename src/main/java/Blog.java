import java.util.ArrayList;
import java.util.List;

public class Blog implements Observable {
    private ArrayList<Observer> lista;

    public Blog(ArrayList <Observer>list) {
        this.lista = list;
    }

    public void addObserver(Observer observer) {
        lista.add(observer);
        System.out.println("Dodano obserwujacego");
    }

    public void removeObserver(Observer observer) {
        lista.remove(observer);
        System.out.println("Usunieto obserwujacego");
    }

    public void notifyObservers() {
        for(Observer observer:lista){
            observer.update();
        }

    }
}
