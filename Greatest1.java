class Greatest{
   public static void main(String ar[]){
            int x=Integer.parseInt(ar[0]);
            int y=Integer.parseInt(ar[1]);
            int z=Integer.parseInt(ar[2]);
            int g=((x>y)&&(x>z))?x:((y>z)?y:z);
        System.out.println("the bigger number is"+g);
     }
  }