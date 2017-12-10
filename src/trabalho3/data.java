package trabalho3;

public class data {
    int dia;
    int mes;
    int ano;

    public int getAno() {
        return ano;
    }

    public String getDia() {
        if(dia<10)
            return "0"+dia;
        else
            return ""+dia;
    }

    public String getMes() {
        if(mes<10)
            return "0"+this.mes;
        else
            return ""+this.mes;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }
    
    public void incrementardata(){
        if(this.dia<28){
            this.dia=this.dia+1;
        }
        else if(this.dia==28&&this.mes==2){
            this.dia=1;
            this.mes=this.mes+1;
        }
        else if(this.dia==30&&(this.mes==4||this.mes==6||this.mes==9||this.mes==11)){
            this.dia=1;
            this.mes=this.mes+1;
        }
        else if(this.dia==31&&this.mes==12){
            this.dia=1;
            this.mes=1;
            this.ano=this.ano+1;
        }
        else if(this.dia==31&&(this.mes==1||this.mes==3||this.mes==5||this.mes==7||this.mes==8||this.mes==10)){
            this.dia=1;
            this.mes=this.mes+1;
        }
        else if(this.dia<30&&this.mes!=2){
            this.dia=this.dia+1;
        }
        else if(this.dia<31&&this.mes!=4&&this.mes!=6&&this.mes!=9&&this.mes!=11){
            this.dia=this.dia+1;
        }
    }
}
