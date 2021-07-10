package DataStructure;

import java.util.HashMap;
import java.util.Map;

public class HashMapTest {
    public static void main(String[] args) {
        // 初始化散列表
        Map<String, Integer> dic = new HashMap<>();
// 添加 key -> value 键值对
        dic.put("小力", 10001);
        dic.put("小特", 10002);
        dic.put("小扣", 10003);
// 从姓名查找学号
        dic.get("小力"); // -> 10001
        dic.get("小特"); // -> 10002
        dic.get("小扣"); // -> 10003
        System.out.println(dic.get("小力"));
    }
}
