package trabalho3;

public class Veiculo {
    private String marca;
    private String modelo;
    private int Ano;
    private double valor;
    private String status;
    private int cod;
    private String locatario;
    private boolean Flag;
    private int prazo;
    private int atraso=0;
    
    public int getAno() {
        return Ano;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public double getValor() {
        return valor;
    }

    public void setAno(int Ano) {
        this.Ano = Ano;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public void setCod(int cod) {
        this.cod = cod;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public void setLocatario(String locatario) {
        this.locatario = locatario;
    }

    public int getCod() {
        return cod;
    }

    public void excluir() {
        this.Flag = false;
        this.marca = "";
        this.Ano = 0;
        this.locatario = "";
        this.status = "";        
        this.valor = 0;        
        this.modelo = "";           
    } 

    public String getLocatario() {
        return locatario;
    }

    public boolean isFlag() {
        return Flag;
    }

    public void setFlag(boolean Flag) {
        this.Flag = Flag;
    }

    public int getPrazo() {
        return prazo;
    }

    public void setPrazo(int prazo) {
        this.prazo = prazo;
    }      

    public int getAtraso() {
        return atraso;
    }

    public void atraso() {
        this.atraso = this.atraso+1;
    }

    public void setAtraso(int atraso) {
        this.atraso = atraso;
    } 
    
}
