package com.aurionpro.model;
import java.util.ArrayList;
import java.util.List;

public class Employees implements Cloneable {


	private List<String> empList;
	

	public Employees(List<String> list){
		this.empList=list;
	}

	public List<String> getEmpList() {
		return empList;
	}

	@Override
	public Object clone() throws CloneNotSupportedException{
			List<String> temp = new ArrayList<String>();
			for(String s : this.getEmpList()){
				temp.add(s);
			}
			return new Employees(temp);
	}
	
}