/* 
GRUPO 7
Lucas Gomes Morgani da Silva    26529041
Juliano Belentani               25972502
Leonardo Ray Azevedo Bertuliano 26470811
Samuel Vinícius Basílio         26414911
Diego Ribeiro Duarte            28027639
Fábio Luiz Teixeira             28031270
*/
import java.util.ArrayList;
import javax.swing.JOptionPane;
public class TesteConcessionaria {
    public static void main(String[] args) {
        


        Carro cadv; //variavel que adiciona na lista do carro
        Moto cadv3; //variavel que adiciona na lista da moto
        Caminhao cadv2; //variavel que adiciona na lista do caminhao
        Cliente cadastrarCliente; //variavel que adiciona cliente na lista

        ArrayList <Veiculo>listageral = new ArrayList<Veiculo>();
        ArrayList <Carro>listacarro = new ArrayList<Carro>(); //criando uma lista array para a classe carro
        ArrayList <Moto>listamoto = new ArrayList<Moto>(); //criando uma lista array para a classe moto
        ArrayList <Caminhao>listacaminhao = new ArrayList<Caminhao>(); //criando uma lista array para a classe caminhao
        ArrayList <Cliente>listacliente = new ArrayList<Cliente>();

        char resp; //variavel para controlar a estrutura de repeti��o

        //variaveis auxliares
        //geral
        int tabela;
        int tabela1;
        int tabela3 = 3;

        //1
        String marc;
        String model;
        int an;
        String plac;
        float valo;
        String tipo;

        //2
        int contestoque;
        

        //3
        String consultaplaca;
        String tabelaConsulta;
        String tabelaConsulta1;
        
        //4
        String consultacliente;



        //4
        String nome,cpf, endereco;
        float compra;
        int telefone;




        do{
            tabela = Integer.parseInt(JOptionPane.showInputDialog("Digite uma das opções: " + 
                                                                    "\n1-Cadastrar veículo"+
                                                                    "\n2-Consultar estoque"+
                                                                    "\n3-Gerenciar veiculos"+
                                                                    "\n4-Cadastrar cliente"+
                                                                    "\n5-Gerenciar clientes"+
                                                                    "\n6-Sair"));
            switch(tabela){
                case 1:
                    do{
                        tabela1 = Integer.parseInt(JOptionPane.showInputDialog("digite uma das opções: " + "\n1-Cadastrar carro" +
                                                                                "\n2-Cadastrar caminhão"+
                                                                                "\n3-Cadastrar moto"+
                                                                                "\n4-Voltar ao menu inicial"));
                                switch(tabela1){
                                    case 1:
                                        do{
                                            marc = JOptionPane.showInputDialog("Digite a marca do carro"); 
                                            model = JOptionPane.showInputDialog("Digite o modelo do carro"); 
                                            an=Integer.parseInt(JOptionPane.showInputDialog("Digite o ano do carro")); 
                                            plac=JOptionPane.showInputDialog("Digite a placa do carro (AAA-####)"); 
                                            valo=Float.parseFloat(JOptionPane.showInputDialog("Digite o valor do carro")); 
                                            tipo=JOptionPane.showInputDialog("Digite o tipo do veiculo"); 
                                            cadv = new Carro(marc ,model ,an  ,plac, valo, tipo);
                                            listacarro.add(cadv);
                                            JOptionPane.showMessageDialog(null, "VEICULO CADASTRADO COM SUCESSO" + cadv.imprimir());
                                            resp = JOptionPane.showInputDialog("Deseja adicionar um novo carro? s/n").charAt(0);
                                            }while(resp == 's' || resp == 'S');
                                            break;
                                    case 2:
                                        do{
                                            marc = JOptionPane.showInputDialog("Digite a marca do caminhão"); 
                                            model = JOptionPane.showInputDialog("Digite o modelo do caminhão"); 
                                            an=Integer.parseInt(JOptionPane.showInputDialog("Digite o ano do caminhão")); 
                                            plac=JOptionPane.showInputDialog("Digite a placa do caminhão (AAA-####)"); 
                                            valo=Float.parseFloat(JOptionPane.showInputDialog("Digite o valor do caminhão")); 
                                            tipo=JOptionPane.showInputDialog("Digite o tipo do bau do caminhão"); 
                                            cadv2 = new Caminhao(marc ,model ,an  ,plac, valo, tipo);
                                            listacaminhao.add(cadv2);
                                            JOptionPane.showMessageDialog(null,"VEICULO CADASTRADO COM SUCESSO" + cadv2.imprimir());
                                            resp = JOptionPane.showInputDialog("Deseja adicionar um novo caminhão? s/n").charAt(0);
                                            }while(resp == 's' || resp == 'S');
                                            break;
                                    case 3: 
                                        do{
                                            marc = JOptionPane.showInputDialog("Digite a marca da moto"); 
                                            model = JOptionPane.showInputDialog("Digite o modelo da moto"); 
                                            an=Integer.parseInt(JOptionPane.showInputDialog("Digite o ano da moto")); 
                                            plac=JOptionPane.showInputDialog("Digite a placa da moto (AAA-####)"); 
                                            valo=Float.parseFloat(JOptionPane.showInputDialog("Digite o valor da moto")); 
                                            tipo=JOptionPane.showInputDialog("Digite a cilindrada da moto"); 
                                            cadv3 = new Moto(marc ,model ,an  ,plac, valo, tipo);
                                            listamoto.add(cadv3);
                                            
                                            listageral.add(cadv3);
                                            
                                            JOptionPane.showMessageDialog(null,"VEICULO CADASTRADO COM SUCESSO" + cadv3.imprimir());
                                            resp = JOptionPane.showInputDialog("Deseja adicionar uma nova moto? s/n").charAt(0);
                                            }while(resp == 's' || resp == 'S');
                                            break;
                                    
                                        }
                                        }while(tabela1 != 4);
                break;                        
                case 2:
                contestoque = Integer.parseInt(JOptionPane.showInputDialog("Digite qual tipo de veiculo deseja consultar o estoque: " + 
                                                                            "\n1-Carro" + 
                                                                            "\n2-Caminhão" + 
                                                                            "\n3-Moto"));
                switch(contestoque){
                    case 1://carro
                                for(int i = 0; i < listacarro.size(); i++){
                                    JOptionPane.showMessageDialog(null, "Carro " + (i+1) + " de " + listacarro.size() + " " + "\n" + listacarro.get(i).imprimir());
                                }
                                if( listacarro.isEmpty())
                                JOptionPane.showMessageDialog(null,"NÃO HÁ VEICULOS CADASTRADOS");
                            break;
                    case 2://caminhão
                            for(int i = 0; i < listacaminhao.size(); i++){
                                JOptionPane.showMessageDialog(null, "Caminh�o " + (i+1) + " de " + listacaminhao.size() + " " + "\n" + listacaminhao.get(i).imprimir());
                            }
                            if( listacaminhao.isEmpty())
                                JOptionPane.showMessageDialog(null,"NÃO HÁ VEICULOS CADASTRADOS");
                            break;
                    case 3://moto
                    for(int i = 0; i < listamoto.size(); i++){
                        JOptionPane.showMessageDialog(null, "moto " + (i+1) + " de " + listamoto.size() + " " + "\n" + listamoto.get(i).imprimir());
                    }
                    if( listacaminhao.isEmpty())
                                JOptionPane.showMessageDialog(null,"NÃO HÁ VEICULOS CADASTRADOS");
                    break;
                    default:
                        System.out.println("Tipo inválido");
                        break;
                    }break;
                    
            case 3:
                tabelaConsulta = JOptionPane.showInputDialog("Digite 1 remover um veiculo" + "\nDigite 2 para consultar um veiculo");
                switch(tabelaConsulta){
                    case "1":
                    tabelaConsulta1 = JOptionPane.showInputDialog("Digite 1 para remover um carro " + 
                                                                "\nDigite 2 para remover um caminhão"+
                                                                "\nDigite 3 para remover uma moto");
                        switch(tabelaConsulta1){
                            case "1":
                            consultaplaca = JOptionPane.showInputDialog("Digite a placa do veiculo (AAA-####)");
                            
                            for(int i = 0; i < listacarro.size(); i++){
                        	    Carro obj = listacarro.get(i);
                        	    	if(obj.getPlaca().equals(consultaplaca)){
                        	    		listacarro.remove(i);
                                        JOptionPane.showMessageDialog(null,"VEICULO REMOVIDO COM SUCESSO");
                        	    }

                            }     
                            
                            break;

                            case "2":
                            consultaplaca = JOptionPane.showInputDialog("Digite a placa do veiculo (AAA-####)");
                            
                            for(int i = 0; i < listacaminhao.size(); i++){
                        	    Caminhao obj = listacaminhao.get(i);
                        	    	if(obj.getPlaca().equals(consultaplaca)){
                        	    		listacaminhao.remove(i);
                                        JOptionPane.showMessageDialog(null,"VEICULO REMOVIDO COM SUCESSO");
                        	    }
                            }  
                            
                            break;

                            case "3":
                            consultaplaca = JOptionPane.showInputDialog("Digite a placa do veiculo (AAA-####)");
                            
                            for(int i = 0; i < listamoto.size(); i++){
                        	    Moto obj = listamoto.get(i);
                        	    	if(obj.getPlaca().equals(consultaplaca)){
                        	    		listamoto.remove(i);
                                        JOptionPane.showMessageDialog(null,"VEICULO REMOVIDO COM SUCESSO");
                        	    }
                            }  
                            break;
                        }
                    break;

                    case "2":
                    tabelaConsulta1 = JOptionPane.showInputDialog("Digite 1 para consultar um carro " + 
                                                                    "\nDigite 2 para consultar um caminhão"+
                                                                    "\nDigite 3 para consultar uma moto");
                        switch(tabelaConsulta1){
                            case "1":
                            consultaplaca = JOptionPane.showInputDialog("Digite a placa do veiculo (AAA-####):");
                            for(int i = 0; i < listacarro.size(); i++){
                        	    Carro obj = listacarro.get(i);
                        	    	if(obj.getPlaca().equals(consultaplaca)){
                        	    		JOptionPane.showInputDialog(null, obj.imprimir());
                        	    }
                            }
                        	  
                            break;

                            case "2":
                            consultaplaca = JOptionPane.showInputDialog("Digite a placa do veiculo (AAA-####):");
                            for(int i = 0; i < listacaminhao.size(); i++){
                        	    Caminhao obj = listacaminhao.get(i);
                        	    	if(obj.getPlaca().equals(consultaplaca)){
                        	    		JOptionPane.showInputDialog(null, obj.imprimir());
                        	    }
                            }
                            break;

                            case "3":
                            consultaplaca = JOptionPane.showInputDialog("Digite a placa do veiculo (AAA-####):");
                            for(int i = 0; i < listamoto.size(); i++){
                            	Moto obj = listamoto.get(i);
                            	if(obj.getPlaca().equals(consultaplaca)){
                            		JOptionPane.showInputDialog(null, obj.imprimir());
                        	    		
                        	    		
                        	    }
                            }
                            break;
                        }
                    break;

                
                }

            break;
            case 4:
                do{
                    nome = JOptionPane.showInputDialog("Digite o nome do cliente"); 
                    cpf = JOptionPane.showInputDialog("Digite o cpf do cliente"); 
                    compra=Float.parseFloat(JOptionPane.showInputDialog("Digite o valor da compra do cliente")); 
                    telefone=Integer.parseInt(JOptionPane.showInputDialog("Digite o telefone do cliente")); 
                    endereco=JOptionPane.showInputDialog("Digite o endereco do cliente"); 
                    cadastrarCliente = new Cliente (nome ,cpf ,compra  ,telefone, endereco);
                    listacliente.add(cadastrarCliente);
                    JOptionPane.showMessageDialog(null,"CLIENTE CADASTRADO COM SUCESSO");
                    resp = JOptionPane.showInputDialog("Deseja adicionar um novo cliente? s/n").charAt(0);
                }while(resp == 's' || resp == 'S');
            break;
            case 5:
                String gerenciarclientes = JOptionPane.showInputDialog(null, "Escolha uma opção: " + "\n1-Lista de cliente"+
                                                                                                    "\n2-Consultar cliente"+
                                                                                                    "\n3-Remover cliente");   
                switch (gerenciarclientes) {
                    case "1":
                        for(int i = 0; i < listacliente.size(); i++){
                            JOptionPane.showMessageDialog(null, "Cliente " + (i+1) + " de " + listacliente.size() + " " + "\n"  + listacliente.get(i).imprimir());
                        }
                        if( listacliente.isEmpty())
                                JOptionPane.showMessageDialog(null,"NÃO HÁ CLIENTES CADASTRADOS");
                    break;
                    case "2":    
                        consultacliente = JOptionPane.showInputDialog("Digite o cpf do cliente para a consulta");
                        for(int i = 0; i < listacliente.size(); i++){
                            Cliente obj = listacliente.get(i);
                            if(obj.getCpf().equals(consultacliente)){
                                JOptionPane.showInputDialog(null, obj.imprimir());   
                            }}
                    break;
                    case "3":
                            consultacliente = JOptionPane.showInputDialog("Digite o cpf do cliente para a remoção");
                            for(int i = 0; i < listacliente.size(); i++){
                                Cliente obj = listacliente.get(i);
                                    if(obj.getCpf().equals(consultacliente)){
                                        listacliente.remove(i);
                                        JOptionPane.showMessageDialog(null,"CLIENTE REMOVIDO COM SUCESSO");
                            }}
                              
                    break;    
                    default:
                        break;
                }
            break;
            case 6:
                tabela3 = 4;
                break;
            default:
                JOptionPane.showMessageDialog(null, "TIPO INVALIDO  ");
                tabela3 = 4; 
                    
                                        
                                }
    }while(tabela3 == 3);
}}
