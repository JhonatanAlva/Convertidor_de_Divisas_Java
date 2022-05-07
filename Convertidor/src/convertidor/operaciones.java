package convertidor;

import javax.swing.JComboBox;

/**
 *
 * @author GAMING GIGABYTE
 */
public class operaciones {
    private float Valor;
    private int divisa2, divisa3;
    private float resultado;

    public double getValor() {
        return Valor;
    }

    public void setValor(double valor) {
        this.Valor = (float) valor;
    }

    public int getDivisa2() {
        return divisa2;
    }

    public void setDivisa2(int divisa2) {
        this.divisa2 = divisa2;
    }

    public int getDivisa3() {
        return divisa3;
    }

    public void setDivisa3(int divisa3) {
        this.divisa3 = divisa3;
    }

    public double getResultado() {
        return resultado;
    }

    public void setResultado(double resultado) {
        this.resultado = (float) resultado;
    }

    public operaciones() {
    }
    
    //operaciones
    
    public float convertir(){
        
        if(divisa2 == 0 && divisa3 == 0){
            resultado = Valor;
        }else if(divisa2 == 0 && divisa3 == 1){
            resultado = (float) (Valor * 0.95);
        }else if(divisa2 == 0 && divisa3 == 2){
            resultado = (float) (Valor * 7.67);
        }else if(divisa2 == 0 && divisa3 == 3){
            resultado = (float) (Valor * 20.18);
        }else if(divisa2 == 1 && divisa3 == 0){
            resultado = (float) (Valor * 1.05);
        }else if(divisa2 == 1 && divisa3 == 1){
            resultado = Valor;
        }else if(divisa2 == 1 && divisa3 == 2){
            resultado = (float) (Valor * 8.08);
        }else if(divisa2 == 1 && divisa3 == 3){
            resultado = (float) (Valor * 21.26);
        }else if(divisa2 == 2 && divisa3 == 0){
            resultado = (float) (Valor * 0.13);
        }else if(divisa2 == 2 && divisa3 == 1){
            resultado = (float) (Valor * 0.12);
        }else if(divisa2 == 2 && divisa3 == 2){
            resultado = Valor;
        }else if(divisa2 == 2 && divisa3 == 3){
            resultado = (float) (Valor * 2.63);
        }else if(divisa2 == 3 && divisa3 == 0){
            resultado = (float) (Valor * 0.05);
        }else if(divisa2 == 3 && divisa3 == 1){
            resultado = (float) (Valor * 0.047);
        }else if(divisa2 == 3 && divisa3 == 2){
            resultado = (float) (Valor * 0.38);
        }else if(divisa2 == 3 && divisa3 == 3){
            resultado = Valor;
        }
        
        return resultado;
    }
    
}
