class Q2
 {
  public static void main(String args [])
  {
   int i,j,k;
   i=74;
   j=36;
   k=i+j;
   System.out.println("Addition of number ="+k);
   
  }
 }

class Q4t1
{
	public static void main(String args[])
	{ 
	 int i,j,k,r ;
	 i=-5;
	 j=8;
	 k=6;
	 r=-5+8*6;
	 System.out.println(r);
	 
    }
}
class Q4t2
{ 
  public static void main(String args[])
	{ 
	  int i,j,k;
	  i=55;
	  j=9;
	  k=(55+90)%9;
	  System.out.println(k);
	}
	
}
class Q4t3
 {
	 public static void main(String args[])
	{ 
	 int i,j,k,r,y;
	 i=20;
	 j=-3;
	 k=5;
	 r=8;
	 y=i + j*k / r ;
	 System.out.println(y);
	}
 }
class Q4t4
{
	public static void main(String args[])
	{ 
	 int i,j,k,m,l,r;
	 i=5;
	 j=15;
	 k=3;
	 l=2;
	 m=8;
	 r= i + j/ k*l - m%k;
	System.out.println(r);
	 
	}
class Q5
{
	public static void main(String args[])
	{ 
	 int i,j,k;
	 i=25;
	 j=5;
	 k=i*j;
	 System.out.println("multiplication of number 25*5='"+k);
     }
}
}
class Q6t1
{
	public static void main(String args[])
	{ 
	 int i,j,r;
	 i=125;
	 j=24;
	 r=i+j;
	 System.out.println(r);
	 
    }
}
class Q6t2
{ 
  public static void main(String args[])
	{ 
	  int i,j,r;
	  i=125;
	  j=24;
	  r=i-j;
	  System.out.println(r);
	}
	
}
 class Q6t3
 {
	 public static void main(String args[])
	{ 
	 int i,j,r;
	 i=125;
	 j=24;
	 r=i*j;
	 System.out.println(r);
	}
 }
class Q6t4
{
	public static void main(String args[])
	{ 
	 int i,j,r;
	 i=125;
	 j=24;
	 r= i/j;
	System.out.println(r);
	 
	}
}
class Q6t5
{
	public static void main(String args[])
	{ 
	 int i,j,r;
	 i=125;
	 j=24;
	 r= i%j;
	System.out.println(r);
	 
	}
}
import java.util.Scanner;
class Q7
{
 public static void main(String args[])
 { 
 Scanner sc = new Scanner(System.in);
 System.out.println(" Enter number :");
 int a= sc.nextInt();
 
 int v=1;
 int b=a*v;
 int c=a*++v;
 int d=a*++v;
 int e=a*++v;
 int f=a*++v;
 int g=a*++v;
 int h=a*++v;
 int i=a*++v;
 int j=a*++v;
 int k=a*++v;
 
 System.out.println(b);
 System.out.println(c);
 System.out.println(d);
 System.out.println(e);
 System.out.println(f);
 System.out.println(g);
 System.out.println(h);
 System.out.println(i);
 System.out.println(j);
 System.out.println(k);
 }
}
class Q9
{ 
 public static void main(String Args[])
 { 
  double r = 4.0*((1-(1.0/3))+(1.0/5)-(1.0/7)+(1.0/9)-(1.0/11));
  System.out.println(r);
 }
}
class Q11
 {
  public static void main (String args [])
  {
   double radius= 7.5;
   double pi=22.0/7.0;
   double p,a;
   p=2*pi*radius;
   a=pi*radius*radius;
   System.out.println(p);
   System.out.println(a);
  }
 }
import java.util.Scanner;
class Q12
 {
  public static void main (String args [])
  {
   Scanner sc = new Scanner(System.in);
   System.out.println("number1:-");
   int n1 = sc.nextInt();
   
   System.out.println("number2");
   int n2 = sc.nextInt();
   
   System.out.println("number3");
   int n3 = sc.nextInt();
   
   int r = (n1 + n2 + n3) / 3 ;
   System.out.println("Average of given number is ="+r);
  }
 }
import java.util.Scanner;
class Q13
{ 
 public static void main(String Args[])
 { 
 Scanner sc = new Scanner(System.in);
 System.out.println("enter Width room");
 double w= sc.nextDouble();

 System.out.println("enter Breadth room");
 double b= sc.nextDouble(); 
 
 double a = w*b;
 System.out.println("area of room is "+a); 
 
 double p = 2*(w+b);
 System.out.println(" perimeter of room is "+p);
 }
}
   