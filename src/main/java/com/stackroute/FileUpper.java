package com.stackroute;

import java.io.*;

public class FileUpper {
    public String show() throws IOException {
        File file = new File("/home/cgi/Training/Java2/PE3_Stackroute_/src/main/java/com/stackroute/Folder/fileDemo1.txt");
        FileReader fr = new FileReader(file);
        String str="";
        int charRead = -1;
        int count=0;

        while ((charRead = fr.read()) != -1) {
            if((char)charRead!='\n'){
                str = str+ (char) charRead;
                count++;
            }
        }
        return str+" "+count;
    }
}
