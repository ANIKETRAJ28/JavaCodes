class parent{
    public void print(){
        System.out.println("parent");
    }
}
class child extends parent{
    public void display(){
        System.out.println("child");
    }
}
class son extends parent{
    public void disp(){
        System.out.println("son");
    }
}
public class single_inheritance {
    public static void main(String[] args) {
        child c1 = new child();
        c1.display();
        c1.print();
        son s = new son();
        s.disp();
        s.print();
    }
}