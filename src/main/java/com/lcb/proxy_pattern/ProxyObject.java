package com.lcb.proxy_pattern;

/**
 * 对目标对象创建过程的封装
 */
public class ProxyObject implements Image {

    private Image image;

    public ProxyObject(Image image) {

        this.image = image;
    }

    @Override
    public void showImage() {

        if (image == null) {

            image = new BigImage();

        }

        image.showImage();
    }

}
