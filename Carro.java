public class Carro extends Veiculo{

    
    private String tipo;

    public Carro(String ma, String mo, int an, String pl, float va, String carro){
        super(ma, mo, an, pl, va);
        tipo = carro;
    }

    public String getCarro() { return tipo; }
    public void setCarro(String tipo) { this.tipo = tipo; }
    
    //override
    public String imprimir(){
        String impressao = ("\nTipo de carro: "+ tipo);
        return super.imprimir() + impressao;
    }







}
