class Mirror
{
   int x = 2;
   int y = x;

   {
      System.out.println("x = " + x);
      System.out.println("y = " + y);
   }

   public static void main(String[] args)
   {
      Mirror mirror = new Mirror();
   }
}