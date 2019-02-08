public class MemoryAlloc{
	public static void main(String args[]){
		a a1=new a(1, "mrinal");
		System.out.println("the address of the object  the stack "+a1);
	}
}

class a{

	public int a=10;
	public String nm="";
	public a(int aV, String n){
		this.a=aV;
		this.nm=n;
	}

	public void print(){
		System.out.println(a);
		System.out.println(nm);

	}

}