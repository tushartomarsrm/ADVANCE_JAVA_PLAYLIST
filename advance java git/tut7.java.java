class Employee {
    private int id;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String n) {
        name = n;
    }

    public void setId(int i) {
        id = i;
    }

    public int getId() {
        return id;
    }
}

class A {
    int x;

    public A() {
        this.x = 0;
    }
}

class B extends A {
    public B() {
        this.x = 42;
    }
}

class C extends B {
    public C() {
        this.x = 100;
    }
}

class Base1 {
    Base1() {
        System.out.println("I am a constructor");
    }

    Base1(int x) {
        System.out.println("I am an overloaded constructor with value of x as: " + x);
    }
}

class Derived1 extends Base1 {
    Derived1() {
        System.out.println("I am a derived class constructor");
    }

    Derived1(int x, int y) {
        super(x);
        System.out.println("I am an overloaded constructor of Derived with value of y as: " + y);
    }
}

class ChildOfDerived extends Derived1 {
    ChildOfDerived() {
        System.out.println("I am a child of derived constructor");
    }

    ChildOfDerived(int x, int y, int z) {
        super(x, y);
        System.out.println("I am an overloaded constructor of Derived with value of z as: " + z);
    }
}

class Phone {
    public void showTime() {
        System.out.println("Time is 8 am");
    }

    public void on() {
        System.out.println("Turning on Phone...");
    }
}

class SmartPhone extends Phone {
    public void music() {
        System.out.println("Playing music...");
    }

    @Override
    public void on() {
        System.out.println("Turning on SmartPhone...");
    }
}

public class CWH_ConceptsDemo {
    public static void main(String[] args) {
        // Encapsulation Example
        Employee harry = new Employee();
        harry.setName("CodeWithHarry");
        harry.setId(101);
        System.out.println("Employee ID: " + harry.getId());
        System.out.println("Employee Name: " + harry.getName());

        // Constructor Inheritance Example
        Base1 b1 = new Base1();
        Base1 b2 = new Base1(4);
        Derived1 d1 = new Derived1();
        Derived1 d2 = new Derived1(14, 9);
        ChildOfDerived cd1 = new ChildOfDerived();
        ChildOfDerived cd2 = new ChildOfDerived(12, 13, 15);

        // Method Overriding and Dynamic Method Dispatch Example
        Phone obj = new SmartPhone(); // Dynamic method dispatch
        obj.showTime();
        obj.on();
        ((SmartPhone) obj).music(); // Explicit cast to access the music method
    }
}
