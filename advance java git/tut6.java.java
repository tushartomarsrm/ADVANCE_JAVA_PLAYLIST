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

public class CWH_ConceptsDemo {
    public static void main(String[] args) {
        Employee harry = new Employee();
        harry.setName("CodeWithHarry");
        harry.setId(101);

        System.out.println("Employee ID: " + harry.getId());
        System.out.println("Employee Name: " + harry.getName());
    }
}
