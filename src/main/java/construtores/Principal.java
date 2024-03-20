package construtores;

public class Principal {

    public static void main(String[] args) {

        Produto p1 = new Produto("TV", 5000.0, 10);
        Produto p2 = new Produto("Celular", 8.0, 1);

        System.out.println("OBJETO P1: " + p1);
        p1.printThis();

        System.out.println("OBJETO P2: " + p2);
        p2.printThis();

    }
}
