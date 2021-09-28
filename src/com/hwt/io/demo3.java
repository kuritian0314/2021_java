package com.hwt.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class demo3 {
    public static void main(String[] args) {
        //先把图片读入到内存,再写到某个文件
        //因为是二进制文件,因此只能用字节流完成
        File f = new File("D:\\tt\\签名.jpg");
        //输入流
        FileInputStream fis = null;
        //输出流
        FileOutputStream fos = null;

        try {
            fis = new FileInputStream(f);
            //或者省略上面实例化File,直接在这里fis = new FileInputStream("F:\tt\Westlife.jpg");也可以

            fos = new FileOutputStream("D:\\test\\签名.jpg");
            byte[] bytes = new byte[1024];
            int n = 0;//记录实际读取到的字节数
            //循环读取
            while ((n = fis.read(bytes)) != -1) {
                //输出到指定文件
                fos.write(bytes);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            //关闭打开的文件流
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
