package homework;

import org.testng.annotations.Test;

public class HomeWork_Six {


   //基于startwith，实现可忽略大小写的实现，及abc_和ABC_都可以
    @Test
    public void test(){
        String a="ABC_";
        String b="abc_";
        System.out.println("\"abc_abc\".startsWith(\"hello\") = " + "abc_abc".startsWith(a.toLowerCase()));
        System.out.println("\"abc_abc\".startsWith(\"hello\") = " + "abc_abc".startsWith(b.toLowerCase()));

    }
}
