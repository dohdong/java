package cCollection;

public class Member {
	
	public String name;
	public int age;
	
	public Member(String name, int age) {
		this.name = name;
		this.age = age;
	}


	@Override  //같은걸 찾는 메소드
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			Member member = (Member) obj;
			return member.name.equals(name) && (member.age == age);
			
		}else {
			return false;
		}
	}
	
	@Override
	public int hashCode() {
		return name.hashCode()+age;
		
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
}
