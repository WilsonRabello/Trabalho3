
package trabalho3;

import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;



public class Trabalho3 {
    static Veiculo Veiculos[]=new Veiculo[30];//Vetor de Veículos
    static int i=1;//Índice/Código dos veículos
    static int aux;//Auxiliar
    static int c1 = 0, c2 = 0, ca=0;//Contadores
  
    public static void cancel(){//Mensagem informando que a operação foi cancelada
        JOptionPane.showMessageDialog(null,"Operação cancelada.");
    }
    
    public static void erro(){//Mensagem informando que a operação foi cancelada
        JOptionPane.showMessageDialog(null,"Código inválido!","Erro",JOptionPane.ERROR_MESSAGE);
    }
    
    public static void cadastrar(){//Método de cadastro
        Veiculos[i]=new Veiculo();
        Veiculos[i].setMarca(JOptionPane.showInputDialog("Entre com a marca do veículo:"));
        Veiculos[i].setModelo(JOptionPane.showInputDialog("Entre com o modelo do veículo:"));
        Veiculos[i].setAno(Integer.parseInt(JOptionPane.showInputDialog("Entre com o ano do veículo:")));
        Veiculos[i].setValor(Double.parseDouble(JOptionPane.showInputDialog("Entre com o valor diário do veículo:")));
        Veiculos[i].setCod(i);
        Veiculos[i].setStatus("Disponivel");
        Veiculos[i].setFlag(true);
        JOptionPane.showMessageDialog(null,"Operação concluída.");  
        i++;
        c1++;
    }

    public static void alugar(){//Método pra alugar
        aux=Integer.parseInt(JOptionPane.showInputDialog("Entre com o código do veículo que dejesa alugar:"));
        if("Disponivel".equals(Veiculos[aux].getStatus())){
            Veiculos[aux].setLocatario(JOptionPane.showInputDialog("Entre com o nome do locatario:"));     
            Veiculos[aux].setPrazo(Integer.parseInt(JOptionPane.showInputDialog("Entre com o período de locação em dias:")));
            if(Veiculos[aux].getPrazo()<=30){
                Veiculos[aux].setStatus("Alugado");
                c2++;
                JOptionPane.showMessageDialog(null,"Operação concluída.");                
            }
            else{
                JOptionPane.showMessageDialog(null,"O período de locação é de no máximo 30 dias!","Erro",JOptionPane.ERROR_MESSAGE);  
            }
        }
        else{
            erro();
        }
    }
    
    public static void devolver(){
        aux=Integer.parseInt(JOptionPane.showInputDialog("Entre com o código do veículo que dejesa devolver:"));
        if("Alugado".equals(Veiculos[aux].getStatus())){
            double valor;
            if(Veiculos[aux].getAtraso()<=Veiculos[aux].getPrazo()){
                valor=Veiculos[aux].getValor()*Veiculos[aux].getPrazo();
                JOptionPane.showMessageDialog(null,"Nome do Locatario: "
                +Veiculos[aux].getLocatario()+"\nValor a pagar: "+valor);
                Veiculos[aux].setPrazo(0);
                Veiculos[aux].setAtraso(0);
                ca--;
                c2--;
                Veiculos[aux].setStatus("Disponivel");
            }
            else{
                valor=Veiculos[aux].getValor()*(Veiculos[aux].getPrazo()+2*(Veiculos[aux].getAtraso()-Veiculos[aux].getPrazo()));
                JOptionPane.showMessageDialog(null,"Nome do Locatario: "
                +Veiculos[aux].getLocatario()+"\nValor a pagar: "+valor);
                Veiculos[aux].setPrazo(0);
                Veiculos[aux].setAtraso(0);
                ca--;
                c2--;
                Veiculos[aux].setStatus("Disponivel");
            }
        }
        else{
            erro();
        }
        
    }
    
    public static void excluir(){
        aux=Integer.parseInt(JOptionPane.showInputDialog("Entre com o código do veículo que dejesa excluir:"));
        if("Disponivel".equals(Veiculos[aux].getStatus())){
            Veiculos[aux].excluir();
            c1 --;
        }
        else{
            erro();
        }
    }
    
