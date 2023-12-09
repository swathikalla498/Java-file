public class Is {
	int a=10;
}
   class B extends Is{
		int b=10;
		Is obj=new Is();
		B ob=new B();
		if(obj=ob) {
			System.out.println("its equal");
		}else {
			System.out.println("its not equal");
		}
		public static void main(String args[]) {
		ob.B();
			
		}
}
