package Quiz_Answers;

import java.util.Random;
public class Rectangle_Test {
public static void main(String[] args)
{
// ..creating two object
System.out.println("Two object is creating...");
Random r=new Random();
Rectangle r1=new Rectangle(-1, 2);
Rectangle r2=new Rectangle(3, 2);
// print the properties of the rectangle objects..
System.out.println(r1);
System.out.println(r2);
System.out.println( "******");
// update the sides of rectangles according to given parameters
r2.setLength(r2.getLenght()*2);
r2.setWidth(r2.getWidth()*2);
r1.setLength(r1.getLenght()*14);
r1.setWidth(r1.getWidth()*14);
// print the characteristics features for the rectangles...
System.out.println(r1);
System.out.println(r2);
// Check that two objects are not equal.
if(r1.equals(r2)!=true)
{
System.out.println("Two objecs are not equal So three object are creating...");
Rectangle object1=new Rectangle(1+(r.nextInt(5)),(1+r.nextInt(5)));
Rectangle object2=new Rectangle(1+(r.nextInt(5)),(1+r.nextInt(5)));
Rectangle object3=new Rectangle(1+(r.nextInt(5)),(1+r.nextInt(5)));
System.out.println("New objects properties are");
System.out.println(object1+"\n"+object2+"\n"+object3);
}}}