package homework02;

import org.junit.Test;

import java.math.BigDecimal;

/**
 * 作业3: 实现一个计算器
 *
 * 需求如下:
 *
 * - 1.接收客户端输入(Java核心卷一,第三章,3.7节)的三个数据,格式: 数据1 操作符 数据2,如: 1 + 2
 *
 * - 2.如果数据1和2是数值型,则进行相应的运算符操作
 *
 * - 3.如果数据1和2不是数值型,则将数据1和数据2按字符串处理,与运算符一起拼接后输出,如: abc - bcd,输出"abc-bcd"
 *
 * 备注:
 *
 * - 1.计算器运算符只支持+,-,*,/,%
 *
 * - 2.数据和运算符之间使用空格隔开
 *
 * 要求:
 *
 * - 1.考虑程序的健壮性
 *
 * - 2.自行设计测试用例
 *
 * @author haoc
 */
public class Topic3 {


    //判断参数是否为String,只要有一个就打印a+b
    public static Boolean isString(Object a, Object b){
        if(a instanceof String || b instanceof String){
            return true;
        }
        return false;
    }

    //判断是否是char;
    public static Boolean isChar(Object a){
        if(a instanceof Character ){
            return true;
        }
        return false;
    }

    //判断是否为数字类型的char
    public static Boolean isNumChar(String a ){
        String[] chr={"0","1","2","3","4","5","6","7","8","9"};
        for(String cr:chr){
            if (a.equals(cr)){
                return true;
            }
        }
        return false;
    }

    //判断是否为int,byte,short,long,double,float
    public static Boolean isnotdig(Object a) {
        if (a instanceof Integer) {
            return true;
        }
        if (a instanceof Byte) {
            return true;
        }
        if (a instanceof Short) {
            return true;
        }
        if (a instanceof Long) {
            return true;
        }
        if (a instanceof Double){
            return true;
        }
        if(a instanceof Float){
            return true;
        }
        return false;
    }


    //判断运算符号
    public static  Boolean isCharter(String c){
        String[] ch={"+","-","*","/","%"};
        for(String cr :ch){
            if (c.equals(cr)){
                return true;
            }
        }
        return false;
    }

    //有String类型的运算
    public static String addString(String a,String b,String c){
            return a+b+c;
    }

    //数字类型运算
    public static String addNum(BigDecimal a,String b,BigDecimal c){
        if (b=="+"){
           return a.add(c).toString();
        }
        if (b=="-"){
            return a.subtract(c).toString();
        }
        if (b=="*"){
            return a.multiply(c).toString();
        }
        if(b=="/"){
            return a.divide(c,2,BigDecimal.ROUND_DOWN).toString();
        }

        return a.divideAndRemainder(c)[1].toString();

    }

    //计算器
    public static String count(Object a ,String b,Object c){
        //判断运算符是否正确
        Boolean rech =isCharter(b);
        if(!rech){
            return "输入运算符有错误";
        }
        //有String
        Boolean restring=isString(a,c);
        if(restring){
            return addString(a.toString(),b,c.toString());
        }

        //判断是否为char类型
        Boolean reschar=isChar(a);
        Boolean reschar2=isChar(c);
        //判断是否为数字类型char
//        System.out.println(a.toString());
        Boolean r1 = isNumChar(a.toString());
        Boolean r2 = isNumChar(c.toString());
        //有字符
        if(reschar||reschar2) {
            //有字母型char
            if (!r1 || !r2) {
                return addString(a.toString(), b, c.toString());
            }
            //没有字母类型
            else{
                //转化成Double
                Double num1 = Double.parseDouble(a.toString());
                Double num2 = Double.parseDouble(c.toString());
                return String.valueOf(num1+num2);
            }

        }

        //数字型运算
        Double num1=Double.parseDouble(a.toString());
        Double num2=Double.parseDouble(c.toString());
        BigDecimal param1=new BigDecimal(num1.toString());
        BigDecimal param2=new BigDecimal(num2.toString());
        return addNum(param1,b,param2);

    }

    @Test
    public  void test(){
        int a=1;
        long b=11112;
        byte e=1;
        short f=1111;

        double d=0.00000000001;
        float g=0.11111f;
        char c='1';
        String x="111";
        System.out.println( String.valueOf(d+d));
        System.out.println(isNumChar(Character.toString(c)));

    }


    @Test
    public void test1(){
        String test=count(1,")",1);
        System.out.println(test);
    }
    @Test
    public void test2(){
        String test=count(1,"+",1);
        System.out.println(test);
    }

    @Test
    public void test3(){
        String test=count(1,"+",0.1);

    }

    @Test
    public void test4(){
        String test=count(1,"+",0.1f);
        System.out.println(test);
    }

    @Test
    public void test5(){
        String test=count(0.1,"+",0.001);
        System.out.println(test);
    }

    @Test
    public void test6(){
        String test=count('1',"+",1);
        System.out.println(test);
    }

    @Test
    public void test7(){
        String test=count('a',"+",1);
        System.out.println(test);
    }

    @Test
    public void test8(){
        String test=count('a',"+",'a');
        System.out.println(test);
    }

    @Test
    public void test9(){
        String test=count('a',"+","b");
        System.out.println(test);
    }



}
