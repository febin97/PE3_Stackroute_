package com.stackroute;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class SearchFileExtension {
    public String getcontent(String ext) throws IOException {
        File folder = new File("/home/cgi/Training/Java2/PE3_Stackroute_/src/main/java/com/stackroute/Folder");
        File[] listOfFiles = folder.listFiles();
        String file_path = "/home/cgi/Training/Java2/PE3_Stackroute_/src/main/java/com/stackroute/Folder";
        String str="";
        for (int i = 0; i < listOfFiles.length; i++) {
            if (listOfFiles[i].isFile()) {
                String fileName = listOfFiles[i].getName();
                String extension = "."+fileName.split("\\.")[1];

                if(ext.equals(extension)){
                    File file = new File(file_path+"/"+fileName);
                    FileInputStream fin = new FileInputStream(file);
                    byte fileContent[] = new byte[(int)file.length()];
                    fin.read(fileContent);
                    String currStr = new String(fileContent);
                    str += currStr;
                }
            }
        }
        return str;
    }
}
