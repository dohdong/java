package b6Class;

public class BRectangle {
	int w;
	int h;
	int area() {
		return w*h;
	}
	
	
	
	//생성자 오버로딩..? 
	BRectangle() { }
	
	BRectangle(int w12, int h12) { // 얘네는 그냥 변수이름임 
		this.w = w12;
		this.h = h12;
	}

}
