package Inheritance;

public class Main {
    public  static  void main(String[] args){
        C c = new C("This value is pass from the main");
        c.wordA();
        c.wordB();
        c.wordC();
        c.wordA2();
        c.setName("this is from set name");
        System.out.println(c.getName());

        //
        Blank blank = new Blank(5);
        System.out.println(blank.getC());
        blank.print();


    }
}
