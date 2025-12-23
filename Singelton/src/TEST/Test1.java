package TEST;

public class Test1 {

//	Singleton singleton = new Singleton(); // by doing this you made multiple object which is not allowed for singleton
//	Singleton singleton1 = new Singleton(); to avoid this made your constructor private in singleton class
	public static void main(String[] args) {
	Singleton singleton1 = Singleton.getobject();
	Singleton singleton2 = Singleton.getobject();
	
	System.out.println(singleton1.hashCode());
	System.out.println(singleton2.hashCode());
	
	
	}
}

class Singleton{
	
	private static Singleton singleton;
	public static Singleton getobject() {
		if(singleton ==null) {
			
			singleton =  new Singleton();
		}
		
		return singleton;
	}
	
	private Singleton() {
		
	}
	
}
