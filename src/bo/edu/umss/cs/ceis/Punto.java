package bo.edu.umss.cs.ceis;

public class Punto {
    int CoordX;
    int CoordY;
    public Punto (int x, int y){
        CoordX = x;
        CoordY = y;
    }
    public int getValorX(){
        return CoordX;
    }

    public int getValorY(){
        return CoordY;
    }

    public int distancia(Punto P1){
        int dist = (int) Math.sqrt(Math.pow(getValorX()- P1.getValorX(),2) + Math.pow(getValorY() - P1.getValorY(),2));
        return dist;
    }

}
