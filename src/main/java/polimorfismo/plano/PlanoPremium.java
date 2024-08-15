package polimorfismo.plano;

public class PlanoPremium extends Plano {

    @Override
    public String getPreco() {
        return "R$ 59,90";
    }

    @Override
    public String getQualidade() {
        return "Excepcional";
    }

    @Override
    public String getResolucao() {
        return "4K (Ultra HD) + HDR";
    }

    @Override
    public String getAparelhosCompativeis() {
        return "TV, computador, celular, tablet";
    }

    @Override
    public Integer getQtdAcessos() {
        return 4;
    }

    @Override
    public Integer getQtdAparelhosDownload() {
        return 6;
    }

    @Override
    public boolean temAnuncio() {
        return false;
    }

    public String getAudioEspacial() {
        return "Incluso";
    }
}
