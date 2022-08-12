package Quiz_Answers;

public class Rectangle {
private int length; private int width;

public Rectangle(int length, int width)
{
setLength(length);
setWidth(width);
}

public void setLength(int lenght)
{
this.length=lenght<0?3:lenght;
}

public void setWidth(int width)
{ this.width=width<0?3:width;
}

public int getLenght()
{
return length;
}

public int getWidth()
{ return width;
}

public int getArea()
{
return getLenght()*getWidth();
}

public int[] getArea(Rectangle r, int[] areas)//niye []?
{
areas[0]=this.getArea() ;
areas[1]=r.getArea();
return areas;}

public int getPerimeter()
{
System.out.println("Rectangle Perimeter:%d"+2*(getWidth()+getLenght()));
return 2*(getLenght()+getWidth());
}

public int[] getPerimeter(Rectangle r, int[] perimeters)
{
perimeters[0]=r.getPerimeter();
perimeters[1]=this.getPerimeter();
return perimeters;
}

public boolean isequal(Rectangle r)
{
boolean isequal=false;
if(this.getArea()==r.getArea()&& this.getPerimeter()==r.getPerimeter())
{
System.out.println("They are equals...");
isequal=true;
}
else
System.out.println("They are not equals...");
return isequal;
}

@Override
public String toString()
{
return String.format("Height:%d\nWidth:%d\n",getLenght(),getWidth() );
}
}