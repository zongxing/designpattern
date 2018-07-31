import static org.junit.Assert.*;

import java.io.UnsupportedEncodingException;

import org.junit.Test;

public class DemoTest {

	@Test
	public void test() {
		System.out.println(new StringBuffer().append(new Object()));
	}

	@Test
	public void test1() {
		System.out.println(new Object());
	}

	@Test
	public void test2() {
		class Person {
			@Override
			public String toString() {

				return String.valueOf(this.hashCode());
			}
		}
		System.out.println(new Person());
	}

	@Test
	public void test3() {
		class DemoTest2 extends Thread {
			ThreadLocal<Integer> t = new ThreadLocal<>();
			
			@Override
			public void run() {
				int a = 10;
				t.set(a);
				for (int i = 0; i < a; i++) {
					t.set(i);
					System.out.println(getName() + "," + t.get());
				}
			}

		}
		;
		for (int i = 0; i < 3; i++) {
			DemoTest2 dt = new DemoTest2();
			dt.t.set(0);
			dt.start();
		}
	}
	@Test
	public void test4() {
		try {
			System.out.println("阿星".getBytes("UTF-8").length);
			System.out.println("阿星".getBytes("GBK").length);
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
	}
	@Test
	public void test5() {
		char a='A',b='a';
		int c = b-a;
		System.out.println(c);
	}
	@Test
	public void test6() {
		for(int i=-128;i<128;i++){
			System.out.println(i+","+(char)i);
		}
	}
	@Test
	public void test7() {
		String str = "abcaefg";
		System.out.println(str.indexOf('a', 2));
		System.out.println(str.substring(str.indexOf('a', 2)));;
	}
	@Test
	public void test8() {
		int i=0;
		Object o1 = new Object();
		Object o2 = null;
		System.out.println(o2=o1);
	}
	@Test
	public void test9() {
		
		Object o1 = new Object();
		String o2 = null;
		//System.out.println(o2=(1==1));
	}

}
