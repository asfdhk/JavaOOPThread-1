public class Demo extends Thread{

    private int[] arrays;
    public Demo(int[] arrays){
        this.arrays = arrays;
    }

    @Override
    public void run() {
        System.out.println("Thread: "+ Main.sum(arrays));
    }

    public int[] getArrays() {
        return arrays;
    }

    public void setArrays(int[] arrays) {
        this.arrays = arrays;
    }
}
