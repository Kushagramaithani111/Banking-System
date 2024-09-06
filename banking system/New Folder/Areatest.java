class Area
{
double r,l,b,a,p,c;
public Area(double e)
{
r=e;
}
public Area(double f,double g)
{
l=f;
b=g;
}
public Area(double h,double i,double j)
{
a=h;
p=i;
c=j;
}
public void show1()
{
System.out.println("Radius="+r);
}
public void show2()
{
System.out.println("length="+l);
System.out.println("breadth="+b);
}
public void show3()
{
System.out.println("a="+a);
System.out.println("p="+p);
System.out.println("c="+c);
}
public double cal1()
{
double z;
z=3.14*r*r;
return(z);
}
public double cal2()
{
double t;
t=l*b;
return(t);
}
public double cal3()
{
double q,s;
s=(a+p+c)/2;
q=Math.sqrt(s*(s-a)*(s-p)*(s-c));
return(q);
}
}


class Areatest
{
public static void main(String args[])
{
Area obj1=new Area(5);
Area obj2=new Area(8,7);
Area obj3=new Area(6,9,12);
System.out.println("first calculations");
obj1.show1();
System.out.println("Area of circles="+obj1.cal1());
System.out.println("Second calculation");
obj2.show2();
System.out.println("Area of rectangle="+obj2.cal2());
System.out.println("Third calculation");
obj3.show3();
System.out.println("Area of triangle="+obj3.cal3());
}
}

