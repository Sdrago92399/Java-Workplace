 import java.util.Scanner;
class PrimeChecker{  
  public static void main(String args[]){ 
    System.out.println("pst~~ Try 2147483647");
    for(int j = 0; j<10;j--){
    System.out.print("Enter a natural number :");
    Scanner scan = new Scanner(System.in);
    long n = scan.nextInt();
    double start = System.currentTimeMillis();
    for(int i = 2; i<n;i++)
    {if (n % i == 0){System.out.println("Not a prime");
    break;}
    else if(n-i==1){System.out.println("It is a prime");
    break;}
     }
double elapsed = (System.currentTimeMillis() - start)/1000;
  System.out.println("It took "+ elapsed + " seconds to run this program");}  
}
}  
