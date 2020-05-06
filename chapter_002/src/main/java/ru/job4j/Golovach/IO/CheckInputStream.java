package ru.job4j.Golovach.IO;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;

public class CheckInputStream {
    public static void main(String[] args) throws IOException {
        InputStream  src = new URL("https://genius.com/Jabo-thoughts-lyrics").openStream();
        OutputStream dst = new FileOutputStream("C:\\Users\\tubzs\\Desktop\\file.txt");
        copy(src,dst);
    }

    private static void copy(InputStream src, OutputStream dst) throws IOException{
        byte[] data =  new byte[64*1024];
        while (true){
            int count = src.read(data);
            if (count!=-1){
                dst.write(data,0,count);
            }else{
                return;
            }
        }
    }
}
