package com.hwt.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @author curry
 * @package com.hwt.io
 * @date 2022/2/13 13:39
 * @Version V1.0
 */
public class TestFileInputStream {
    public static void main(String[] args) {
        File file = new File("D:\\tt\\test.txt");
        FileInputStream fis = null;

        try {
            fis = new FileInputStream(file);
            byte[] bytes = new byte[1024];
            int n = 0;
            while ((n = fis.read(bytes)) != -1) {
                String s = new String(bytes, 0, n, "UTF-8");
                System.out.println(s);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
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
