package Balls;

public class Balls {
    private double x = 0.0;
    private double y = 0.0;

    public void ball(){ }
    public void ball(double x, double y){
        this.x = x;
        this.y = y;
    }
    public double getX(){
        return x;
    }
    public double getY(){
        return y;
    }
    public double getX(double x){
        return x;
    }
    public double getY(double y){
        return y;
    }

    public void setXY(double x, double y){
        this.x = x;
        this.y = y;
    }
    public void move( double xDisp, double yDisp){
        x+=xDisp;
        y+=yDisp;
    }

    @Override
    public String toString() {
        return "Ball @ ("+this.x+","+this.y+").";

    }

}
