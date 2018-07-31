
public class Father {
	private int b;
	public static int beat(){
		System.out.println("beat");
		return 1;
	}
	class demo2{
		public void eat2(){
			beat();
			System.out.println(Father.this.b);
		}
	}
	private int a = beat();
	public static void main(String[] args) {
		Father f = new Father();
		//f  = new Child();
		//f = new Father();
		System.out.println(f instanceof Child);
		Father cen = new Father(){
			
		};
	}
}
class Child extends Father{
	interface B{
		
	}
}
interface A{
	
}