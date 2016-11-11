package fh.java.geometry.model.quadrilateral;

/**
 * Created by Alex on 11.11.2016.
 */
public class Raute extends Square {

    private double sideB;
    private double sideE;
    private double sideF;


    public Raute() {}

    public Raute(int x, int y, double sideA, double SideE,double sideF) {
        this.x = x;
        this.y = y;
        this.sideA = sideA;
        this.sideE = sideE;
        this.sideF = sideF;

    }

    public double getSideB(){
        return this.sideB = sideB;
    }

    @Override
    public double calcArea() {
        return (sideE*sideF/2);
    }

    @Override
    public double calcPerimeter() {
        return (4*sideA);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Raute raute = (Raute) o;

        return Double.compare(raute.sideB, sideB) == 0;

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        long temp;
        temp = Double.doubleToLongBits(sideB);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
