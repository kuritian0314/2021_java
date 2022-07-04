package com.hwt.io;

import java.io.*;

/**
 * @author curry
 * @package com.hwt.io
 * @date 2022/2/13 14:12
 * @Version V1.0
 */
public class TestBufferedStream {
    public static void main(String[] args) {
        BufferedReader br = null;
        BufferedWriter bw = null;

        FileReader fr = null;
        FileWriter fw = null;

        try {
            fr = new FileReader(new File("D:\\tt\\test.txt"));
            br = new BufferedReader(fr);

            fw = new FileWriter(new File("D:\\test\\test.txt"));
            bw = new BufferedWriter(fw);

            String s = "";
            while ((s = br.readLine()) != null) {
                System.out.println(s);
                bw.write(s + "\r\n");
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
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
