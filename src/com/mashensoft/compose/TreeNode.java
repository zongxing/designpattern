package com.mashensoft.compose;

import java.util.Enumeration;
import java.util.Vector;
public class TreeNode {
	private String name;
	private TreeNode parent;
	private Vector<TreeNode> children = new Vector<TreeNode>();
	public TreeNode(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public TreeNode getParent() {
		return parent;
	}

	public void setParent(TreeNode parent) {
		this.parent = parent;
	}

	public void setChildren(Vector<TreeNode> children) {
		this.children = children;
	}

	public void add(TreeNode treeNode) {
		this.children.add(treeNode);
	}

	public void remove(TreeNode treeNode) {
		this.children.remove(treeNode);
	}

	public void remove(int index) {
		this.children.remove(index);
	}

	public Enumeration<TreeNode> getChildren() {
		return this.children.elements();
	}

}
