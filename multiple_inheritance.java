/**
 * multiple_inheritance
 */

import java.util.*;
    
interface One {
    public void print();
}

interface Two {
    public void print();
}

interface Three extends One, Two {
    public void print();
}

class Four implements Three {
    @Override public void print() {
        System.out.println("hello m*");
    }
}

public class multiple_inheritance {
    public static void main(String[] args) {
        Four f = new Four();
        f.print();
    }
    
}