package homework02;

/**
 * 作业8: 回想下面向对象练习的时候,我们设计的老师类和学生类,好多重复的属性和方法
 *
 * - 使用面向对象中的继承来抽象老师和学生更高一层的类,父类
 *
 * - 让相同的属性和方法可以抽离到父类中
 *
 * @author haoc
 */

public class Topic8 {
    private   String name;
    private int id;
    public Topic8(String myname, int myid){
        String name=myname;
        int id=myid;
    }

    public  void write(){
        Teacher t=new Teacher("123",12);
        t.eat();
        System.out.println(name+"xiexiexiexie");

    }
    public  void eat(){

        System.out.println(id+"chichichi");

    }

    class Teacher extends Topic8 {
        public Teacher(String myname, int myid){
            super(myname,myid);
        }


    }

    class Test{



    }

}
