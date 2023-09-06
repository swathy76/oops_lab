public class Main
{
	public static void main(String[] args)
    {
        Rectangle obj = new Rectangle();
        obj.Area(30, 20);
       
        Circle obj1 = new Circle();
        obj1.Area(3);
       
        Square obj2 = new Square();
        obj2.Area(20);
        
        
    }
}
class Square 
{
   
    void Area(double side)
    {
        System.out.println("Area of the Square: "+ side * side);
    }
    
    
}
class Circle 
{
    static final double PI = Math.PI;
  
    
  
  
    void Area(float r)
    {
        double A = PI * r * r;
  
        System.out.println("The area of the circle is :" + A);
    }
}
class Rectangle 
{
    
    void Area(int l, int b)
    {
        System.out.println("Area of the rectangle: " + l * b);
    }
}
	