    public static void consultar(){//Método pra consultar
        int j;
        if(c1>0)
        {
            for(aux=1;aux<i;aux++){
              if(Veiculos[aux].isFlag()==true){
                  j=JOptionPane.showConfirmDialog(null,
                  "\nCódigo do veículo:"+Veiculos[aux].getCod()
                  +"\nStatus do veículo:"+Veiculos[aux].getStatus()
                  +"\nModelo do veículo:"+Veiculos[aux].getModelo()
                  +"\nSIM para ver mais detalhes\nNÃO para ver o próximo veículo\nCANCELAR para retornar à tela inicial"
                  ,"",JOptionPane.YES_NO_CANCEL_OPTION);

                  if(j==2)
                      break;

                  else if (j==0){
                      JOptionPane.showMessageDialog(null,
                          "\nCódigo do veículo:"+Veiculos[aux].getCod()
                          +"\nStatus do veículo:"+Veiculos[aux].getStatus()
                          +"\nMarca do veículo:"+Veiculos[aux].getMarca()
                          +"\nModelo do veículo:"+Veiculos[aux].getModelo()
                          +"\nAno do veículo: "+Veiculos[aux].getAno()
                          +"\nValor diário do veículo: "+Veiculos[aux].getValor()
                          );
                  }
              }
          }  
        }
        else{
            JOptionPane.showMessageDialog(null,"Não há veículos cadastrados!","Erro",JOptionPane.ERROR_MESSAGE);
        }            
    }    
    public static void main(String[] args) {
        for(int cont=0;cont<30;cont++){
           Veiculos[cont]=new Veiculo();
           Veiculos[cont].setMarca("");
           Veiculos[cont].setModelo("");
           Veiculos[cont].setAno(0);
           Veiculos[cont].setValor(0);
           Veiculos[cont].setCod(cont);
           Veiculos[cont].setStatus("");
           Veiculos[cont].setFlag(false);
        }  
         
        
    
        Date dataa = new Date();
        data dat=new data();
        SimpleDateFormat f = new SimpleDateFormat("ddMMyyyy");
        String ad = f.format(dataa);
        int a,d1,d2,d3,d4;
        a=Integer.parseInt(ad);
        d1=a%10;
        a=a/10;
        d2=a%10;
        a=a/10;
        d3=a%10;
        a=a/10;
        d4=a%10;
        a=a/10;
        dat.setAno(d1+d2*10+d3*100+d4*1000);
        d1=a%10;
        a=a/10;
        d2=a%10;
        a=a/10;
        dat.setMes(d1+d2*10);
        d1=a%10;
        a=a/10;
        d2=a%10;        
        dat.setDia(d1+d2*10);                
        //Botões
        Object[] op = {"Consultar veículos","Adicionar veículos","Alugar veículos","Devolver veículos","Excluir veículos","Avançar data atual","Sair"};
        int escolha;        
        do{
            escolha = JOptionPane.showOptionDialog(null,
                    "Data atual:"+dat.getDia()+"/"+dat.getMes()+"/"+dat.getAno() + "\n" 
                    + "Quantidade de veículos alugados: " + c2 + "\n"
                    + "Quantidade de veículos cadastrados: " + c1 + "\n"
                    + "Quantidade de atrasos: "+ca+"\n"
                    + "Selecione uma opção:\n"
                    ,"Operações", 0, 1,null, op,null);
            
            switch(escolha){
                case 0://Completo
                    consultar();
                    break;
                case 1://Completo
                    cadastrar();
                    break;
                case 2:
                    alugar();
                    break;
                case 3:
                    devolver();
                    break;
                case 4:
                    excluir();                    
                    break;
                case 5:
                    int k,total;
                    dat.incrementardata();
                    for(k=1,total=0;k<i;k++){
                        if("Alugado".equals(Veiculos[k].getStatus())){
                            Veiculos[k].atraso();
                            if(Veiculos[k].getAtraso()>Veiculos[k].getPrazo()){
                                total=total+1;
                            }
                            ca=total;
                        }                        
                    }                    
                    break;
                case 6://Completo
                    break;
                
                default://Completo
                    escolha=6;
            }                        
        }while(escolha!=6);//Condição para encerrar o programa  
        
    }
}    
