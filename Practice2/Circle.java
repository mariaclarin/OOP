package Practice2;

public class Circle {
    private double radius;
    private String color;
    
    public Circle(){
        this.radius = 1.0;
        this.color = "red";
    }
    public Circle(double radius){
        this.radius= radius;
        this.color = "red";
    }
    public Circle(double radius, String color){
        this.radius= radius;
        this.color = color;
    }

    //setter getter for radius
    public void setRadius(double num){
        this.radius = num;
    }
    public double getRadius(){
        return this.radius;
    }

    //setter getter for color
    public void setColor(String type){
        this.color = type;
    }
    public String getColor(){
        return this.color;
    }

    //print method
    public String toString(){
        return "Radius : " + this.radius +"\nColor : " + this.color; 
    }

    //area and circumference
    public double getArea(){
        return Math.PI * Math.pow(this.radius, 2);
    }
    public double getCircumference(){
        return Math.PI * (2 * this.radius);
    }
}
