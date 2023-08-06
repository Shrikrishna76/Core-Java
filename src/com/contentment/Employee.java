package com.contentment;


class Department {
	private int did;
	private String dname;
	
	public void setDid(int did) {
		this.did = did;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public int getDid() {
		return did;
	}

	public String getDname() {
		return dname;
	}

}

public class Employee {

	private int eid;
	private String ename;
	private Department dept;

	public void setEid(int eid) {
		this.eid = eid;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public void setDept(Department dept) {
		this.dept = dept;
	}

	public int getEid() {
		return eid;
	}

	public String getEname() {
		return ename;
	}

	public Department getDept() {
		return dept;
	}

	public static void main(String[] args) {

		Employee emp = new Employee();
		emp.setEid(101);
		emp.setEname("neha");
		emp.setDept(new Department());

		// Department dt=emp.getDept();
		// dt.setDid(1);
		// dt.setDname("HR");

		emp.getDept().setDid(1);
		emp.getDept().setDname("Hr");

		System.out.println(emp.getEid());
		System.out.println(emp.getEname());
		System.out.println(emp.getDept().getDid());
		System.out.println(emp.getDept().getDname());

	}

}