package polimorfismo.plano;

public class PlanoPadrao extends Plano {

    @Override
    public String getPreco() {
        return "R$ 44,90";
    }

    @Override
    public String getQualidade() {
        return "Boa";
    }

    @Override
    public String getResolucao() {
        return "1080p (Full HD)";
    }

    @Override
    public String getAparelhosCompativeis() {
        return "TV, computador, celular, tablet";
    }

    @Override
    public Integer getQtdAcessos() {
        return 2;
    }

    @Override
    public Integer getQtdAparelhosDownload() {
        return 2;
    }

    @Override
    public boolean temAnuncio() {
        return false;
    }
}
