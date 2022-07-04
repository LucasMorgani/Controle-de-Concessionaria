public class Caminhao extends Veiculo{
    private String tipo;

    public Caminhao(String ma, String mo, int an, String pl, float va, String caminhao){
        super(ma, mo, an, pl, va);
        tipo = caminhao;
    }

    public String getMoto() { return tipo; }
    public void setMoto(String tipo) { this.tipo = tipo; }

    //override
    public String imprimir(){
        String impressao =("\nTipo de bau: "+ tipo);
        return super.imprimir() + impressao;

    }


}