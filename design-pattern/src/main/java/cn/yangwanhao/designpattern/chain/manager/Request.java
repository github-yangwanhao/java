package cn.yangwanhao.designpattern.chain.manager;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 进件实体类
 *
 * @author 杨万浩
 * @version V1.0
 * @since 2020/11/21 15:22
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Request {

    private String requestType;

    private int num;

}
