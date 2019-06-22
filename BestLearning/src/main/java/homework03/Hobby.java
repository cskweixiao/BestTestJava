package homework03;

import java.util.List;
import java.util.Map;

public class Hobby {

    public List<String> listExecute(String something,List<String> list){
        list.add(something);
        return list;
    }

    public Map<String,List<String>> mapExecute(String hobby,List<String> list,Map<String, List<String>> hobbyone){
        hobbyone.put(hobby,list);
        return hobbyone;
    }
}
