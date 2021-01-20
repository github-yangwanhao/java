package cn.yangwanhao.test;

/**
 * @author 杨万浩
 * @version V1.0
 * @since 2021/1/20 21:52
 */
public class StreamBuilderTest {

    public static void main(String[] args) {
        StreamBuilderTest instance = new StreamBuilderTest();
        System.out.println(instance.testBuilder());
    }

    private StreamBuilderTest testBuilder() {
        return StreamBuilderTest.builder()
            .aaa("aaa")
            .bbb("bbb")
            .build();
    }

    private String aaa;

    private String bbb;

    public StreamBuilderTest() {}

    public StreamBuilderTest(String aaa, String bbb) {
        this.aaa = aaa;
        this.bbb = bbb;
    }

    public String getAaa() { return aaa; }
    public void setAaa(String aaa) { this.aaa = aaa; }
    public String getBbb() { return bbb; }
    public void setBbb(String bbb) { this.bbb = bbb; }

    @Override
    public String toString() {
        return this.aaa + this.bbb;
    }

    public static StreamBuilderTest.Builder builder() {
        return new StreamBuilderTest.Builder();
    }

    public static class Builder {

        private String aaa;
        private String bbb;

        Builder () {}

        public StreamBuilderTest.Builder aaa(String aaa) {
            this.aaa = aaa;
            return this;
        }

        public StreamBuilderTest.Builder bbb(String bbb) {
            this.bbb = bbb;
            return this;
        }

        StreamBuilderTest build() {
            return new StreamBuilderTest(this.aaa, this.bbb);
        }
    }
}
