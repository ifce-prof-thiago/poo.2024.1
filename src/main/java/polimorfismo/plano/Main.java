package polimorfismo.plano;

public class Main {

    public static void main(String[] args) {

        Plano x = new PlanoPadrao();

        System.out.println(x.getPreco());
        System.out.println(x.getQualidade());
        System.out.println(x.getResolucao());
        System.out.println(x.getAparelhosCompativeis());
        System.out.println(x.getQtdAcessos());
        System.out.println(x.getQtdAparelhosDownload());
        System.out.println(x.temAnuncio());
    }

}
