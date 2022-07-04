package com.hwt.io;

import java.io.*;

public class demo1 {
    public static void main(String[] args) {
        //得到一个文件对象
        File f = new File("D:\\tt\\test.txt");
        FileInputStream fis = null;
        //因为file没用读写的能力,所以需要使用FileInputStream
        try {
            fis = new FileInputStream(f);

            //定义一个字节数组（相当于一个缓存，如果你的对象"f"是一个很大的文件，内存不够用，所以只能一点一点地读取）
            byte[] bytes = new byte[1024];
            //实际读取到的字节数
            int n = 0;
            //循环读取
            //如果read()返回-1，则说明读取完毕
            while ((n = fis.read(bytes)) != -1) {
                //将字节转换成string
                //此时实例化s时,要注意指定编码格式,电脑上文档默认的是GBK,而我这边默认的是utf-8，UTF-8
                //所以如果不指定格式的话,最后输出的中文会出现乱码
                String s = new String(bytes, 0, n,"UTF-8");
                System.out.println(s);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            //关闭文件流(关键)
            try {
                if (fis != null) {
                    fis.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
