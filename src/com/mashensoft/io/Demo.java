package com.mashensoft.io;

import java.text.NumberFormat;

import javax.xml.parsers.DocumentBuilderFactory;

import com.mashensoft.adapter.Demo1;
import com.mashensoft.adapter.Interface1;

public class Demo {
	public static void main(String[] args) {
		System.out.println(Interface1.username);
		// Interface1.username="bbb";
		class InterfaceImpl1 implements Interface1 {
			@Override
			public String getName() {
				// TODO Auto-generated method stub
				return "实现类中实现此方法，会覆盖默认值";
			}
		}
		InterfaceImpl1 ii1 = new InterfaceImpl1();
		System.out.println(ii1.getName());
		//
		// Runtime runtime1 = Runtime.getRuntime();
		// Runtime runtime2 = Runtime.getRuntime();
		// System.out.println(runtime1 == runtime2);
		// NumberFormat numberFormat = NumberFormat.getNumberInstance();
		// DocumentBuilderFactory df1 = DocumentBuilderFactory.newInstance();
		// DocumentBuilderFactory df2 = DocumentBuilderFactory.newInstance();
		// System.out.println(df1 == df2);
	}
}
