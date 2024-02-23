/**
 * multi_threading
 */
class h1 extends Thread{
    public void run(){
        for(int i = 1 ; i <= 10 ; i++){
            System.out.println("h1");
            try {
                Thread.sleep(10);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
class h2 extends Thread{
    public void run(){
        for(int i = 1 ; i <= 10 ; i++){
            System.out.println("h2");
            try {
                Thread.sleep(10);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
public class multi_threading {
    public static void main(String[] args) {
        h1 h11 = new h1();
        h2 h22 = new h2();
        h11.start();
        try {
                Thread.sleep(10);
            } catch (Exception e) {
                e.printStackTrace();
            }
        h22.start();
    }
}