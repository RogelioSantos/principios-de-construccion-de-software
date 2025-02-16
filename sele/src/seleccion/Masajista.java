package seleccion;

public class Masajista extends Personal {

    private String profesion;
    private int aniosExperiencia;


    public Masajista(int id, String nombre, String apellido, int edad, String profesion, int aniosExperiencia){
        super(id, nombre, apellido, edad);
        this.profesion = profesion;
        this.aniosExperiencia = aniosExperiencia;
    }

    @Override
    public void concentrarse() {
        System.out.println(nombre + " " + apellido + " " + "se está concentrando");
    }

    @Override
    public void viajar(){
        System.out.println(nombre + " " + apellido + " " + "está viajando");
    }

    public void darMasaje(){
        System.out.println(nombre + " " + apellido + " " + "está dando un masaje");
    }
}
