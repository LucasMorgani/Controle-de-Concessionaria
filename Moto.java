/* 
GRUPO 7
Lucas Gomes Morgani da Silva    26529041	
Juliano Belentani               25972502	
Leonardo Ray Azevedo Bertuliano 26470811	
Samuel Vinícius Basílio         26414911	
Diego Ribeiro Duarte            28027639
Fábio Luiz Teixeira             28031270	
*/
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
