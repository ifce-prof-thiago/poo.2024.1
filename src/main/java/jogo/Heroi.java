package jogo;

public class Heroi {

    protected String nome;
    protected int vida;
    protected int forca;

    public Heroi(String nome, int vida, int forca) {
        this.nome = nome;
        this.vida = vida;
        this.forca = forca;
    }

    public void atacar(Heroi inimigo) {
        if (this.estaVivo()) {
            System.out.println(nome + " ataca " + inimigo.nome + " com força " + forca);
            inimigo.receberDano(forca);
        } else {
            System.out.println(nome + " não pode atacar, pois foi derrotado");
        }
    }

    public void receberDano(int dano) {

        vida = vida - dano;
        if (vida <= 0) {
            vida = 0;
            System.out.println(nome + " foi derrotado!");
        }

        exibirStatus();
    }

    public boolean estaVivo() {
        return vida > 0;
    }

    public void exibirStatus() {
        System.out.println("---------------------------");
        System.out.println("Status de: " + nome);
        System.out.println("Vida: " + vida);
        System.out.println("Forca: " + forca);
        System.out.println("---------------------------");
    }

}
