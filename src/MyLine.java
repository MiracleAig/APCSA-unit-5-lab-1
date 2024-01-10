public class MyLine {

    private MyPoint p1;
    private MyPoint p2;

    private double slope;
    private double xInt;
    private double yInt;

    public MyLine(MyPoint p1, MyPoint p2){
        this.p1 = p1;
        this.p2  = p2;
        this.fixData();
    }

    public MyPoint getPointOne(){
        return p1;
    }

    public MyPoint getPointTwo(){
        return p2;
    }

    public double getSlope(){
        return slope;
    }

    public double getXint(){
        return xInt;
    }

    public double getYint(){
        return yInt;
    }

    public void setPointOne(MyPoint p1){
        this.p1 = p1;
        this.fixData();
    }

    public void setPointTwo(MyPoint p2){
        this.p2 = p2;
        this.fixData();
    }

    public void fixData(){
        slope = (p2.getY() - p1.getY()) / (p2.getX() - p1.getX());
    }

    public String toString(){
        String output =  String.format("Points: [(%.3f,%.3f),(%.3f,%.3f)]", p1.getX(), p1.getY(), p2.getX(), p2.getY());
        output += String.format("\nSlope: %.3f", slope);
        output += "\nX Intercept: " + getXint();
        output += "\nY Intercept: " + getYint();
        output += String.format("\ny = %.3fx + %.3f", getSlope(), getYint());

        return output;
    }

}
