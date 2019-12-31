package classes;

public class ClassExample {
	public static void main(String[] args) {
		Object obj = new Friend();
		Object obj2= new Object();
		System.out.println(obj.hashCode());
		System.out.println(obj2.toString());
		
		Friend f = (Friend) obj;
		System.out.println(f.getName());
		f.equals(obj2);
	}
}
