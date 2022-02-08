package eInherit;

public class MethodOverridingEx {
	
	
	public static void main(String[] args) {
		Line line = new Line();
		paint(line);
		
		paint(new Shape());
		paint(new Line());
		paint(new Rect());
		paint(new Circle());
		
	}
	
	static void paint(Shape p) {
		p.draw();
	}
	
	/*
	static void paint(Line p) {
		p.draw();
	}
	
	static void paint(Rect p) {
		p.draw();
	}
	
	static void paint(Circle p) {
		p.draw();
	}
	*/
	
}
