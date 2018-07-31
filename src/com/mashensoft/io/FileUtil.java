package com.mashensoft.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.Reader;
import java.io.Writer;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class FileUtil {
	/**
	 * 功能：读取一个文件，把文件的文本内容返回出来
	 * @param filePath 文件路径，绝对路径
	 * @return 文件内容
	 */
	public static String readFile(String filePath){
		String content = "";
		try {
			FileInputStream is = new FileInputStream(filePath);
			int len = 0;
			byte[] arr = new byte[20000];
			while((len=is.read(arr))!=-1){
				String str = new String(arr,0,len);
				content+=str;
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return content;
	}
	
	public static String readFile2(String filePath){
		String content = "";
		InputStream is;
		try {
			is = new FileInputStream(filePath);
			Scanner s = new Scanner(is);
			while(s.hasNextLine()){
				content+=s.nextLine()+"\r\n";
			}
			s.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return content;
	}
	public static String readFile3(String filePath){
		String content = "";
		InputStream is;
		try {
			is = new FileInputStream(filePath);
			Reader reader = new InputStreamReader(is);
			while(reader.ready()){
				int temp = reader.read();
				char c = (char)temp;
				content+=c;
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return content;
	}
	/**
	 * 输入流,
	 * 1：键盘输入内容
	 * 2：文件输入
	 * 3：网络输入
	 * @param args
	 */
	public static void test1() {
		InputStream is = System.in;
		int i=0;
		try {
			while((i=is.read())!=-1){
				char c = (char)i;
				System.out.println(c);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void test2() {
		String content = "";
		try {
			URL url = new URL("https://www.baidu.com");
			InputStream is = url.openStream();
			Scanner s = new Scanner(is);
			while(s.hasNextLine()){
				String str = s.nextLine();
				content+=str;
				//System.out.println(str+"\r\n");
			}
			s.close();
			is.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			Writer writer = new PrintWriter("baidu.html");
			writer.write(content);
			writer.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	public static void main(String[] args) {
//		String filePath = "/Users/zongxing/Documents/workspace15/io/src/com/mashensoft/io/FileUtil.java";
//		String content = readFile3(filePath);
//		System.out.println(content);
		test2();
	}

}
