package gHomework;

public class Student {
	
	public String name;
	public int tel;
	
	public Student(String name, int tel) {
		this.name = name;
		this.tel = tel;
	}
	
	

	public String getName() {
		return name;
	}
	
	public int getTel() {
		return tel;
	}
	
	
	
	@Override  //같은걸 찾는 메소드
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student student = (Student) obj;
			return student.name.equals(name) && (student.tel == tel);
			
		}else {
			return false;
		}
	}
	
	@Override
	public int hashCode() {
		return name.hashCode()+tel;
		
	}
	
	
}
