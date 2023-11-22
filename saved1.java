// Interface I1 has a show() method
interface I1 {
public void show();
}

// Interface I2 also has a show() method
interface I2 {
public void show();
}

// Class C implements both I1 and I2
class C implements I1, I2 {
// C must provide implementation for both show() methods
public void show() {
System.out.println("Show from C");
}
}

// Class D inherits from C
class D extends C {
public static void main(String[] args) {
// Create an object of D
D d = new D();
// Call the show() method
d.show(); // Show from C
}
}