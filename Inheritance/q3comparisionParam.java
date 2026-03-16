package Gfg.Inheritance;
class parent{
	public parent() {
		System.out.println("Non parameterized of parent");
	}
	public parent(int x) {
		System.out.println("Parameterized constructor of parent : " + x);
	}
}
class child extends parent{
	public child() {
		System.out.println("Non-param const of child");
	}
	public child(int y) {
		System.out.println("Param const of child");
	}
	public child(int x,int y) {
		super(x);
		System.out.println("2-param const of child : " + y);
	}
}
public class q3comparisionParam {
	public static void main(String[] args) {
		child c1 = new child();
		System.out.println("1st call done");
		child c2 = new child(10);
		System.out.println("Second call done");
		child c3 = new child (10,20);
		System.out.println("Third call done");
	}
}