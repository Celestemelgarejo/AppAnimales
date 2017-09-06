
package clases;

public class Perro extends Animal implements Mascota {
    private String raza;
    private int peso;

    public Perro() {
    }

    public Perro(Sexo sexo) {
        super(sexo);
    }

    public Perro(String raza, int peso, Sexo sexo) {
        super(sexo);
        this.raza = raza;
        this.peso = peso;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }
    
    

    @Override
    public void comer(String comida) {
        System.out.println("Estoy comiendo");
    }

    @Override
    public void pelearCon(Animal contrincante) {
        System.out.println("Estoy ladrando");
       
    }

    @Override
    public void hacerRuido() {
        System.out.println("Estoy molestando");
       
    }

   
}
