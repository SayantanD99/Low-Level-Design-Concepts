package Java_Basics.Inheritance;

public class D extends C implements Runner{

    D(){
        System.out.println("D called");
    }

    D(String s){
        super(s);
        System.out.println("D params called with value "+s);
    }

    C doSomething() {
        System.out.println("doingSomething in d");
        return new C();
    }

    public void run(){
        System.out.println("running");
    }
}