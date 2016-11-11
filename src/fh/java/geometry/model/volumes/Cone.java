package fh.java.geometry.model.volumes;

/**
 * Created by Alex on 11.11.2016.
 */
public class Cone extends VolumeShape {

    private double sideA;
    private double height;
    private double radius;

    public Cone(int x, int y, int z,double sideA,double height,double radius){
        this.x = x;
        this.y = y;
        this.z = z;
        this.sideA = sideA;
        this.height = height;
        this.radius = radius;
    }

    public double getSideA(){
        return sideA;
    }

    public void setSideA(double sideA){
        this.sideA = sideA;
    }

    public double getHeight(){
        return sideA;
    }

    public void setHeight(double sideA){
        this.sideA = sideA;
    }

    public double getRadius(){
        return sideA;
    }
    public void setRadius(double sideA){
        this.sideA = sideA;
    }

    @Override
    public double calcSurface() {
        return 0;
    }

    @Override
    public double calcVolume() {
        return 0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Cone cone = (Cone) o;

        if (Double.compare(cone.sideA, sideA) != 0) return false;
        if (Double.compare(cone.height, height) != 0) return false;
        return Double.compare(cone.radius, radius) == 0;

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        long temp;
        temp = Double.doubleToLongBits(sideA);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(height);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(radius);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }


}
