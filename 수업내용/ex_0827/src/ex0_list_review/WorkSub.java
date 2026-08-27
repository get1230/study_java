package ex0_list_review;

import java.util.List;

public class WorkSub extends Thread {

    private List<String> arr;
    private String[] data;

    public WorkSub(List<String> arr, String[] data) {
        this.arr = arr;
        this.data = data;
    }

    @Override
    public void run() {

        // 배열의 단어가 List 안에 몇 번 들어있는지 확인하는 복습 예제
        for (String word : data) {

            int count = 0;

            for (String item : arr) {
                if (word.equals(item)) {
                    count++;
                }
            }

            System.out.println(word + " : " + count);
        }
    }
}
