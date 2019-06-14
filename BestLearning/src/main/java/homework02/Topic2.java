package homework02;

/**
 * 输出1到100以内的所有质数
 *
 * 质数: 只能被1和自身整除的数,如3,7,11,13等
 *
 * @author haoc
 */
public class Topic2 {
    public static void main(String args[]){
        int j;
        for (int i=2;i<=100;i++){ // 1不是素数，所以直接从2开始循环
            j = 2;
            while (i%j != 0) {
                j++; //测试2至i的数字是否能被i整除，如不能就自加
            }

            if (j == i){ //当有被整除的数字时，判断它是不是自身
                System.out.println(i);

            }

        }
    }

}
