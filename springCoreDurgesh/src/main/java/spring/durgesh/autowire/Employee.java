package spring.durgesh.autowire;

public class Employee {
	int empId;
	Address address;
	public Employee() {
		super();
		// TODO Audto-generated constructor stub
	}
	public Employee(int empId, Address address) {
		super();
		this.empId = empId;
		this.address = address;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", address=" + address + "]";
	}
	
	
	

}
