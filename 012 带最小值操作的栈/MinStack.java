package MinStack;

import java.util.ArrayList;

/**
 * Created by Silocean on 2016-04-01.
 */
public class MinStack {

    private int[] arr;

    private int N; // 标识stack元素个数

    private ArrayList<Integer> minList; // 当前最小值列表

    public MinStack() {
        arr = new int[8];
        minList = new ArrayList<>();
        minList.add(Integer.MAX_VALUE);
    }

    /**
     * 动态分配大小
     *
     * @param max
     */
    private void resize(int max) {
        int[] temp = new int[max];
        for (int i = 0; i < N; i++) {
            temp[i] = arr[i];
        }
        arr = temp;
    }

    public void push(int number) {
        if (N == arr.length) resize(2 * arr.length);
        arr[N++] = number;
        if (number <= min()) {
            minList.add(number);
        }
    }

    public int pop() {
        int number = arr[--N];
        arr[N] = 0;
        if (min() == number) {
            minList.remove(minList.size() - 1);
        }
        if (N > 0 && N == arr.length / 4) resize(arr.length / 2);
        return number;
    }

    public int min() {
        return minList.get(minList.size() - 1);
    }

}
