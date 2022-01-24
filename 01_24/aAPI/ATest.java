package aAPI;

class Student implements Cloneable{
	private String sno;
	private String name;
	public Student(String sno, String name) {
		this.sno = sno;
		this.name = name;
	}
	
	// equals 메서드를 오버라이드 해서 주소값은 다르지만 내용이 같을때 서로 같음을 확인 할 수 있다.
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student s = (Student)obj;
			if(this.name.equals(s.name)&&this.sno.equals(s.sno)) {
				return true;
			}
		}
		return false;
		
		
	}

	@Override
	public String toString() {   // 이걸 하면 Student [sno=a01, name=Kim] 이렇게 출력이 됨.
		 						 // 안하면 그냥 aAPI.Student@5e91993f 이렇게 나옴.
		
		return "Student [sno=" + sno + ", name=" + name + "]"; 
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		
		return (Student)super.clone();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	

	
	
	
}



public class ATest {
	public static void main(String[] args) {
		Student s1 = new Student("a01", "Kim");
		Student s2 = new Student("a01", "Kim");
		System.out.println(s1 == s2);
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s1.toString());
		System.out.println(s2.equals(s1));
		
		System.out.println(" ");
		Student s3 = null;
		try{
			s3 = (Student)(s1.clone());
		}catch(CloneNotSupportedException e) {
			
		}
		System.out.println(s1.hashCode());
		System.out.println(s3.hashCode());  // 서로 다른 주소값이 나옴. = 깊은 복사.
		
		System.out.println(" ");
		s1.setName("park");
		System.out.println(s1.getName());
		System.out.println(s3.getName());  // 서로 다른 값이 나옴. = 깊은 복사.
				
		
		
		
	}

}
