package homework01;



public class HomeWork_eleven  {



    public static void main(String[] args) {
        int[] arr={6,3,8,2,9,1};
        int i = getIndex(arr,2);
        System.out.println(i);
    }

    public static int getIndex(int[] arr, int value) {
        int min = 0;
        int max = arr.length - 1;
        int mid = (min + max) / 2;

        while (arr[mid] != value) {                    //当中间值不等于要找的值,就开始循环查找
            if (arr[mid] < value) {                    //当中间值小于了要找的值
                min = mid + 1;                    //最小的索引改变
            } else if (arr[mid] > value) {			//当中间值大于了要找的值
                max = mid - 1;                    //最大的索引改变
            }

            mid = (min + max) / 2;                    //无论最大还是最小改变,中间索引都会随之改变

            if (min > max) {                        //如果最小索引大于了最大索引,就没有查找的可能性了
                return -1;                    //返回-1
            }
        }
        return mid;

    }





}
