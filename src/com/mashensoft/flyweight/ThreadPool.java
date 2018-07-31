package com.mashensoft.flyweight;

import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class ThreadPool {
	private static ThreadPool threadPool;

	public static synchronized ThreadPool getThreadPool() {
		if (threadPool == null) {
			threadPool = new ThreadPool();
		}
		return threadPool;
	}

	private Vector<ThreadDemo> pool = null;
	private int poolSize = 5;

	public ThreadPool() {
		pool = new Vector<>();
		for (int i = 0; i < poolSize; i++) {
			ThreadDemo t = new ThreadDemo();
			pool.add(t);
		}
	}

	public synchronized ThreadDemo getThread() {
		ThreadDemo thread = null;
		if (pool.size() > 0) {
			thread = pool.get(0);
			pool.remove(0);
		}
		thread.start();
		return thread;
	}

	public synchronized void releaseThread(ThreadDemo thread) {
		pool.add(thread);
	}
}

class ThreadDemo extends Thread {
	boolean sign = true;
	List<String> list;

	public List<String> getList() {
		return list;
	}

	public void setList(List<String> list) {
		this.list = list;
	}

	ThreadDemo threadDemo;

	public ThreadDemo getThreadDemo() {
		return threadDemo;
	}

	public void setThreadDemo(ThreadDemo threadDemo) {
		this.threadDemo = threadDemo;
	}

	@Override
	public void run() {
		while(sign){
			if(list!=null){
				for (Iterator iterator = list.iterator(); iterator.hasNext();) {
					String string = (String) iterator.next();
					System.out.println(getName() + "," + string);
				}
				list = null;
				sign = false;
				ThreadPool.getThreadPool().releaseThread(this);
				try {
					Thread.currentThread().wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}

}