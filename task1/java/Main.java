import static java.lang.Thread.sleep;

public class Main {
    public static void main(String[] args) {
        for (int i = 0;i<100;i++){
            Demo ads =new Demo();
            try {
                sleep(10);
            }catch (InterruptedException e){
                System.out.println("ERROR");
            }
        }
    }
}
