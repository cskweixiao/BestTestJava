package homework03;


import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**计算从键盘输入的字符串中各个字母出现的次数，
 * 如输入字符串"abcdabcd"输出：a(4)b(4)c(4)d(4)
 **/

public class Topic2 {

    @Test
    public void test() {

        String input = "abcdaaaaaaaaa";
        Map<String, Integer> map = new HashMap<>();
        for(int i=0;i<input.length();i++) {
            System.out.println(input.charAt(i));
            if (i == 0) {
                map.put(String.valueOf(input.charAt(i)), 1);
//                System.out.println(map);
            } else {
                for (String key : map.keySet()) {
                    if (key.equals(String.valueOf(input.charAt(i)))) {
                        int num = map.get(key) + 1;
                        map.put(key, num);
//                        System.out.println(map);
                        break;
                    } else {
                        map.put(String.valueOf(input.charAt(i)), 1);
                        break;
//                        System.out.println(map);
                    }
                }
            }
        }
//                System.out.println("key= " + key + " and value= " + map.get(key));

            System.out.println(map);
        }



    }



