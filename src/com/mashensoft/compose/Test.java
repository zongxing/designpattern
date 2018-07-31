package com.mashensoft.compose;
import java.util.Enumeration;
public class Test {
	public static void main(String[] args) {
		TreeNode root = new TreeNode("root");
		root.add(new TreeNode("菜单一"));
		root.add(new TreeNode("菜单二"));
		Tree tree = new Tree(root);
		Enumeration<TreeNode> e = tree.getRoot().getChildren();
		while(e.hasMoreElements()){
			System.out.println(e.nextElement().getName());
		}
	}
}
