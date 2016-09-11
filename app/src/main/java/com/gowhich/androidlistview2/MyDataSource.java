package com.gowhich.androidlistview2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by durban126 on 16/9/11.
 */
public class MyDataSource {

    public MyDataSource(){

    }

    public static List<Map<String, String>> getDataSource(){
        List<Map<String, String>> list = new ArrayList<Map<String, String>>();

        Map<String, String> map1 = new HashMap<String, String>();
        map1.put("pname","西瓜");
        map1.put("pprice","11.20");
        map1.put("paddr","上海");
        list.add(map1);

        Map<String, String> map2 = new HashMap<String, String>();
        map2.put("pname","西瓜");
        map2.put("pprice","11.20");
        map2.put("paddr","上海");
        list.add(map2);

        Map<String, String> map3 = new HashMap<String, String>();
        map3.put("pname","西瓜");
        map3.put("pprice","11.20");
        map3.put("paddr","上海");
        list.add(map3);

        Map<String, String> map4 = new HashMap<String, String>();
        map4.put("pname","西瓜");
        map4.put("pprice","11.20");
        map4.put("paddr","上海");
        list.add(map4);

        Map<String, String> map5 = new HashMap<String, String>();
        map5.put("pname","西瓜");
        map5.put("pprice","11.20");
        map5.put("paddr","上海");
        list.add(map5);

        return list;
    }
}
