//WAP to read n and print its factorial 
class calfact 
{
  public static void main (string args[])
 {
  int i,n, fact=1;
  // read n
  Scanner sc = new Scanner(System.in);
  System.out.print("\n enter n:");
  n = sc.nextInt();
  for(i=1;i<=n;i++)
  {
       fact=fact*i;
  }
  system.out.print("\n factorial = "+ fact);
  }
}