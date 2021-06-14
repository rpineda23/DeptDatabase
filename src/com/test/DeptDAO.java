package com.test;

public interface DeptDAO {
	public void getAllDept();  
	public int updateDeptNo(int deptno);
	public int deleteDeptNo(int deptno);
	public void addDept(Dept dept);
}
