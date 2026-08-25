package ex5_work;

public class ThreadSub1 extends Thread { //합

    private int [] arr;
    public ThreadSub1( int [] arr){
        this.arr = arr;
    }
    int sum = arr[0];

    @Override
    public void run() {
        
        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
         }//for 합

         System.out.println(sum);

    }
    
}
