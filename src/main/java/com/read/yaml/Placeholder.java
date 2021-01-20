package com.read.yaml;

import java.util.List;

public class Placeholder {
	List<ChildYaml> child;
	
	public List<ChildYaml> getChild(){
		return child;
	}
	public void setChild(List<ChildYaml> child) {
		this.child=child;
	}
	public String toString() {
		return "Placeholder [child=" +child+"]";
	}
}
