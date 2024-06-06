package ra.session04.ex3;

public class testStopWatch {
    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        int [] arr = new int [100000];
        for (int i = 0; i <100000 ; i++) {
            arr[i] = (int) (Math.random() *10 );
        }
        stopWatch.stop();
        System.out.println("thời gian thực thi là : " + stopWatch.getElapsedTime() + "");

    }
}
