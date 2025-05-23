
public class ClassB extends ClassA {
	public void print() {
		ClassA obj = new ClassA();
		System.out.println(obj.i1);
		//System.out.println(obj.i2);  Line 9
		System.out.println(this.i2);  //Line 10
		System.out.println(super.i2);  //Line 11
	}
	public static void main(String[] args) {
		new ClassB().print();
	}
}