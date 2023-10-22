// An interface with a single abstract method
@FunctionalInterface
interface An{ 
    void bark(int a, int b);
}

// A class that implements the interface
class Bn implements An{
    @Override
    public void bark(int a, int b) {
        System.out.println(a + b);
    }
}

public class tut109AnonymousClassandLambdaExpression{
    public static void main(String[] args) {
        // Using a regular class
        Bn c = new Bn();
        c.bark(7, 3);

        // Using an anonymous class by implementing an interface
        An c1 = new An(){
            @Override
            public void bark(int a, int b){
                System.out.println(a + b);
            }
        };
        c1.bark(7, 3);

        // Using an anonymous class by extending an abstract class
        abstract class Fun{
            abstract void run();
        }

        Fun f = new Fun() {
            @Override
            void run() {
                System.out.println("RUN MAN RUN");
            }
        };
        f.run();

        // Using a lambda expression
        An c2 = (a, b) -> {
            System.out.println(a + b);
        };
        c2.bark(7, 3);
    }
}
