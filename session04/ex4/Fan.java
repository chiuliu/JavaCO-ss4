package ra.session04.ex4;

public class Fan {
    int SLOW = 1;
    int MEDIUM = 2;
    int FAST = 3;
    private int speed = SLOW;
    private boolean on = false;
    private double radius = 5;
    private String color = "blue";

    public Fan() {
    }

    public Fan(int MEDIUM, int SLOW, int FAST, int speed, boolean on, double radius, String color) {
        this.MEDIUM = MEDIUM;
        this.SLOW = SLOW;
        this.FAST = FAST;
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    class MainFan
    {
        public static void main(String[] args)
        {
            Fan fan1 = new Fan();
            Fan fan2 = new Fan();
            fan1.setSpeed(fan1.getFAST());
            fan1.setRadius(10);
            fan1.setColor("Yellow");
            fan1.setOn(true);
            fan2.setSpeed(fan2.getMEDIUM());
            fan2.setRadius(5);
            fan2.setColor("Blue");
            fan2.setOn(false);
            System.out.println(fan1.toString());//Method override
            System.out.println(fan2);//println auto call toString
        }
    }

    public int getSLOW() {
        return SLOW;
    }

    public void setSLOW(int SLOW) {
        this.SLOW = SLOW;
    }

    public int getMEDIUM() {
        return MEDIUM;
    }

    public void setMEDIUM(int MEDIUM) {
        this.MEDIUM = MEDIUM;
    }

    public int getFAST() {
        return FAST;
    }

    public void setFAST(int FAST) {
        this.FAST = FAST;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String toString(){
       return  "Fan is " + (on? "on": "off"  );
    }
}
