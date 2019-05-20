package algorithm;

/**
 * 每一轮 从下对比到上，每轮确定一个最小值排到正确位置；
 * 比较相邻位置
 */
public class BubbleSort {

    public static void main(String[] args) {
        int[] intArray = {18, 17, 2, 4, 9, 6};
        int min;//用于存放相对小的元素
        for (int i = 0; i <= intArray.length-1; i++) {//从头开始 确定第i个位置的元素
            for(int j=intArray.length-1;j>=i+1;j--){//从尾部开始与相邻元素比较
                if(intArray[j]<intArray[j-1]){//如果后面的 小于 前面的 则互换位置
                    min = intArray[j];
                    intArray[j]=intArray[j-1];
                    intArray[j-1] = min;
                }
            }
        }
        for (int i = 0; i < intArray.length - 1; i++) {
            System.out.println(intArray[i]);
        }



    }
}
