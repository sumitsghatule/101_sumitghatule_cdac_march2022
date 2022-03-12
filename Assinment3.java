class Assinment3 // pattern 1
{
    public static void main(String args[]) {
        for (int i=1; i<=5; i++) //rows
         {
            for (int j=1; j<=i;j++) //columns
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
class Pattern2 
{
    public static void main(String args[]) 
	{
    
        for (char i=65; i<=69; i++) //rows
         {
            for (char j=65; j<=i;j++) //columns
            {
                System.out.print(j+ " ");
            }
            System.out.println();
        }
    }
}
class Pattern3 
{
    public static void main(String args[]) 
	{
        for (int i=1; i<=5; i++) //rows
         {
            for (int j=1; j<=i;j++) //columns
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
class Pattern4
 {
    public static void main(String args[]) 
	{
        for (int i=1; i<=5; i++) //rows
         {
            for (int j=1; j<=i;j++) //columns
            {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
class Pattern5 
{
    public static void main(String args[]) 
	{
        for (char i=65; i<=69; i++) //rows
         {
            for (char j=65; j<=i;j++) //columns
            {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
class Pattern6 
{
    public static void main(String args[]) 
	{
        for (int i=1; i<=5; i++) //rows
         {
                for (int j=5; j>=i;j--) {
                    System.out.print(" ");
                }
                for (int k=1;k<=i;k++) {
                    System.out.print("*");
                }
                System.out.println();
        }
    }
}
class Pattern7 
{
    public static void main(String[] args) 
	{
        for (int i = 1; i <= 5; i++) {
            for (int j = 5; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(k + " ");
            }
            System.out.println();
        }
    }
}
class Pattern8 
{
    public static void main(String[] args)
	{

        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }

            for (int k = i; k <= 5; k++) {
                System.out.print(k + " ");
            }
            System.out.println();
        }

    }
}
class Pattern9 
{
    public static void main(String[] args) {
        for (char i = 65; i <= 69; i++) {
            for (char j = 69; j > i; j--) {
                System.out.print(" ");
            }
            for (char k = 65; k <= i; k++) {
                System.out.print(k + " ");
            }
            System.out.println();
        }
    }
}
class Pattern10 
{
    public static void main(String[] args) 
	{
        for (char i = 69; i >= 65; i--) {
            for (char j = 65; j < i; j++) {
                System.out.print(" ");
            }

            for (char k = i; k <= 69; k++) {
                System.out.print(k + " ");
            }
            System.out.println();
        }

    }
}
class Pattern11 {
    public static void main(String[] args) {
        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }

            for (int k = i; k <= 5; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
class Pattern12 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 5; j > i; j--) {
                System.out.print(" ");
            }

            for (int k = 1; k <= i; k++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
class Pattern13 {
    public static void main(String[] args) {
        for (char i = 65; i <= 69; i++) {
            for (char j = 69; j > i; j--) {
                System.out.print(" ");
            }

            for (char k = 65; k <= i; k++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
class Pattern14 {
    public static void main(String args[]) {
        for (int i=5; i>=1; i--) //rows
         {
            for (int j=1; j<=i;j++) //columns
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
class Pattern15 {
    public static void main(String args[]) {
        for (int i=1; i<=5; i++) //rows
         {
            for (int j=5; j>=i;j--) //columns
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
class Pattern16 {
    public static void main(String[] args) {
        for (int i = 5; i >= 1; i--) {
            for (int j = 5; j >= i; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
class Pattern17 {
    public static void main(String[] args) {
        int k = 1;
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(k+ " ");
                k++;
            }
            System.out.println();
        }
    }
}
class Pattern18 {
    public static void main(String args[]) {
        for (char i=69; i>=65; i--) //rows
         {
            for (char j=65; j<=i;j++) //columns
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
class Pattern19 {
    public static void main(String args[]) {
        for (int i=1; i<=5; i++) //rows
         {
            for (int j=1; j<=i;j++) //columns
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
class Pattern20 {
    public static void main(String args[]) {
        for (int i=1; i<=5; i++) //rows
         {
                for (int j=1; j<=5-i;j++) {
                    System.out.print(" ");
                }
                for (int j=1;j<=i;j++) {
                    System.out.print("*");
                }
                System.out.println();
        }
    }
}
class Pattern21 {
    public static void main(String args[]) {
        for (int i=5; i>=1; i--) //rows
         {
            for (int j=1; j<=i;j++) //columns
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
public class Pattern22 
{
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {

            for (int j = 1; j <= 5; j++) {

                if (j < i) {
                    System.out.print(" ");
                } else
                    System.out.print("*");
            }
            System.out.println();
        }
    }
}
public class Pattern23 
{
    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {
            for (int j = 5; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            for (int l = i - 1; l >= 1; l--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
class Pattern24 
{
    public static void main(String[] args)
   {
    int n=5;
      for (int i=1; i <= 5; i++) {
         for(int j=1; j < 2*n; j++)
         if(j < i)
         System.out.print(" ");
         else if(j <= 2*n-i)
         System.out.print("*");
         System.out.println();
      }
   }
}
class Pattern25 
{
    public static void main(String args[]) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 5; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 4; i >= 1; i--) {
            for (int j = 5; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
class Pattern26 
{
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
class Pattern27 
{
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = i; j < 5; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 1; i <= 4; i++) {
            System.out.print(" ");
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = i; k <= 4; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
public class Pattern28
 {
    public static void main(String args[]) {
        for (int i = 1; i <= 5; i++) {
            for (int k = 5; k >= i; k--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 5; j++) {
                System.out.print("*");

            }

            System.out.println();
        }
    }
}
public class Pattern29 {
    public static void main(String args[]) {
        for (int i = 1; i <= 5; i++) {
            for (int k = 1; k <= i; k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 5; j++) {
                System.out.print("*");

            }

            System.out.println();
        }
    }
}
public class Pattern30 {
    public static void main(String args[]) {
        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 2; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
public class Pattern31 {
    public static void main(String args[]) {
        for (int i = 1; i <= 5; i++) {

            for (int j = 1; j <= 5; j++) {

                if (j < i) {
                    System.out.print(" ");
                } else
                    System.out.print("*");
            }
            System.out.println();
        }
        for (int i=2; i<=5; i++) //rows
        {
               for (int j=1; j<=5-i;j++) {
                   System.out.print(" ");
               }
               for (int j=1;j<=i;j++) {
                   System.out.print("*");
               }
               System.out.println();
       }
    }
}
public class Pattern32 {
    public static void main(String args[]) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = i; k <= 5; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 4; i >= 1; i--) {
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }

            for (int k = i; k <= 5; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
class Pattern35 {
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {
            for (int j = 9; j > i; j--) {
                System.out.print(" ");
            }

            for (int k = 1; k <= i; k++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
class Pattern36 {
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {
            for (int j = 9; j > i; j--) {
                System.out.print(" ");
            }

            for (int k = 1; k <= i; k++) {
                System.out.print(k + " ");
            }
            System.out.println();
        }
    }
}
class Pattern37 {
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {
            for (int j = 9; j > i; j--) {
                System.out.print(" ");
            }

            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
public class Pattern38 {
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {
            for (int j = i; j <=9; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
public class Pattern39 {
    public static void main(String args[]){
    int count=1;
    int i,j;  
      for(i=9; i>=1; i-- ){
     for(j=1; j<=i*2; j++){
     System.out.print(" ");
     }
     for(j=i; j<=9; j++) { 
             System.out.print(j+" ");
     }    for(j=8; j>=i; j--){
     System.out.print(j+" "); 
     }      System.out.println();
    count++;
     }
     
    }
    }
	public class Pattern40 {
    public static void main(String[] args) {
        for (int i = 0; i <= 9; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= 8 - i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
class Pattern41 {
    public static void main(String args[]) {
        int i, j, k, m, sp = 1, p = 9;
        for (i = 1; i <= 9; i++) {
            for (k = 1; k <= i; k++) {
                System.out.print(" ");
            }
            for (j = i; j <= 9; j++) {
                System.out.print(" " + p);

            }
            p--;

            System.out.println();
        }
    }
}
class Pattern42 {
    public static void main(String args[]) {
        for (int i=1; i<=6; i++) //rows
         {
            for (int j=1; j<=i;j++) //columns
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
public class Pattern43 {
    public static void main(String args[]) {
        for (int i = 6; i >= 1; i--) // rows
        {
            for (int j = 1; j <= i; j++) // columns
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
class Pattern44 {
    public static void main(String args[]) {
        for (int i = 1; i <= 6; i++) {
            for (int j = i; j <= 6; j++) {
                if (i == 1 || j == i || j == 6) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
class Pattern45 {
    public static void main(String[] args) {
        for (int i = 1; i <= 6; i++) {
            for (int j = 6; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
public class Pattern46 {
    public static void main(String args[]) {
        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = i; k <= 6; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
public class Pattern47 {
    public static void main(String args[]) {
        for (int i = 1; i <= 6; i++) {
            for (int j = i; j <= 6; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                if (j == 1 || j == 2 * i - 1 || (i == 6 && j%2 ==1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}