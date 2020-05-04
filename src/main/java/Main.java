public class Main {
    public static void main(String[] args){
        wykonaj();
    }
    public static void wykonaj(){
        Blog blog=new Blog("Jak Zostać Programista");
        blog.addObserver(new Uzytkownik());
        blog.addObserver(new Uzytkownik());
    blog.dodajWpisNaBlog("Aby zostac programista...");
    }
}
