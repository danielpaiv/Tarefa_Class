public class Cliente { // Class

    private String nome; //Propiedade da class.
    private String endereco;  //Propiedade da class.
    private String cidade;  //Propiedade da class.

    /***
     * Para cada propiedade são dios métodos GET e SET que pode ser criado automaticamente assim dará
     * acesso as outras classes
     * @return retor ao nome
     */
    public String getNome() {  //Método da propiedade nome GET.
        return nome;
    }

    public void setNome(String nome) {  //Método da propiedade nome SET.
        this.nome = nome;
    }

    public String getEndereco() {  //Método da propiedade endereço GET.
        return endereco;
    }

    public void setEndereco(String endereco) {  //Método da propiedade endereço SET.
        this.endereco = endereco;
    }

    public String getCidade() {  //Método da propiedade cidade GET.
        return cidade;
    }

    public void setCidade(String cidade) {  //Método da propiedade cidade SET.
        this.cidade = cidade;
    }
}
