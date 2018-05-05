package ejercicios2;

class Rectangle
{
    int length;
    int width;

  Rectangle(int length, int width)
{
    this.length= length;
    this.width= width;

}

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

int getArea()
{
    int Area= length*width;
    return Area;
}
int getPerimeter()
{
    int Perimeter= (length+width)*2;
    return Perimeter;
}
}

public class Ejercicios2 {

    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(10, 20);
        Rectangle r2 = new Rectangle(100, 200);

        System.out.print("get: ");
        if(r1.getLength() == 10 && r1.getWidth() == 20
                && r2.getLength() == 100 && r2.getWidth() == 200)
        {
            System.out.println("pass");
        }else
        {
            System.out.println("fail");
        }

        System.out.print("set: ");
        r1.setLength(2);
        r1.setWidth(3);
        r2.setLength(20);
        r2.setWidth(30);
        if(r1.getLength() == 2 && r1.getWidth() == 3
                && r2.getLength() == 20 && r2.getWidth() == 30)
        {
            System.out.println("pass");
        }else
        {
            System.out.println("fail");
        }

        System.out.print("area: ");
        if(r1.getArea() == 6 && r2.getArea() == 600)
        {
            System.out.println("pass");
        }else
        {
            System.out.println("fail");
        }

        System.out.print("perimeter: ");
        if(r1.getPerimeter() == 10 && r2.getPerimeter() == 100)
        {
            System.out.println("pass");
        }else
        {
            System.out.println("fail");
        }
    }

}