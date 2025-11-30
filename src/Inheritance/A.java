package Inheritance;

public class A {
    String name;

    public A(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    void wordA(){
        System.out.println("This is from A");
    }
    void wordA2(){
        System.out.println("This is from A2");
    }
}
