package src.com.lcb.proxy_pattern;

/**
 * 用于模拟加载一张分辨率极高的图片，需要很长的时间的场景。
 */
public class BigImage implements Image {

    public BigImage() {

        try {
            //模拟图片加载的耗时操作
            Thread.sleep(10000);
            System.out.println("图片加载完成！");

        } catch (Exception e) {

            e.printStackTrace();
        }

    }

    @Override
    public void showImage() {

        System.out.println("在显示器上绘制大图片！");

    }

}
