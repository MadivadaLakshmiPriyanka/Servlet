package com.day1;

public class Employee 
{
	
		private String empName;
		private String empPassword;
		public Employee(String empName, String empPassword) {
			super();
			this.empName = empName;
			this.empPassword = empPassword;
		}
		public String getEmpName() {
			return empName;
		}
		public void setEmpName(String empName) {
			this.empName = empName;
		}
		public String getEmpPassword() {
			return empPassword;
		}
		public void setEmpPassword(String empPassword) {
			this.empPassword = empPassword;
		}
		

	

}
