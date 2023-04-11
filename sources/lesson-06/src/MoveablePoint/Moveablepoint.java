package MoveablePoint;

public class Moveablepoint extends Point {
    protected float xSpeed;
    protected float ySpeed;

    public Moveablepoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public Moveablepoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public Moveablepoint() {
        xSpeed = 0.0f;
        ySpeed = 0.0f;
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public float[] getSpeed() {
        float[] arr = new float[2];
        arr[0] = xSpeed;
        arr[1] = ySpeed;
        return arr;
    }

    public void setSpeed(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public Moveablepoint move() {
        this.x += this.xSpeed;
        this.y += this.ySpeed;
        return this;
    }

    @Override
    public String toString() {
        return String.format("%s, speed = (%f, %f)", super.toString(), xSpeed, ySpeed);
    }
}
