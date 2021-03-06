public class Cliente {
    private String nome, cpf, endereco;
    private int telefone;
    private float compra;

    Cliente(){}

    Cliente(String n, String cp, float co, int t, String e){
        nome = n;
        cpf = cp;
        compra = co;
        telefone = t;
        endereco = e;
    }

    public String getNome() {
        return nome;
    }
    public String getCpf() {
        return cpf;
    }
    public float getCompra() {
        return compra;
    }
    public int getTelefone() {
        return telefone;
    }
    public String getEndereco() {
        return endereco;
    }
    //escrita
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public void setanoCompra(float compra) {
        this.compra = compra;
    }
    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String imprimir(){
        String impressao = ("Dados do cliente: " +
                            "\nNome: " + nome +
                            "\nTelefone: " + telefone +
                            "\nCPF: " + cpf + 
                            "\nCompra: " + compra + 
                            "\nEndereco: " + endereco);
        return impressao;
    }

}
