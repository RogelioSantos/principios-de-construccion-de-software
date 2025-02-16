package seleccion;

public abstract class Personal {
    protected int id;
    protected String nombre;
    protected String apellido;
    protected int edad;

    public Personal (int id, String nombre, String apellido, int edad){
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public abstract void concentrarse();
    public abstract void viajar();


}
