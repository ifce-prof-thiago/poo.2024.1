package polimorfismo.plano;

public abstract class Plano {
    public abstract String getPreco();
    public abstract String getQualidade();
    public abstract String getResolucao();
    public abstract String getAparelhosCompativeis();
    public abstract Integer getQtdAcessos();
    public abstract Integer getQtdAparelhosDownload();
    public abstract boolean temAnuncio();
}
