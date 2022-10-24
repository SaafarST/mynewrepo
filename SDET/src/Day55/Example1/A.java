package Day55.Example1;

public class A {
    static {
        System.out.println("StaticBlock A");
    }
    {
        System.out.println("InitializerBlock A");
    }
    public A(){
        System.out.println("A");
    }
}
