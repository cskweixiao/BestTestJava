package homework02;

import org.junit.Test;

import java.util.*;

/**
 * 作业10: 集合作业(需要提前学习下 List,Map等基本用法)
 *
 * - 定义一个对象,User,属性有 name,age,score,gender
 *
 * - 使用集合ArrayList,来装一批User, 数据可以随意
 *
 * - 要求1: 遍历集合,打印所有内部数据
 *
 * - 要求2: 按照年纪(age)进行分组,比如23岁,有3个人, 24岁有5个人,
 *
 * - 要求3: 按照分数(score)范围分组, 比如 60-70, 有一组人, 70-80有一组人
 *
 * - 要求4: 基于分数排序, 由高到低
 *
 * - 要求5: 基于性别分组,求男同学的平均分,求女同学的平均分
 *
 * @author haoc
 */

public class Topic10 {


   @Test
    public void test1() {

       User userone = new User("xiaoming", 15, 88, "man");
       User usertwo = new User("xiaohong", 18, 98, "woman");
       User userthree = new User("xiaoqiang", 20, 100, "man");

       //新建一个List存放User类
       List<User> list = Arrays.asList(new User[] {userone,usertwo,userthree});

       //遍历打印数据
       for (int i = 0; i < list.size(); i++) {
           System.out.println(list.get(i));
       }
       Map<Integer, List<User>> array = new HashMap<>();
       for(User u:list){
           List<User> templist=array.get(u.returnAge());
           if (templist==null){
               templist = new ArrayList<>();
               templist.add(u);
               array.put(u.returnAge(),templist);
           }

           else{
               templist.add(u);
           }
   }

       //统计年龄数据
       for(int age:array.keySet()){

           System.out.println("年龄为"+age+"有"+array.get(age).size());

       }






//    @Test
//    public void test2(){
//           User one=new User("xiaoming",15,88,"man");
//           User two=new User("xiaohong",15,98,"woman");
//           User three=new User("xiaoqiang",20,100,"man");
//           int age1=one.returnAge();
//           int age2=two.returnAge();
//           int age3=three.returnAge();
//           int[] array=new int[]{age1,age2,age3};
//           //好想有个表QAQ
//            for(int i=0;i<array.length;i++){
//                for (int j=1;j<=99;j++){
//                    if ()
//                }
//
//            }


       }

}


class User{
        public String name;
        private int age;
        private int score;
        private String gender;

        public User(String name,int age,int score,String gender){
            this.name=name;
            this.age=age;
            this.score=score;
            this.gender=gender;
        }

        public String returnName(){
            return this.name;
        }

        public int returnAge(){
            return this.age;
        }

        public int returnScore(){
            return this.score;
        }

        public String returnGender(){
            return this.gender;
        }




    }



