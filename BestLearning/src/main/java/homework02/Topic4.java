package homework02;

/**
 * 作业4: 封装一个数组对象(暂时用int型即可)
 *
 * 可先定义个数组看下,比如int[],有哪些方法提供,太少了
 *
 * 要求实现: 数组类
 *
 * - new 时传入指定大小
 *
 * - 可以添加元素
 *
 * - 可以删除元素
 *
 * - 可以根据给定元素,找到索引位置
 *
 * - 并支持跨度寻找,如find(1234,5),即夸过5个索引之后寻找
 *
 * - 实现对数组的遍历功能
 *
 * - 实现判断数组是否为空
 *
 * - 不理解,看下Topic6,栈的设计
 *
 * @author haoc
 */
public class Topic4 {

    //方法1，传入指定大小，生成数组
    public static int[] newarray(int a){
        int[] array=new int[a];
        return array;
    }

    //添加元素
    public static int[] add(int a,int b){
        int[] array=new int[]{};
        array[a]=b;
        return array;
    }

    //删除元素
    public static int[] delete(int index,int array[]){
        int[] arrNew = new int[array.length - 1];
        for (int i = index; i < array.length - 1; i++) {
            array[i] = array[i + 1];
        }
        System.arraycopy(array, 0, arrNew, 0, arrNew.length);
        return arrNew;

    }

    //给定元素，找到索引位置
     public static String  find(int a,int array[]){
        for (int i=0;i<array.length;i++){
            if(array[i]==a){
                return String.valueOf(i);
            }
        }
        return "不存在该元素";
     }

     //find(1234,5),即夸过5个索引之后寻找
    //findx(元素1，跨过5个位置，数组a)
    public static String findx(int a,int b,int array[]){
        for(int i=0;i<array.length;i++){
            if (array[i]==a){
                return String.valueOf(array[i+b]);
            }
        }
        return null;
    }

    //数组遍历
    public void arraylist(int array[]){
        for(int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }
    }

    //实现判断数组是否为空
    public void arraynull(int array[]){
        if (array.length==0){
            System.out.println("数组为空");
        }
    }




}
