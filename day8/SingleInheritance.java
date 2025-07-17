package day8;

class Parent{
	void ParentProp(){
		System.out.println("Parent Car");
	}
}
class Child extends Parent{
	void ChildProp(){
		System.out.println("Child Car");
	}
}

public class SingleInheritance {
	public static void main(String[] args) {
		Child ch = new Child();
		ch.ChildProp();
		ch.ParentProp();
	}

}
