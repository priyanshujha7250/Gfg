package Gfg.Inheritance;
class parent1{
	public parent1() {
		System.out.println("Parent class");
	}
}
class child1 extends parent1{
	public child1() {
		System.out.println("Child class");
	}
}
class grandChild extends child1{
	public grandChild() {
		System.out.println("GrandChild class");
	}
}
public class q2const {
	public static void main(String[] args) {
		grandChild g = new grandChild();
	}
}
