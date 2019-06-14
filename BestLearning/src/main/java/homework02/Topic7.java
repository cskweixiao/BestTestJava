package homework02;

/**
 * 作业7: 老师在黑板画圆
 *
 * 要求: 按照面向对象的思想设计
 *
 * - 老师不一定只会画圆,还可能会画正方形
 *
 * - 老师也可能会画大脸猫
 *
 * - 老师不见得只会在黑板上画,也可以在纸上画
 *
 * - 黑板只能用来画圆吗? 黑板还可以做题的
 *
 * - 圆形,也不是随便画的, 它还有圆心,有半径
 *
 * ----- 思考以上问题,在来设计, 看不懂的就多想想,让自己想5遍以上,如果还是想不明白,再来问老师
 *
 * @author haoc
 */
//teacher
public class Topic7 {
    class Teacher{
        //老师会画圆
        public void writeSquare(){
            //调用黑板是否可以画圆
            Black black =new Black();
            black.square();
            //生成一个圆
            Square square=new Square();
            square.createSquare();
        }
        //老师会画正方形
        public void  writeSq(){

        }
        //老师会画猫
        public void writeCat(){

        }

    }

    //黑板类
    class Black{
        //黑板可以画圆
        public void square(){

        }
        //黑板可以花方
        public void sq(){

        }
        //黑板可以做题
        public void homework(){

        }
    }

    //圆类
    class Square{
        //生成圆
        public void createSquare(){

        }
    }


}
