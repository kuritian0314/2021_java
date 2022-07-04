package com.hwt.io;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class demo2 {
    public static void main(String[] args) {
        File f = new File("D:\\tt\\test.txt");
        //字节输出流
        FileOutputStream fos = null;

        try {
            fos = new FileOutputStream(f);

            String s = "Westlife - Better man\r\n西城男孩 - 更完美的人！！！！！！！";

            fos.write(s.getBytes());
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (fos != null) {
                    fos.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
