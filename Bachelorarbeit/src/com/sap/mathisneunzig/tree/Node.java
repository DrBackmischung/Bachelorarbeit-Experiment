package com.sap.mathisneunzig.tree;

import java.util.ArrayList;
import java.util.Objects;

public class Node {
	
	public String id;
	public Content content;
	public String parentId;
	public ArrayList<String> children;
	
	public Node(String id, Content content, String parentId) {
		
		this.id = id;
		this.content = content;
		this.parentId = parentId;
		this.children = new ArrayList<String>();
			
	}


	public Node(String id, Content content, ArrayList<String> children) {
		
		this.id = id;
		this.content = content;
		this.parentId = "";
		this.children = children;
		
	}

	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public Content getContent() {
		return content;
	}


	public void setContent(Content content) {
		this.content = content;
	}


	public String getParentId() {
		return parentId;
	}


	public void setParentId(String parentId) {
		this.parentId = parentId;
	}


	public ArrayList<String> getChildren() {
		return children;
	}


	public void setChildren(ArrayList<String> children) {
		this.children = children;
	}


	@Override
	public String toString() {
		return "Node [id=" + id + ", content=" + content + ", parentId=" + parentId + ", children=" + children + "]";
	}


	@Override
	public int hashCode() {
		return Objects.hash(children, content, id, parentId);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Node other = (Node) obj;
		return Objects.equals(children, other.children) && Objects.equals(content, other.content)
				&& Objects.equals(id, other.id) && Objects.equals(parentId, other.parentId);
	}
	
}
