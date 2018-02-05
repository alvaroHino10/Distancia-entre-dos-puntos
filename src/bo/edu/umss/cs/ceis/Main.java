package bo.edu.umss.cs.ceis;

public class Main {

    public static void main(String[] args) {
	    Punto punto1 = new Punto(2,3);
	    Punto punto2 = new Punto (-1,-1);
        int distEntrePuntos = punto2.distancia(punto1);
        System.out.println(punto2.distancia(punto1));
    }
}
