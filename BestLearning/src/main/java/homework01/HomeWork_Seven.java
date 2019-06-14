package homework01;

import org.testng.annotations.Test;

public class HomeWork_Seven {

    @Test
    public void test(){
        String a="_abc";
        String b="_ABC";
        System.out.println("\"ABC_abc\".startsWith(\"ABC_\") = " + "ABC_abc".endsWith(a.toLowerCase()));
        System.out.println("\"abc_ABC\".startsWith(\"ABC_\") = " + "abc_abc".endsWith(b.toLowerCase()));

    }
}
