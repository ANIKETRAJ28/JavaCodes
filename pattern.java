public class pattern {
    public static void main(String[] args) {
        int a = 0, b = 1, c = 1;
        for(int i = 0 ; i < 5 ; i++){
            for(int j = 0 ; j <= i ; j++){
                System.out.print(b+" ");
                a = b;
                b = c;
                c = a+b;
            }
            System.out.println();
        }
    }
}
