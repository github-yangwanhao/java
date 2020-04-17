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
        for (int i = 1; i <= 50; i++) {
            String url="https://g01.ag8ceo.com/hls/videos/19000/19249/19249.mp4/cdn-"+i+"-v1-a1.ts";
            HttpRequest.downLoadFromUrl(url,"cdn-"+i+"-v1-a1.ts","E:\\ffmpeg-20200324-e5d25d1-win64-static\\bin");
        }
        System.out.println("下载完成");
    }

}
