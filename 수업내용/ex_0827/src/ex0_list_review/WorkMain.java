package ex0_list_review;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WorkMain {

    public static void main(String[] args) {

        String[] data = {
            "apple", "banana", "orange", "grape",
            "strawberry", "pineapple"
        };

        List<String> arr = new ArrayList<String>(
            Arrays.asList(
                "strawberry", "pineapple", "orange",
                "strawberry", "banana", "orange"
            )
        );

        WorkSub ws = new WorkSub(arr, data);
        ws.start();
    }
}
