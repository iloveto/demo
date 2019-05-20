package algorithm;

public class ChoiceSort {
    public static void main(String[] args) {
        int[] intArray = {18, 17, 2, 4, 9, 6};

        for (int i = 0; i < intArray.length - 1; i++) {//确定第i个位置的元素
            int min = intArray[i];//用于记录循环中相对最小的元素
            int lable = -1;
            for (int j = i + 1; j < intArray.length-1; j++) {//将第i个元素与剩下的元素对比，找最小的
                if(min>intArray[j]){
                    min = intArray[j];
                    lable = j;
                }
            }
            if(lable!=-1){
                intArray[lable] = intArray[i];
                intArray[i]=min;
            }
        }

        for (int i = 0; i < intArray.length - 1; i++) {
            System.out.println(intArray[i]);
        }
    }
}
