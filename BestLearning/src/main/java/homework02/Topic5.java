package homework02;

import org.junit.Test;

/**
 * 作业5:实现一个杨辉三角
 *
 * 要求: 打印多少行由方法入参传入
 *
 * 杨辉三角的样式:
 *
 *               1
 *              1 1
 *             1 2 1
 *            1 3 3 1
 *           1 4 6 4 1
 * @author haoc
 */
public class Topic5 {


        public static void test(int rows) {

            for(int i =0;i<rows;i++) {
                int number = 1;
                //打印空格字符串
                System.out.format("%"+(rows-i)*2+"s","");
                for(int j=0;j<=i;j++) {
                    System.out.format("%4d",number);
                    number = number * (i - j) / (j + 1);
                }
                System.out.println();
            }
        }

        @Test
        public void test1(){

            test(10);


        }

    }


