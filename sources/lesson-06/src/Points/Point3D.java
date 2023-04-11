package Points;

public class Point3D extends Point2D {
    protected float z;

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public Point3D(float z) {
        super();
        this.z = z;
    }

    public Point3D() {
        super();
        this.z = 0.0F;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float x, float y, float z) {
        setXY(x, y);
        this.z = z;
    }

    public float[] getXYZ() {
        float[] newFloat = new float[3];
        newFloat[0] = getX();
        newFloat[1] = getY();
        newFloat[2] = getZ();
        return newFloat;
    }

    @Override
    public String toString() {
        return String.format("(%f, %f, %f)", x, y, z);
    }
}
