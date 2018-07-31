
public class Demo {
	public static class Test{
		static{
			System.out.println("加载静态内部类的静态方法");
		}
		public static void test1(){
			System.out.println("test1");
		}
	}
	public static void main(String[] args) {
		Demo.Test.test1();;
		Integer i = -128;
		Integer a = -128;
		System.out.println(i==a);
		System.out.println(i.equals(a));
		System.out.println(System.getProperty("java.lang.Integer.IntegerCache.high"));
		
		
		Byte b = -1;
		Byte c = -1;
		System.out.println(b==c);
		Float d = 1.0f;
		Float e = 1.0f;
		System.out.println(e==d);
		Double f = 1.0;
		Double g = 1.0;
		System.out.println(g==f);
		int a1 = 2;
		int a2 = 0x2;
		int a3 = 010;
		Integer a4 = a3;
		System.out.println(a4.intValue());
		byte b1 = 010;
		Byte b2 = b1;
		System.out.println(b2.byteValue());
	}

}
