package jogo;

public class App {


    public static void main(String[] args) {

        Heroi h1 = new Heroi("Thiago", 20, 10);
        Heroi h2 = new Heroi("Marcandra", 0, 10);

        h2.atacar(h1);

    }
}
