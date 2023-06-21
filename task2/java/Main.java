import java.util.Random;

public class Main {
    public static void main(String[] args) {
        long time;
        int arr[] = new int[1000000];
        toFillArr(arr);
        time = System.currentTimeMillis();
        System.out.println("Main: " + sum(arr));
        System.out.println("Execution time: " + (System.currentTimeMillis() - time));
        time = System.currentTimeMillis();
        try {
            Demo demo = new Demo(arr);
            demo.start();
            demo.join();
        }catch (Exception r){
            System.out.println("Error");
        }
        System.out.println("Execution time: " + (System.currentTimeMillis() - time));
    }

    static void toFillArr(int a[]){
        Random random = new Random();
        for (int i = 0; i<a.length;i++){
            a[i] = random.nextInt(100);
        }
    }

    static int sum(int a[]){
        int num = 0;
        for (int i = 0; i<a.length;i++){
            num +=a[i];
        }
        return num;
    }
}
