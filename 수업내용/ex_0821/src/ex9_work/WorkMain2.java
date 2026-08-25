package ex9_work;

public class WorkMain2 {    
    public static void main(String[] args) {
        
        //1~45 사이의 중복되지 않는 난수 6개를 출력하는
        // 로또번호 생성기 만들기
                
        int [] lotto = new int[6];

        WorkSub2 ws = new WorkSub2();
        ws.myLotto(lotto);
    
}
}
