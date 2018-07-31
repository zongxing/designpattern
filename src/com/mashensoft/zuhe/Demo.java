package com.mashensoft.zuhe;

public class Demo {
	//在类的内部，与属性和方法同级
	class Demo1{
		
	}
	public void test1(){
		//在一个方法的内部
		class Demo2{
			
		}
	}
	public static void main(String[] args) {
		//在一个代码段的内部
		{
			class Demo3{
				
			}
		}
	}
	public Demo(){
		//在一个构造方法的内部
		class Demo4{
			
		}
	}
}
