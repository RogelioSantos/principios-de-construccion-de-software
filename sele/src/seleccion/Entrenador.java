package seleccion;

public class Entrenador extends Personal {

    private int idFederacion;

    public Entrenador(int id, String nombre, String apellido, int edad, int idFederacion){
        super(id, nombre, apellido, edad);
        this.idFederacion = idFederacion;
    }

    @Override
    public void concentrarse(){
        System.out.println(nombre + " " + apellido + " " + "se está concentrando");
    }

    @Override
    public void viajar(){
        System.out.println(nombre + " " + apellido + " " + "está viajando");
    }

    public void dirigirPartido(){
        System.out.println(nombre + " " + apellido + " " + "está dirigiendo un partido");
    }

    public void dirigirEntrenamiento(){
        System.out.println(nombre + " " + apellido + " " + "está dirigiendo un entrenamiento");
    }
}
