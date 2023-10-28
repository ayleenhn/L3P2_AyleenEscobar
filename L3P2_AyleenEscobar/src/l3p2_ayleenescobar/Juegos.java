
package l3p2_ayleenescobar;

public class Juegos extends Aplicaciones{
    
    private int edad;
    
    public Juegos(){
        super();
    }

    public Juegos(int edad, String nombre, String desarrollador, double precio, boolean estado, double rating, int descargas) {
        super(nombre, desarrollador, precio, estado, rating, descargas);
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    
}
