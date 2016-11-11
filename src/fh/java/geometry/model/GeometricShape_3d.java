package fh.java.geometry.model;

/**
 * Created by Alex on 11.11.2016.
 */
public abstract class GeometricShape_3d extends GeometricShape{

    protected int z = 0;

    public int geZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    public abstract double calcSurface();

    public abstract double calcVolume();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        GeometricShape_3d that = (GeometricShape_3d) o;

        return z == that.z;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + z;
        return result;
    }
}
