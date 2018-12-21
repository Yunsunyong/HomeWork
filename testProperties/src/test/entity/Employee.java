package test.entity;

public class Employee {
	private int eld;   //사번
	private String eName;   //이름
	private String dept;     //소속부서
	private int salary;     //연봉
	private double bonusPoint;   //보너스 포인트
	 
	public Employee() {}

	public Employee(int eld, String eName, String dept, int salary, double bonusPoint) {
		this.eld = eld;
		this.eName = eName;
		this.dept = dept;
		this.salary = salary;
		this.bonusPoint = bonusPoint;
	}

	public int getEld() {
		return eld;
	}

	public void setEld(int eld) {
		this.eld = eld;
	}

	public String geteName() {
		return eName;
	}

	public void seteName(String eName) {
		this.eName = eName;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public double getBonusPoint() {
		return bonusPoint;
	}

	public void setBonusPoint(double bonusPoint) {
		this.bonusPoint = bonusPoint;
	}
	
	@Override
	public String toString() {
		return eName + " " + dept + " " + salary + " " +bonusPoint +" ";
	}
	
	
	
}
