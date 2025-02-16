package seleccion;

public class App {
    public static void main(String[] args) throws Exception {

        Futbolista futbolista1 = new Futbolista(1, "Cristiano", "Ronaldo", 35, 7, "Delantero");
        Entrenador entrenador1 = new Entrenador(1, "Gerardo", "Martinez", 60, 440);
        Masajista masajista1 = new Masajista(1,"Juan" ,"Perez", 45, "Fisioterapeuta", 10);

        futbolista1.concentrarse();
        futbolista1.viajar();
        futbolista1.jugarPartido();
        futbolista1.entrenar();

        entrenador1.concentrarse();
        entrenador1.viajar();
        entrenador1.dirigirPartido();
        entrenador1.dirigirEntrenamiento();

        masajista1.concentrarse();
        masajista1.viajar();
        masajista1.darMasaje();
    }
}
