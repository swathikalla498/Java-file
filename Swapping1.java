class Swapping{
  public static void main(String x[]){
    int a=Integer.parseInt(x[0]);
    int b=Integer.parseInt(x[1]);
       System.out.println("before swapping");
       System.out.printf("a=%d \t  b=%d \n",a,b);
         int z=a;
             a=b;
             b=z;
       System.out.println("after swapping");
      System.out.printf("a=%d \t  b=%d",a,b);
   }
}