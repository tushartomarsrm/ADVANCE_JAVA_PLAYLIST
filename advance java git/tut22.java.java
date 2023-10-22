public class tut108JAVA_ANNOTATIONS {
    // @Override
    public int add(int a, int b) {
        return a + b;
    }

    // @SuppressWarnings("deprecation")
    @SuppressWarnings("deprecation")
    public void deprecatedMethod() {
        // Deprecated method
    }

    // @Deprecated
    @Deprecated
    public void oldMethod() {
        // Old method
    }

    // @FunctionalInterface
    @FunctionalInterface
    interface MyFunctionalInterface {
        void myMethod();
    }

    public static void main(String[] args) {
        // Using the @SuppressWarnings annotation
        // @SuppressWarnings("deprecation")
        tut108JAVA_ANNOTATIONS obj = new tut108JAVA_ANNOTATIONS();
        obj.deprecatedMethod();

        // Using the @Deprecated annotation
        // @Deprecated
        obj.oldMethod();

        // Using the @FunctionalInterface annotation
        MyFunctionalInterface myInterface = () -> {
            System.out.println("Functional Interface Method");
        };
        myInterface.myMethod();
    }
}
In this code, I've included the annotations @Override, @SuppressWarnings, @Deprecated, and @FunctionalInterface along with examples for each one.

@Override: This annotation is used when a method is intended to override a method declared in a superclass. It helps to ensure that the method is actually overriding a method from the superclass.

@SuppressWarnings("deprecation"): This annotation suppresses warnings related to the use of deprecated methods or classes. It can be applied to methods, variables, or classes.

@Deprecated: This annotation marks a method as deprecated, indicating that it is no longer recommended for use. It serves as a warning to developers that the method may be removed in future versions.

@FunctionalInterface: This annotation is used for interfaces that have exactly one abstract method. It ensures that the interface is used for functional programming and can be used with lambda expressions.