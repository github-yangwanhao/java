package cn.yangwanhao.test;

import java.util.HashMap;
import java.util.Map;

/**
 * description
 *
 * @author 杨万浩
 * @version 1.0.0
 * @date 2019/11/22 13:48
 */

public class MapTest {
    public static void main(String[] args) {
        Map<Long, Long> map = new HashMap<>(5);
        map.put(100024L, 1L);
        map.put(100025L, 2L);
        map.put(100026L, 3L);
        map.put(100027L, 4L);
        map.put(100028L, 5L);
        for (Map.Entry<Long, Long> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
        Map<String, String> map1 = new HashMap<>();
        System.out.println(map1 == null);
        System.out.println(map1.isEmpty());
    }
}
