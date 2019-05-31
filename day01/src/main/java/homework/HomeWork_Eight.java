package homework;

import org.testng.annotations.Test;

public class HomeWork_Eight {


  //Totittle转化,hello输出Hello

   @Test
    public void test(){
       String a="hello";
       char[] c=a.toCharArray();
       char d=Character.toTitleCase(c[0]);
       String result=d+a.substring(1);
       System.out.println(result);
//       System.out.println(a.substring(0,1));

   }

}
