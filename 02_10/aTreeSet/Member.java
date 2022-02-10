package aTreeSet;

public class Member implements Comparable<Member> {
	public String name;
	public int age;
	
	public Member(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
//	public int equals(Member o) {  // 아래는 오름차순 정렬
//		if(this.name.equals(o.getName())) {
//			if(this.age == o.getAge()) {
//				return 1;
//			}
//		}
//		return 0;
//	}
	
	public int equals(Member o) {  // 아래는 오름차순 정렬
		if(this.name.equals(o.getName())) {
			return 1;
		}
		return 0;
	}
	
	public int compareTo(Member o) {
		return (this.name.compareTo(o.getName()));
	}
	
	public String toString() {
		return "이름 : "+name+", 나이 : "+age;
	}
	
	
	
}
