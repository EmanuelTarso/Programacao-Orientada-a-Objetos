public abstract class Projeto {
    String nomeP;
    String descricao;
    String endereco;
    String datainicio;
    String datafim;

    public Projeto(String nomeP, String descricao, String endereco, String datainicio, String datafim){
        this.nomeP = nomeP;
        this.descricao = descricao;
        this.endereco = endereco;
        this.datainicio = datainicio;
        this.datafim = datafim;
    }

    public String getNomeP() {
        return nomeP;
    }

    public void setNomeP(String nomeP) {
        this.nomeP = nomeP;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getDatainicio() {
        return datainicio;
    }

    public void setDatainicio(String datainicio) {
        this.datainicio = datainicio;
    }

    public String getDatafim() {
        return datafim;
    }

    public void setDatafim(String datafim) {
        this.datafim = datafim;
    }

    public abstract boolean validaProjeto(String nomeP);
    public abstract String imprimeProjeto();
}
