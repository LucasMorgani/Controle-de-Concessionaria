/* 
GRUPO 7
Lucas Gomes Morgani da Silva    26529041	
Juliano Belentani               25972502	
Leonardo Ray Azevedo Bertuliano 26470811	
Samuel Vinícius Basílio         26414911	
Diego Ribeiro Duarte            28027639
Fábio Luiz Teixeira             28031270	
*/  
public class Veiculo {
    private String marca;
    private String modelo;
    private int ano;
    private String placa;
    private float valor;
    

    public Veiculo(String ma, String mo, int an, String pl, float va){
        marca = ma;
        modelo = mo;
        ano = an;
        placa = pl;
        valor = va; 
    }

    public String getMarca() {  
        return marca; 
    }
    public String getModelo() { 
        return modelo;  
    }
    public int getAno() { 
        return ano;  
    }
    public String getPlaca() { 
        return placa;  
    }
    public float getValor() { 
        return valor;  
    }
    public void setMarca (String marca) { 
        this.marca = marca; 
    }
    public void setModelo (String modelo) { 
        this.modelo = modelo; 
    }
    public void setAno (int ano) { 
        this.ano = ano; 
    }
    public void setPlaca (String placa) { 
        this.placa = placa; 
    }
    public void setValor (float valor) { 
        this.valor = valor; 
    }

    public String imprimir(){
        String impressao = "\nMarca: " + marca + "\nModelo: " + modelo + "\nAno do veículo: " + ano + "\nPlaca do veiculo: " + placa + "\nValor do veiculo: R$" + valor;
        return impressao;
    }


}
