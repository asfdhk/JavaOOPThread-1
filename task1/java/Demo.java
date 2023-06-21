import java.math.BigInteger;

public class Demo extends Thread{
    public Demo(){
        start();
    }

    @Override
    public void run() {
        try {
            int number = Integer.parseInt(getName().substring(7)) ;
            number ++;
            BigInteger a= new BigInteger("1");
            for ( int i = 1;i<=number;i++){
                a = a.multiply(new BigInteger(""+i));
            }
            System.out.println(getName());
            System.out.println(a);
        }catch (NumberFormatException e){
            System.out.println("error");
        }
    }
}
