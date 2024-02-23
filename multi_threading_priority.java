class h1 extends Thread{
    public void run(){
        for(int i = 1 ; i <= 10 ; i++){
            System.out.println("hii");
            try {
                Thread.sleep(20);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}

class h2 extends Thread{
    public void run(){
        for(int i = 1 ; i <= 10 ; i++){
            System.out.println("hello");
            try {
                Thread.sleep(20);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}

public class multi_threading_priority {
    public static void main(String[] args) {
        h1 h11 = new h1();
        h2 h22 = new h2();
        h11.setPriority(1);
        h22.setPriority(2);
        h11.start();
        try {
                Thread.sleep(10);
            } catch (Exception e) {
                e.printStackTrace();
            }
        h22.start();
    }   
}
