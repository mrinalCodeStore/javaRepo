public class InheritAndPoly{
	public static void main(String args[]){
		circle c1 = new circle();
		c1.draw();

		shape s1= new circle(); //polymorphic Statement 
		s1.draw();
	}
}
class shape{
	public void draw(){
		System.out.println("this is a shape");
	}
}

class circle extends shape{ //single inheritance and multiple inheritance is not possibl
	public void draw(){
		System.out.println("this is a circle");
	}
}