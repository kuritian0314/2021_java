package com.hwt.io;

import java.io.*;

public class demo4 {
    public static void main(String[] args) {
        BufferedReader br = null;
        BufferedWriter bw = null;

        //先创建FileReader对象
        FileReader fr = null;

        //创建FileWriter对象
        FileWriter fw = null;
        try {
            fr = new FileReader("D:\\tt\\test.txt");
            br = new BufferedReader(fr);


            fw = new FileWriter("D:\\test\\test3.txt");
            bw = new BufferedWriter(fw);

            //循环读取文件
            String s = "";
            while ((s = br.readLine()) != null) {
                //读取到内存
                //System.out.println(s);

                //输出到磁盘
                bw.write(s + "\r\n");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            //注:如果文件流不关闭的话会影响后续对该文件的操作,比如可能读不到该文件的数据
            if (br != null) {
                try {
                    {
                        br.close();
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if (bw != null) {
                try {
                    {
                        bw.close();
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
