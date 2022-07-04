/* 
GRUPO 7
Lucas Gomes Morgani da Silva    26529041	
Juliano Belentani               25972502	
Leonardo Ray Azevedo Bertuliano 26470811	
Samuel Vinícius Basílio         26414911	
Diego Ribeiro Duarte            28027639
Fábio Luiz Teixeira             28031270	
*/
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
