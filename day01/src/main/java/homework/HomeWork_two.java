package homework;

import homework.HomeWork_One;
import org.testng.annotations.Test;

import java.math.BigDecimal;

public class HomeWork_two {


    @Test
    public void test() {
        HomeWork_One test = new HomeWork_One();
//        BigDecimal test1 = test.add("0.1111", "0.111");
//        System.out.println(test1);
    }

    //Object单个方法兼容String和double  不知道对不对系列
    public static void add(Object param1, Object param2) {
        //String&String
        if (param1 instanceof String && param2 instanceof String) {
            String pa1 = (String) param1;
            BigDecimal p1 = new BigDecimal(pa1);
            String pa2 = (String) param2;
            BigDecimal p2 = new BigDecimal(pa2);
            System.out.print(p2.add(p1));
        }
        //double&double
        else if (param1 instanceof Double && param2 instanceof Double) {
            double pa1 = Double.parseDouble(param2.toString());
            BigDecimal p1 = new BigDecimal(Double.toString(pa1));
            double pa2 = Double.parseDouble(param2.toString());
            BigDecimal p2 = new BigDecimal(Double.toString(pa2));
            System.out.print(p2.add(p1));
        } else {
            System.out.print("参数错误");
        }
    }

    //超长
    private static Boolean requiredLength(Double param1,Double param2){
        if(param1.toString().length()<=64 &&param2.toString().length()<=64){
            return true;
        }
        return false;
    }


    //Double类型相加
    public static String addTest(Double param1, Double param2) {
        if (requiredLength(param1,param2)){
            BigDecimal p1 = new BigDecimal(Double.toString(param1));
            BigDecimal p2 = new BigDecimal(Double.toString(param2));
            return p1.add(p2).toString();
        }
        return "输入DOUBLE类型超长";

    }


}
