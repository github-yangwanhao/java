package cn.yangwanhao.chothes.decorate;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * description
 *
 * @author 杨万浩
 * @version 1.0.0
 * @date 2019/12/18 15:17
 */

@NoArgsConstructor
@AllArgsConstructor
public class Person {

    @Getter
    @Setter
    private String name;

    public void show() {
        System.out.printf("装扮的%s", name);
    }
}
