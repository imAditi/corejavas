package com.yash.java;

public class Member {

		private String firstName;
		private String lastName;
		private String email;
		private String password;
		private String role;
		
		public String getfirstName() {
			return firstName;
		}
		public void setfirstName(String firstName) {
			this.firstName = firstName;
		}
		public String getlastName() {
			return lastName;
		}
		public void setlastName(String lastName) {
			this.lastName = lastName;
		}
		public String getemail() {
			return email;
		}
		public void setemail(String email) {
			this.email = email;
		}
		public String getpassword() {
			return password;
		}
		public void setpassword(String password) {
			this.password = password;
		}
		public String getrole() {
			return role;
		}
		public void setrole(String role) {
			this.role = role;
		}
		
		public String showMemberDetail() {
			return "{name : Aditi Jain, email : aditi.jain@yash.com, password : 12345, role : Trainee}";
		}
}
