public class Moto extends Veiculo{
    private String tipo;

    public Moto(String ma, String mo, int an, String pl, float va, String moto){
        super(ma, mo, an, pl, va);
        tipo = moto;
    }

    public String getMoto() { return tipo; }
    public void setMoto(String tipo) { this.tipo = tipo; }

    //override
    public String imprimir(){
        String impressao =("\nCilindradas: "+ tipo);
        return super.imprimir() + impressao;
    }


}
