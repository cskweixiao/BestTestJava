package homework01;

import org.testng.annotations.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HomeWork_Five {

   //百度的，没弄懂
    @Test
    public void test(){
        String sString="***abc***";
        String regEx="[\n`~!@#$%^&*()+=|{}':;',\\[\\].<>/?~！@#￥%……&*（）——+|{}【】‘；：”“’。， 、？]";
//        char[] chars = regEx.toCharArray();
        Pattern p = Pattern.compile(regEx);
        Matcher m = p.matcher(sString);
        String result = m.replaceAll("").trim();
        System.out.println(result);

    }
}
