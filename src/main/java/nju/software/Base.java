package nju.software;

import java.io.*;

/**
 * Created by lab on 16-1-12.
 */
public class Base {

    public static void main(String[] args) {
        File file = new File("output.txt");
        try {
            int i = 0;
            Writer writer = new FileWriter(file);
            FileOutputStream outputStream = new FileOutputStream(file);
            while (i++<10000000) {
                writer.write("helloworld!\n");
                writer.flush();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
