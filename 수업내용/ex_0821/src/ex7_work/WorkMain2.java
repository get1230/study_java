package ex7_work;

public class WorkMain2 {
    public static void main(String[] args) {
        
        // 가장 큰 값을 찾으세요 : 
        int [] arr = {1, 11, 7, 20, 13, 15};

        WorkSub ws = new WorkSub();
        int res = ws.getBigger(arr);

        System.out.println("가장큰값 :" +res);
    }
    
}
