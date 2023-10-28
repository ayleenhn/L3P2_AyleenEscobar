
package l3p2_ayleenescobar;

public class AppsUtilidad extends Aplicaciones{
    
    private String Categoria;
    
    public AppsUtilidad() {
        super();
    }

    public AppsUtilidad(String Categoria, String nombre, String desarrollador, double precio, boolean estado, double rating, int descargas) {
        super(nombre, desarrollador, precio, estado, rating, descargas);
        this.Categoria = Categoria;
    }

    public String getCategoria() {
        return Categoria;
    }

    public void setCategoria(String Categoria) {
        this.Categoria = Categoria;
    }
    
    
}
