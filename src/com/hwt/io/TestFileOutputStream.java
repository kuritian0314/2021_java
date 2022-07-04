package com.hwt.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author curry
 * @package com.hwt.io
 * @date 2022/2/13 14:00
 * @Version V1.0
 */
public class TestFileOutputStream {
    public static void main(String[] args) {
        File f = new File("D:\\tt\\test.txt");
        FileOutputStream fos = null;

        try {
            fos = new FileOutputStream(f);
            String s = "Westlife - Better man\r\n西城男孩 - 更完美的男人！！！！！！！";
            try {
                fos.write(s.getBytes());
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
