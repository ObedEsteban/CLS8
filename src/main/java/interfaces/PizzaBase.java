package interfaces;

public class PizzaBase implements IPreparable {
    private String nombre;
    private double precio;
    public PizzaBase(String n, double p){
        this.nombre=n;
        this.precio=p;

    }
    @Override
    public void prepare(){
        System.out.println("preparando la pizza...");
        System.out.println("la pizza esta lista...");
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
