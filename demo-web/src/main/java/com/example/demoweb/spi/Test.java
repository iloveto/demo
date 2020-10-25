package com.example.demoweb.spi;

import java.util.ServiceLoader;

/**
 * SPI的demo
 * 来自 https://www.cnblogs.com/jy107600/p/11464985.html
 *作用：SPI是框架用来给开发者扩展框架的机制
 *在META-INF下新建文件，名称为UploadCDN接口的全限定类名，里面写实现类的全限定类名
 */
public class Test {

    public static void main(String[] args) {
        //通过ServiceLoader.load拿到所有实现类
        ServiceLoader<UploadCDN> uploadCDN = ServiceLoader.load(UploadCDN.class);
        for (UploadCDN u : uploadCDN) {
            u.upload("filePath");
        }
    }
}
