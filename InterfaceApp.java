public class InterfaceApp{
	public static void main(String args[]){
		circle s = new circle();
		s.draw();
	}
}

interface shape{
	void draw();
} 

class circle implements shape{
	public void draw(){
		System.out.println("this from circle");
	}
}