package q05;



interface Remote{
	   int VOLUME = 100;
   }
   class AbstractClassAndInterface implements Remote{
	   public static void main(String... args){
		int VOLUME=0;//CE:: cannot assign a value to final variable VOLUME
		System.out.println("value of volume is ::"+VOLUME);
		System.out.println("value of volume is ::"+Remote.VOLUME);
		AbstractClassAndInterface abs = new AbstractClassAndInterface();
		System.out.println(abs.VOLUME);
        }
   }