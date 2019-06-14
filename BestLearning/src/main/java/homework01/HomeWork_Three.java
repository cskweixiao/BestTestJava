package homework01;

import org.testng.annotations.Test;

public class HomeWork_Three {


    @Test
    public void test() {
        String param = "  abcvv  ";
//           param=param.trim();
        System.out.println(param.length());


    }


    public String TrimLeft(String sString){
        //获取首字母
        String param1=sString.trim().substring(0,1);
        //获取首字母所在的索引
        int s=sString.indexOf(param1);
        //从3开始截取
        String result=sString.substring(s,sString.length());
        return result;
    }


}
