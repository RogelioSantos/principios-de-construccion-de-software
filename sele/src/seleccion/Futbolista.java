package seleccion;

public class Futbolista extends Personal {

    private int numJugador;
    private String posicionEnCancha;

    public Futbolista(int id, String nombre, String apellido, int edad, int numJugador, String posicionEnCancha){
        super(id, nombre, apellido, edad);
        this.numJugador = numJugador;
        this.posicionEnCancha = posicionEnCancha;
    }


    @Override
    public void concentrarse() {
        System.out.println(nombre + " " + apellido + " " + "se está concentrando");
    }

    @Override
    public void viajar(){
        System.out.println(nombre + " " + apellido + " " + "está viajando");
    }

    public void jugarPartido(){
        System.out.println(nombre + " " + apellido + " " + "está jugando un partido");
    }

    public void entrenar(){
        System.out.println(nombre + " " + apellido + " " + "está entrenando");
    }
}
