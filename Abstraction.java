public class Abstraction{
	public static void main(String args[]){
		circle s1 = new circle();
		s1.draw();
	}

}

abstract class shape{ //its an abstract class so it cant instantiated
	abstract void draw(); //the abstract method needs to overridden in the derives class
	void size(){
		System.out.println("hello");
	}
}

class circle extends shape{
	public void draw(){
		System.out.println("the shape is circle");
	}
}