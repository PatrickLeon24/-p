/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete.clases;

import java.util.Random;

/**
 *
 * @author o13309
 */
public class Infantil extends Programa{
    private float montoseguro;

    public Infantil(String codigo, String descripcion) {
        super(codigo, descripcion);
    }

    @Override
    public void calcularmontocapital() {
     Random r1 =new Random();
     Random r2 =new Random();
     int x=r1.nextInt(45000-20000+1)+20000;
     int y=r2.nextInt(45000-20000+1)+20000;
     this.montocapital=x+y;
     
    }
    public void Calcularmontoseguro(){
        this.montoseguro=(float) (this.montocapital*0.03);
    }

    @Override
    public String toString() {
        return "codigo:" + this.codigo + "\ndescripcion:" + this.descripcion +
                "\nmontocapital:" + this.montocapital + "\nrating:" + this.rating+
                "\nSeguro:"+this.montoseguro ; 
    }
    
    
}
