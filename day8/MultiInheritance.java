package day8;



class Grandpa{
	void GrandpaProp() {
		System.out.println("GrandParent Car");
		
	}
}
class Parent1 extends Grandpa{
	void ParentProp(){
		System.out.println("Parent Car");
	}
}
class Child1 extends Parent1{
	void ChildProp(){
		System.out.println("Child Car");
	}
}

public class MultiInheritance {
	public static void main(String[] args) {
		Child1 ch = new Child1();
		ch.ChildProp();
		ch.ParentProp();
		ch.GrandpaProp();
		
	}

}
