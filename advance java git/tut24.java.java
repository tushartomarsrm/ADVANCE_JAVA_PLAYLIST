class MyGeneric<T1> {
    private T1 obj1;
    int a;

    public MyGeneric(int a, T1 obj1) {
        this.a = a;
        this.obj1 = obj1;
    }

    public void get() {
        System.out.println(a);
        System.out.println(obj1);
    }
}

public class tut110javagenerics {
    public static void main(String[] args) {
        MyGeneric<Integer> g1 = new MyGeneric<>(7, 8);
        g1.get();
    }
}
