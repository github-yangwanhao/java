package cn.yangwanhao.test;

import com.ql.util.express.DefaultContext;
import com.ql.util.express.ExpressRunner;

/**
 * @author 杨万浩
 * @version V1.0
 * @since 2021/1/12 9:36
 */
public class ExpressRunnerTest {

    public static void main(String[] args) {
        String express = "a+b*c";
        DefaultContext<String, Object> context = new DefaultContext<>();
        context.put("a", 1);
        context.put("b", 2);
        context.put("c", 3);
        ExpressRunner runner = new ExpressRunner();
        Object result = null;
        try {
            result = runner.execute(express, context, null, true, false);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(result);
    }

}
