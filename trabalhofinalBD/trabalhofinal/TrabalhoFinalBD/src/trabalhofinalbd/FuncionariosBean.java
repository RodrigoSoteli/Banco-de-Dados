package trabalhofinalbd;

public class FuncionariosBean {
   private String nome;
   private int cpf;
   private int crm;
   private int codigopostoatendimento;
   
   public FuncionariosBean(String nome, int cpf, int crm, int codigopostoatendimento) {
       this.nome= nome;
       this.cpf = cpf;
       this.crm = crm;
       this.codigopostoatendimento= codigopostoatendimento;
   }


    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the cpf
     */
    public int getCpf() {
        return cpf;
    }

    /**
     * @param cpf the cpf to set
     */
    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    /**
     * @return the crm
     */
    public int getCrm() {
        return crm;
    }

    /**
     * @param crm the crm to set
     */
    public void setCrm(int crm) {
        this.crm = crm;
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
   
    public String toString(){
        return "Nome Funcionário: " + nome + ", CPF: " + cpf + ", CRM: " + crm + "Código do Posto onde Trabalha " + codigopostoatendimento;
    }
    
}
