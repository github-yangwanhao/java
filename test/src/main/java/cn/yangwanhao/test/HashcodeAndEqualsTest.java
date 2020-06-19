package cn.yangwanhao.test;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * description HashcodeAndEqualsTest类
 *
 * @author 杨万浩
 * @date 2020/6/11 19:58
 */
public class HashcodeAndEqualsTest {

    public static void main(String[] args) {
        /*
         * java要求：
         * 两个对象equals()为true，则两个对象的hashcode()也相等，反之则不一定
         */
        // 测试hashcode相同但是不是同一个对象
        String hashcode1 = "hashcode";
        String hashcode2 = new String("hashcode");
        System.out.println(hashcode1.equals(hashcode2));
        System.out.println(hashcode1.hashCode() == hashcode2.hashCode());
        // 证明第一条：两个对象equals()为true，则两个对象的hashcode()也相等
        String hashcode3 = "hashcode";
        System.out.println(hashcode1.equals(hashcode3));
        System.out.println(hashcode1.hashCode() == hashcode3.hashCode());
        // 测试重写equals()不重写hashcode()的情况
        User user1 = new User(1, "aaa");
        User user2 = new User(1, "bbb");
        User user3 = new User(2, "ccc");
        System.out.println(user1.equals(user2));
        System.out.println(user2.equals(user3));
        System.out.println(user1.equals(user3));
        Map<User, Integer> map = new HashMap<>(4);
        // 重写equals()不重写hashcode()就会造成如下结果
        map.put(user1, user1.getId());
        map.put(user2, user2.getId());
        map.put(user3, user3.getId());
        Set<Map.Entry<User, Integer>> entries = map.entrySet();
        for (Map.Entry<User, Integer> entry : entries) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
            System.out.println("------------------------");
        }
        System.out.println(user1.hashCode() == user2.hashCode());
    }

    @NoArgsConstructor
    @AllArgsConstructor
    @Data
    static class User {

        private Integer id;
        private String name;

        @Override
        public boolean equals(Object obj) {
            User user = (User) obj;
            return this.id.equals(user.id);
        }
    }

}
