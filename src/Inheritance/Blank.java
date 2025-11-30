package Inheritance;

public class Blank {
    int a= 1;
    int b = 2;
    int c ;

    public Blank() {
    }

    public Blank(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public Blank(int c) {
        this.c = c;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    void print(){
        System.out.println("this is from blank");
    }

}
