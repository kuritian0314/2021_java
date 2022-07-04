package com.hwt.java_learn;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @author curry
 * @package com.hwt.java_learn
 * @date 2022/5/26 9:58
 * @Version V1.0
 */
public class TestStream {
    public static void main(String[] args) {
        File file = new File("D:\\tt\\test.txt");
        FileInputStream fis = null;

        try {
            fis = new FileInputStream(file);
            byte[] b = new byte[1024];
            int n = 0;
            while ((n = fis.read(b)) != -1) {
                String s = new String(b, 0, n, "UTF-8");
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
