package l3p2_ayleenescobar;

public class Aplicaciones {
    
    private String nombre;
    private String desarrollador;
    private double precio;
    private boolean estado;
    private double rating;
    private int descargas;

    public Aplicaciones() {
    }

    public Aplicaciones(String nombre, String desarrollador, double precio, boolean estado, double rating, int descargas) {
        this.nombre = nombre;
        this.desarrollador = desarrollador;
        this.precio = precio;
        this.estado = estado;
        this.rating = rating;
        descargas = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDesarrollador() {
        return desarrollador;
    }

    public void setDesarrollador(String desarrollador) {
        this.desarrollador = desarrollador;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public int getDescargas() {
        return descargas;
    }

    public void setDescargas(int descargas) {
        this.descargas = descargas;
    }

    @Override
    public String toString() {
        return "Aplicaciones{" + "nombre=" + nombre + ", desarrollador=" + desarrollador + ", precio=" + precio + ", estado=" + estado + ", rating=" + rating + ", descargas=" + descargas + '}';
    }
    
    
}