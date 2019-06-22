package homework03;


import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 定义一个Map ，key是Useid,value是User 要求遍历整个map的数据
 * User{String Userid,String name,int age,Map<String,List<String>> hobby}
 * 如 u001，大叔，hobby(文学=[万历十五年，解忧杂货铺],电影=[复仇者3，金刚2]
 *
 *
 * 基于以上的定义，对年纪进行分组，20以下是青年，20到30是中年，30以上是老年
 * 遍历出每个组内的所有人
 *
 *基于以上的定义，要求对爱好进行分组，喜欢文学的一组，喜欢电影的一组
 * **/
public class Topic3 extends Hobby{


    @Test
   public void user_one() {

        Map<String ,User> map_result=new HashMap<>();
        List<String> list_one=new ArrayList<>();
        listExecute("万历十五年",list_one);
        listExecute("解忧杂货铺",list_one);

        List<String> list_two=new ArrayList<>();
        listExecute("二胡",list_two);
        listExecute("钢琴",list_two);

        Map<String,List<String>> map=new HashMap<>();
        mapExecute("文学",list_one,map);
        mapExecute("乐器",list_two,map);


        List<String> list_o=new ArrayList<>();
        listExecute("复仇者3",list_o);
        listExecute("X战警2",list_o);

        List<String> list_t=new ArrayList<>();
        listExecute("disco",list_t);
        listExecute("古典",list_t);

        Map<String,List<String>> map_o=new HashMap<>();
        mapExecute("电影",list_o,map);
        mapExecute("跳舞",list_t,map);

        User dashu=new User("u001","dashu",40,map);
        User CC=new User("u002","dashu",30,map);

        map_result.put(dashu.userid,dashu);
        map_result.put(CC.userid,CC);


        List<User> user_young=new ArrayList<>();
        List<User> user_mid=new ArrayList<>();
        List<User> user_old=new ArrayList<>();

        //遍历打印
        for(String key:map_result.keySet()){
            System.out.println(map_result.get(key));
            if(map_result.get(key).age<=20){
                user_young.add(map_result.get(key));
            }
            else if (map_result.get(key).age>20 && map_result.get(key).age<=30){
                user_mid.add(map_result.get(key));
            }
            else if (map_result.get(key).age>30){
                user_old.add(map_result.get(key));
            }
            else {
                System.out.println("年纪太大");
            }


        }


   }



    class User {

        private String userid;
        private String name;
        private int age;
        private Map<String, List<String>> hobby;

        public User(String userid, String name, int age,Map<String, List<String>> hobby){
            this.userid=userid;
            this.age=age;
            this.name=name;
            this.hobby=hobby;
        }

        public String getUserid(){
            return this.userid;
        }

        public String getName() {
            return this.name;
        }
        public int getAge(){
            return this.age;
        }

        public Map<String, List<String>> getHobby() {
            return this.hobby;
        }

        public void setUserid(String userid) {
            this.userid = userid;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public void setHobby(Map<String, List<String>> hobby) {
            this.hobby = hobby;
        }

        
    }
}
