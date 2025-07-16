package day7;


public class StringBufferBuilder {
	private static void main(String[] args) {
		StringBuffer a = new StringBuffer("Hellow");
		StringBuffer b = new StringBuffer("hi");
		System.out.println(a.append(b));
		
		StringBuilder c = new StringBuilder("Dharun");
		StringBuilder d = new StringBuilder("Prakash");
		d.insert(0," J A");
		
		System.out.println(c.append(d));
		d.reverse();
		System.out.println(d);
		
		
	}

}
