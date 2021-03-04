package cn.yangwanhao.test;

import java.io.Serializable;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.annotation.JSONField;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.support.spring.PropertyPreFilters;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * JsonIgnoreTest
 *
 * @author 杨万浩
 * @version V1.0
 * @since 2020/12/25 17:09
 */
public class JsonIgnoreTest {

    public static void main(String[] args) {
        Bean bean = new Bean();
        bean.setAaa("aaa");
        bean.setBbb(1);
        bean.setCcc(new byte[] {'1', '2', '3', '4', '5', '6'});
        bean.setDdd('a');
        System.out.println(JSONObject.toJSONString(bean));
        String beanIgnore = JsonIgnoreUtil.toJsonStringIgnoreField(bean, "bbb");
        System.out.println(beanIgnore);
    }

}

@Data
@NoArgsConstructor
@AllArgsConstructor
class Bean implements Serializable {

    private String aaa;

    private Integer bbb;

    @JSONField(serialize = false)
    private byte[] ccc;

    private transient char ddd;
}

class JsonIgnoreUtil {

    public static String toJsonStringIgnoreField(Object object, String... fields) {
        PropertyPreFilters filters = new PropertyPreFilters();
        PropertyPreFilters.MySimplePropertyPreFilter excludefilter = filters.addFilter();
        excludefilter.addExcludes(fields);
        return JSONObject.toJSONString(object, excludefilter, SerializerFeature.WriteNullStringAsEmpty);
    }
}