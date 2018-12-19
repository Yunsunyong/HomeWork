package ncs.test8;

public class User {
	private String id;
	private String password;
	private String name;
	private int age;
	private char gender;
	private String phone;
	
	public User() {}

	public User(String id, String password, String name, int age, char gender, String phone) {
		this.id = id;
		this.password = password;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.phone = phone;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getId() {
		return id;
	}

	public String getPassword() {
		return password;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public char getGender() {
		return gender;
	}
	
	public String getPhone() {
		return phone;
	}
	@Override
	public String toString() {
		return this.id + " " + this.password + " " + this.name + " " + this.age + " " + this.gender + " " + this.phone;
	}
	
	@Override
	public boolean equals(Object obj) {
		
		User u = (User)obj;
		
		
		return this.id.equals(u.id) && this.password.equals(u.password) && this.name.equals(u.name) && 
				this.age == u.age && this.gender == u.gender && this.phone.equals(u.phone);
	}
	
	@Override
	public Object clone() {
		return new User(this.id,this.password,this.name,this.age,this.gender,this.phone);
	}
	
	
}
