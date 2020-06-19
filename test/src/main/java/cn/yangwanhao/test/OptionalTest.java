package cn.yangwanhao.test;

import java.util.Optional;

/**
 * TODO
 *
 * @author yangwh@yunrong.cn
 * @version V2.1
 * @since 2020/6/19 11:11
 */
public class OptionalTest {

    public static void main(String[] args) {
        Chain1 chain1 = new Chain1();
        /*
         * Will NPE here
         * System.out.println(chain1.getChain2().getChain3().getNum());
         */
        Optional<Integer> result = Optional.ofNullable(chain1)
            .map(Chain1::getChain2)
            .map(Chain2::getChain3)
            .map(Chain3::getNum);
        System.out.println(result.orElse(null));
    }

    private static class Chain1 {
        // private Chain2 chain2 = new Chain2();
        private Chain2 chain2;
        public Chain2 getChain2() {
            return chain2;
        }
    }
    private static class Chain2 {
        // private Chain3 chain3 = new Chain3();
        private Chain3 chain3;
        public Chain3 getChain3() {
            return chain3;
        }
    }
    private static class Chain3 {
        private Integer num = 9;
        public Integer getNum() {
            return num;
        }
    }

}
