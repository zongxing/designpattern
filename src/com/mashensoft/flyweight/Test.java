package com.mashensoft.flyweight;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

public class Test {
	public static void test1(){
		ConnectionPool pool = ConnectionPool.getConnectionPool();
		System.out.println("使用前池的大小："+pool.getPoolSize());
		Connection conn = pool.getConnection();
		pool.getPoolSize();
		System.out.println("使用中池的大小："+pool.getPoolSize());
		pool.releaseConnection(conn);
		System.out.println("归还后池的大小："+pool.getPoolSize());
	}
	public static void test2(){
		ThreadPool pool = ThreadPool.getThreadPool();
		for(int i=0;i<30;i++){
			List<String> list = new ArrayList();
			for(int j=0;j<3;j++){
				list.add(i+","+j);
			}
			ThreadDemo thread = pool.getThread();
			
			while(thread==null){
				try {
					Thread.sleep(300);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				thread = pool.getThread();
			}
			thread.setList(list);
			thread.setThreadDemo(thread);
			thread.sign = true;
			thread.notify();
			
		}
	}
	public static void main(String[] args) {
	test2();
		
	}
}
