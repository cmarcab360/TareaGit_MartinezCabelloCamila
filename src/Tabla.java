

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author camila
 */
public class Tabla {
    private int numero;
    
    //constructor
    public Tabla(int num){
        this.numero=num;
    }
    
    //Metodo tabla
    public String tablaDeMultiplicar(){
        StringBuilder tabla= new StringBuilder();
        
        for (int i = 0; i <= 10; i++) {
           int resultado=this.numero*i;
            tabla.append(this.numero+"*"+i+"="+resultado+"\n");
        }
        return tabla.toString();
    }
    
}
