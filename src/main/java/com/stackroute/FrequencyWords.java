package com.stackroute;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class FrequencyWords {
    public List<String> frequencycalculate() throws IOException {
        File file = new File("/home/cgi/Training/Java2/PE3_Stackroute_/src/main/java/com/stackroute/Folder/filedemo2.txt");
        FileReader fr = new FileReader(file);
        int charRead=-1;
        String str= "";
        int count=0;
        while ((charRead = fr.read()) != -1) {
            if((char)charRead!='\n'){
                str = str+ (char) charRead;
                count++;
            }
        }
        Map<String,Integer> map = new HashMap<>();
        String[] strArr = str.split(" ");
        for(String s:strArr){
            Integer n = map.get(s);
            n = (n==null) ? 1: ++n;
            map.put(s,n);
        }
        List<String> ls = new ArrayList<>();
        for (Map.Entry entry : map.entrySet()) {
            str = entry.getKey() + "-" + entry.getValue();
            ls.add(str);
        }
        Collections.sort(ls);
        return ls;
    }

}
