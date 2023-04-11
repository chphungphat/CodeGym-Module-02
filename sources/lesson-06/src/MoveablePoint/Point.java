package MoveablePoint;

public class Point {
    protected float x;
    protected float y;

    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public Point() {
        x = 0.0F;
        y = 0.0F;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float[] getXY() {
        float[] newFloat = new float[2];
        newFloat[0] = x;
        newFloat[1] = y;
        return newFloat;
    }

    @Override
    public String toString() {
        return String.format("(%f, %f)", x, y);
    }
}
