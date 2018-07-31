package com.mashensoft.adapter;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JButton;
public class JFrameDemo {
	static int eye;
	public void test3(){
		eye=2;
	}
	public static void test1() {
		JButton button = new JButton("点我");
		button.addMouseListener(new MouseListener() {
			@Override
			public void mouseReleased(MouseEvent e) {
			}
			@Override
			public void mousePressed(MouseEvent e) {
			}
			@Override
			public void mouseExited(MouseEvent e) {
			}
			@Override
			public void mouseEntered(MouseEvent e) {
			}
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
	}
	public static void test2() {
		JButton button = new JButton("点我");
		button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println("我被点击了!");
			}
		});
	}
	public static void main(String[] args) {
		
	}
}
