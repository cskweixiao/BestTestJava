package homework01;


import java.math.BigDecimal;

public class HomeWork_One {

//    //1、BigDecimal 计算器，实现加减乘除，并考虑是很大的数值计算场景
//    public static BigDecimal add1(String param1, String param2){
//        BigDecimal p1=new BigDecimal(param1);
//        BigDecimal p2=new BigDecimal(param2);
//        return p2.add(p1);
//    }
//
//    public static BigDecimal sub(String param1,String param2){
//        BigDecimal p1=new BigDecimal(param1);
//        BigDecimal p2=new BigDecimal(param2);
//        return p2.subtract(p1);
//
//    }
//    public static BigDecimal mul(String param1,String param2){
//        BigDecimal p1=new BigDecimal(param1);
//        BigDecimal p2=new BigDecimal(param2);
//        return p2.multiply(p1);
//    }


    /**八种摄入模式
     1、ROUND_UP
     2、ROUND_DOWN
     3、ROUND_CEILING
     4、ROUND_FLOOR
     5、ROUND_HALF_UP
     6、ROUND_HALF_DOWN
     7、ROUND_HALF_EVEN
     8、ROUND_UNNECESSARY
     */
//    //scale为精确的小数位数
//    public static BigDecimal div(String param1,String param2,int scale){
//        BigDecimal p1=new BigDecimal(param1);
//        BigDecimal p2=new BigDecimal(param2);
//        return p2.divide(p1,scale,BigDecimal.ROUND_UP);
//
//    }


//    @Test1
//    public void test(){
//        BigDecimal p1=new BigDecimal("1");
//        BigDecimal p2=new BigDecimal("0");
//        System.out.println(p2.divide(p1,3,BigDecimal.ROUND_UP));
//    }




    //空字符串判断
    public static Boolean requiredNotBlank(String param1,String param2){
        if(param1==null&&param2==null){
            return false;
        }
        //判断是否为空和是否带空格
        if(param1.trim().isEmpty() &&param2.trim().isEmpty()){
            return false;
        }
        return true;
    }


    //判断是否为数字
    private static boolean requiredCommonsNumeric(String str) {

        // 不需要校验非空,入参已处理
        char[] chars = str.toCharArray();
        for (char ch : chars) {
            // 数值表示,一般在0~9之间,以及小数点
            if (('0' < ch && ch < '9') || ch == '.'
                    || ch == '-') {
                // 说明数值在0-9之间,或者是.
                continue;
            }
            return false;
        }
        return true;
    }


    //判断是否有多个..或者有.11 1-1 1..1 1.这种
    private static boolean requiredStrictNumber(String str) {
        int sum = 0;
        char[] chars = str.toCharArray();
        if (chars[0] == '.' || chars[chars.length - 1] == '.') {
            return false;
        }
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '.') {
                sum++;
            }
            if (chars[i] == '-' && i != 0) {
                return false;
            }
        }
        return sum <= 1;
    }

//    长度校验,假设数值最大长度支持64位
    private static Boolean requiredLength(String num1,String num2){
        if(num1.length()<=64 &&num2.length()<=64){
            return true;
        }
        return false;
    }


    //add
    public static String add(String num1, String num2) {
        // 基本参数校验,非空校验
        boolean isValided = requiredNotBlank(num1, num2);
        if (!isValided) {
            System.err.println("参数异常,两个数不可以为空,不可以为null");
            return null;
        }


        /**
         * 长度校验,假设数值最大长度支持64位
         */
        if (!requiredLength(num1, num2)) {
            System.err.println("参数异常,两个数长度超过了最大限制");
            return null;
        }

        /**
         * 校验数值是否合法
         */
        boolean isNum1Valid = requiredCommonsNumeric(num1);
        if (!isNum1Valid) {
            System.err.println("num1不合法,不信你看看num1是啥:[" + num1 + "]");
            return null;
        }
        boolean isNum2Valid = requiredCommonsNumeric(num2);
        if (!isNum2Valid) {
            System.err.println("num2不合法,不信你看看num2是啥:[" + num2 + "]");
            return null;
        }

        /**
         * 校验数据是否是数值,比如1..1,或者.11
         */
        boolean isNum1StrictValid = requiredStrictNumber(num1);
        if (!isNum1StrictValid) {
            System.err.println("num1不合法,不信你看看num1是啥:[" + num1 + "]");
            return null;
        }
        boolean isNum2StrictValid = requiredStrictNumber(num2);
        if (!isNum2StrictValid) {
            System.err.println("num2不合法,不信你看看num2是啥:[" + num2 + "]");
            return null;
        }

        // 包装数值,做一下trim
        BigDecimal decimal1 = new BigDecimal(num1.trim());
        BigDecimal decimal2 = new BigDecimal(num2.trim());

        return decimal1.add(decimal2).toString();
    }

    //div
        public static BigDecimal div(String num1,String num2,int scale){
            // 基本参数校验,非空校验
            boolean isValided = requiredNotBlank(num1, num2);
            if (!isValided) {
                System.err.println("参数异常,两个数不可以为空,不可以为null");
                return null;

            }
            /**
             * 长度校验,假设数值最大长度支持64位
             */
            if (!requiredLength(num1, num2)) {
                System.err.println("参数异常,两个数长度超过了最大限制");
                return null;
            }

            /**
             * 校验数值是否合法
             */
            boolean isNum1Valid = requiredCommonsNumeric(num1);
            if (!isNum1Valid) {
                System.err.println("num1不合法,不信你看看num1是啥:[" + num1 + "]");
                return null;
            }
            boolean isNum2Valid = requiredCommonsNumeric(num2);
            if (!isNum2Valid) {
                System.err.println("num2不合法,不信你看看num2是啥:[" + num2 + "]");
                return null;
            }

            /**
             * 校验数据是否是数值,比如1..1,或者.11
             */
            boolean isNum1StrictValid = requiredStrictNumber(num1);
            if (!isNum1StrictValid) {
                System.err.println("num1不合法,不信你看看num1是啥:[" + num1 + "]");
                return null;
            }
            boolean isNum2StrictValid = requiredStrictNumber(num2);
            if (!isNum2StrictValid) {
                System.err.println("num2不合法,不信你看看num2是啥:[" + num2 + "]");
                return null;
            }
            BigDecimal decimal1 = new BigDecimal(num1.trim());
            BigDecimal decimal2 = new BigDecimal(num2.trim());
        return decimal1.divide(decimal2,scale,BigDecimal.ROUND_UP);

    }


}
