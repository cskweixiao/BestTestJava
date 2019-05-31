package homework;

public class HomeWork_Four {

    public String TrimRight(String sString) {
        String param1=sString.trim().substring(0,1);
        int  s=sString.indexOf(param1);
        //截取0到右边空格的最后一个字母   若a的索引为4，加上去除两边空格后的索引长度就是所需要的长度
        String result=sString.substring(0,s+sString.trim().length());
        return result;
    }
}
