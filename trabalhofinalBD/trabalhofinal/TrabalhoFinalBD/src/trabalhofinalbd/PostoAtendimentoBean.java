package trabalhofinalbd;

public class PostoAtendimentoBean {
   private int codigopostoatendimento;
   private int fone;
   private String bairro;
   private String rua;
   private int numeroendereco;
   
   public PostoAtendimentoBean(int codigopostoatendimento, int fone, String bairro, String rua, int numeroendereco) {
       this.codigopostoatendimento= codigopostoatendimento;
       this.fone = fone;
       this.bairro = bairro;
       this.rua= rua;
       this.numeroendereco= numeroendereco;
   }

    /**
     * @return the codigopostoatendimento
     */
    public int getCodigopostoatendimento() {
        return codigopostoatendimento;
    }

    /**
     * @param codigopostoatendimento the codigopostoatendimento to set
     */
    public void setCodigopostoatendimento(int codigopostoatendimento) {
        this.codigopostoatendimento = codigopostoatendimento;
    }

    /**
     * @return the fone
     */
    public int getFone() {
        return fone;
    }

    /**
     * @param fone the fone to set
     */
    public void setFone(int fone) {
        this.fone = fone;
    }

    /**
     * @return the bairro
     */
    public String getBairro() {
        return bairro;
    }

    /**
     * @param bairro the bairro to set
     */
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    /**
     * @return the rua
     */
    public String getRua() {
        return rua;
    }

    /**
     * @param rua the rua to set
     */
    public void setRua(String rua) {
        this.rua = rua;
    }

    /**
     * @return the numeroendereco
     */
    public int getNumeroendereco() {
        return numeroendereco;
    }

    /**
     * @param numeroendereco the numeroendereco to set
     */
    public void setNumeroendereco(int numeroendereco) {
        this.numeroendereco = numeroendereco;
    }

    public String toString(){
        return "Código Posto de Atendimento: " + codigopostoatendimento + ", Telefone: " + fone + ", Bairro: " + bairro + ", " + rua + ", " + numeroendereco;
    }
   
    
}