package ec.uce.edu.models;

public abstract class Role implements Drawable{

    private int [] coordX;
    private int [] coordY;

    public Role(int[] cordX, int[] cordY) {
        this.coordX = cordX;
        this.coordY = cordY;
    }
    public Role(int size){
        this.coordX = new int[size];
        this.coordY = new int[size];
    }

    public Role() {

    }

    public int[] getCoordX() {
        return coordX;
    }

    public void setCoordX(int[] coordX) {
        this.coordX = coordX;
    }

    public int[] getCoordY() {
        return coordY;
    }

    public void setCoordY(int[] coordY) {
        this.coordY = coordY;
    }
}
