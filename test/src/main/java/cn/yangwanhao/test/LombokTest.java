package cn.yangwanhao.test;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 反编译class文件查看lombok做了什么
 * @author 杨万浩
 * @version V1.0
 * @since 2021/1/11 18:18
 */
public class LombokTest {

    public static void main(String[] args) {
    }

}


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
class LombokBean {
    private String aaa;
    private String bbb;
}