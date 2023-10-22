public class Tut1 {
    public static void main(String[] args) {
        // String methods
        String name = "Harry";
        System.out.println(name.length());
        System.out.println("HU".toLowerCase());
        System.out.println(" eueu  ".trim());
        System.out.println(name.substring(2));
        System.out.println(name.substring(2, 4));
        System.out.println(name.replace('r', 'e'));
        System.out.println(name.replace("ry", "ueue"));
        System.out.println(name.startsWith("Ha"));
        System.out.println(name.endsWith("Ha"));
        System.out.println(name.charAt(2));
        System.out.println(name.indexOf('a'));
        System.out.println(name.indexOf("ry"));
        
        String aa = "Haarraarryy";
        System.out.println(aa.indexOf("ar", 4));
        System.out.println(name.indexOf("ar", 4));
        System.out.println(aa.indexOf("aehhs"));
        System.out.println(aa.lastIndexOf("ajsjjsr", 4));
        System.out.println(aa.lastIndexOf("ar"));
        System.out.println(aa.lastIndexOf("ar", 4));
        System.out.println(name.equals("Harry"));
        System.out.println(name.equalsIgnoreCase("harry"));
        System.out.println("\\h\b\n\t\'\"");
        
        // Shortcuts
        int a = 5;
        int b = 10;
        int sum = a + b;
        System.out.println(sum);

        // Typecasting
        float f = (float)a;

        // Precedence
        int x = 7 / 4 * 9 / 2;
        System.out.println(x);

        // Increment and Decrement
        int y = 56;
        System.out.println(y++);
        System.out.println(++y);

        // Constructors
        Employee emp1 = new Employee();
        emp1.setId(1);
        emp1.setName("John");
        System.out.println(emp1.getId());
        System.out.println(emp1.getName());

        Employee emp2 = new Employee();
        emp2.setId(2);
        emp2.setName("Jane");
        System.out.println(emp2.getId());
        System.out.println(emp2.getName());
    }
}

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
