package homework02;

import org.junit.Test;

/**
 * 作业6: 使用数组实现一个栈,元素整型即可
 *
 * 要求:
 *
 * - 实现入栈,enqueue
 *
 * - 实现出栈,dequeue
 *
 * - 实现获取栈顶元素值,getFront
 *
 * - 实现获取栈的大小
 *
 * - 实现判断栈是否为空
 *
 * @author haoc
 */
public class Topic6 {



}

/**
 * 例如
 */
class IntStack {


  //入栈，数组长度恒定，所以需要新建一个数组
  public void enqueue(int element,int[] array) {
          int[] a=new int[array.length+1];
          for(int i=0;i<array.length;i++){
            a[i]=array[i];
          }
          a[array.length+1]=element;
          System.out.println(a);

  }


  /**
   * 这个是取出栈顶元素,栈中就没有这个元素了
   */
  //新建一个数组，元素左移一位
  int dequeue(int[] array) {
    int[] a =new int[array.length-1];
    for(int i=0;i<array.length;i++){
      a[i]=array[i+1];
    }
    System.out.println(a);

    return array[0];
  }

  /**
   * 获取栈顶元素,意味着只是读取,这个元素还还会存储在栈中
   */
  public int getFront(int[] array) {
    return array[0];
  }

  public int length(int[] array) {

    return array.length;

  }

  public boolean isEmpty(int[] array) {
    if (array.length==0) {
        return false;
    }
    return true;
  }

  @Test
  public void test(){

       enqueue(1, new int[]{1, 2, 3, 4, 5});

  }

}

