package ex5_work;

public class ThreadSub2 extends Thread { // 곱


    // ★이거 중요
    private int [] arr;
    public ThreadSub2( int [] arr){
        this.arr = arr;
    }

    int X = arr[0];

    @Override
    public void run() {

        for(int i = 0; i < arr.length; i++){
            X *= arr[i];

        }//for 곱

        System.out.println(X);
        
    }
    
}
