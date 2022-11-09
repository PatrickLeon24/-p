/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete.gestion;

import paquete.clases.Programa;

/**
 *
 * @author o13309
 */
public class Gestionar {
    private Programa[] arreglo;
    private int conta;

    public Gestionar() {
        arreglo= new Programa[10];
        conta=0;
        
    }

    public Programa[] getArreglo() {
        return arreglo;
    }

    public void setArreglo(Programa[] arreglo) {
        this.arreglo = arreglo;
    }

    public int getConta() {
        return conta;
    }

    public void setConta(int conta) {
        this.conta = conta;
    }
    public void IngresarPrograma(Programa ref){
        if(conta<arreglo.length){
            if(ref.getDescripcion().equalsIgnoreCase("Infantil")){
                ref.setCodigo("I"+ref.getCodigo());
                arreglo[conta]=ref;
                conta++;
                
            }
            if(ref.getDescripcion().equalsIgnoreCase("Periodistico")){
                ref.setCodigo("P"+ref.getCodigo());
                arreglo[conta]=ref;
                conta++;
                
            }
            if(ref.getDescripcion().equalsIgnoreCase("Entretenimiento")){
                ref.setCodigo("E"+ref.getCodigo());
                arreglo[conta]=ref;
                conta++;
                
            }
            
            
            
            
            
        }
        else{
            System.out.println("Se ha excedido el limite de programas :o");
        }
    }
    public void Eliminarporcodigo(String codigo){
	for(int i=0;i<conta;i++)
	{
		if(arreglo[i].getCodigo().equalsIgnoreCase(codigo)){
			for(int j=0;j<conta;j++){
				arreglo[j]=arreglo[j+1];
				}
			arreglo[conta-1]=null;
			conta--;
		}
	}
        
    }
     public void Ordenar(){
        Programa aux;
        for(int i=0;i<conta-1;i++)
        {
            for(int j=i+1;j<conta;j++)
            {
                if(arreglo[i].getMontocapital()<arreglo[j].getMontocapital())
                {
                    aux=arreglo[i];
                    arreglo[i]=arreglo[j];
                    arreglo[j]=aux;
                }
            }
        }
    }
     public String VerInfo(){
        String cad="";
        for(int i=0;i<conta;i++)
        {
            cad=cad+arreglo[i].toString()+"\n";
            
        }
        return cad;
        
    }
     //No hice el de ingresar por parametro
    
    
    
}
