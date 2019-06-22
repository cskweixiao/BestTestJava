package homework02;

//import org.junit.Test;

import org.testng.annotations.Test;

/**
 * 作业9: 请用面向对象的思路设计: 马路上跑汽车
 *
 * - 马路: 可能是高速, 也可能是辅路,还可能是乡村公路
 *
 * - 汽车: 可能是宝马, 可能是奔驰, 还可能是奥拓
 *
 * - 请用多态来进行设计
 *
 * @author haoc
 */
public class Topic9 {


    //Road
     abstract class Road{
        //
        abstract void roadisOk();

    }

    //Car
    abstract class Car{
        abstract void run();

    }
     class Gabs extends Road{
         public void roadisOk(){
             System.out.println("高速路敞亮");
         }

    }
     class Fulu extends Road{
        public void roadisOk(){
            System.out.println("辅路真款");
        }
    }

      class Country extends Road{
        public void roadisOk(){
            System.out.println("乡村小路真好看");
        }
    }

     class  Baoma extends Car{
         public void run(){
             System.out.println("宝马跑的飞快");
         }
    }

     class  Benchi extends Car{
        public void run(){
            System.out.println("奔驰跑的飞快");
        }
    }


     class  Aotuo extends Car{
        public void run(){
            System.out.println("奥拓跑的飞快");
        }
    }

    public static void isroad(Road road){
         if(road instanceof Gabs){
             Gabs a =(Gabs)road;
             a.roadisOk();
         }
        if(road instanceof Fulu){
            Fulu a =(Fulu)road;
            a.roadisOk();
        }
        if(road instanceof Country){
            Country a =(Country)road;
            a.roadisOk();
        }

    }

    public static void iscar(Car car){
        if(car instanceof Baoma){
            Baoma a =(Baoma)car;
            a.run();
        }
        if(car instanceof Benchi){
            Benchi a =(Benchi)car;
            a.run();
        }
        if(car instanceof Aotuo){
            Aotuo a =(Aotuo)car;
            a.run();
        }
    }

    @Test
    public void test() {

         Country ab=new  Country();
         isroad(ab);
         Benchi ac=new Benchi();
         iscar(ac);


        }
    }


