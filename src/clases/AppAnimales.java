
package clases;


public class AppAnimales {

   
    public static void main(String[] args) {
     Gato pupi= new Gato();
     Gato pupa= new Gato (Sexo.HEMBRA);
     Ave ave= new Ave();
     Pinguino pinguino= new Pinguino();
     
        System.out.println(pupi);
        pupi.dormir();
        System.out.println(pupa);
        pupa.ronronea();
        
        pupi.pelearCon(pupa);
        pupi.comer("pescado");
        pupa.comer("mandioca");
        
        pupa.hacerRuido();
        
    }
    
}
