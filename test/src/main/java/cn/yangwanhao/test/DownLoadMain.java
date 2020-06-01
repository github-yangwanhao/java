package cn.yangwanhao.test;

import java.io.IOException;

/**
 * description DownLoadMain类
 *
 * @author 杨万浩
 * @date 2020/3/27 15
 */
public class DownLoadMain {

    public static void main(String[] args) throws IOException {
        for (int i = 0; i <= 10; i++) {
            String url="";
            HttpRequest.downLoadFromUrl(url,"","");
        }
        System.out.println("下载完成");
    }

}
