package homework01;

import org.testng.annotations.Test;

public class Test1 {

    @Test
    public void test(){
//        int target= (int) (Math.random()*100);
//        Scanner num=new Scanner(System.in);
//        int length=num.nextInt();
//        if (length<target){
//            System.out.println("太小了");
//        }
//        else if(length>target){
//            System.out.println("太大了");
//        }else {
//            System.out.println("");
//        }

        int a=0;
        for (int i = 1; i <=100 ; i++) {//不要写<101，和需求保持一致
            a=a+i;
            if(i==100) {
                System.out.println(a);
            }
        }

        int c=0;
        int i=1;
        while(i<=100){
            c=c+i;
        }










    }
    //String 输入类型异常
//    @Test
//    public void test1(){
//        Scanner num=new Scanner(System.in);
//        String str=num.nextLine();
//        switch (str) {
//            case "hello":
//                System.out.println("hi");
//                break;
//            default:
//                System.out.println();
//
//    }


    }

