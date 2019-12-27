package classes;


class Singleton{
	private static Singleton singleton = new Singleton();
	
	private Singleton() {
	}
	
	static Singleton getInstance() {
		return singleton;
	}
}

public class SingletonExample {
	public static void main(String[] args) {
		Singleton singleton = Singleton.getInstance();
		Singleton singleton2 = Singleton.getInstance();
		
		if(singleton == singleton2) {
			System.out.println("same");
		}else {
			System.out.println("not same");
		}
	}
}
