package Day57.Tohir.Ex3;

public interface I {

    default void print(){
        System.out.println("Print interface default method");
    }

    default void write(){
        System.out.println("Write interface default method");
    }
}

class A implements I{

}

class App{
    public static void main(String[] args) {
        A a = new A();
        a.print();
        a.write();
    }
}