package com.stackroute;

import java.util.ArrayList;
import java.util.List;

public class Vowel {
    public List<String> getvowel(List<String> s)
    {
        if(s == null){
            return null;
        }
        String[] strArr = new String[s.size()];
        StringBuilder sb;
        for (int i=0;i<s.size();i++){
            String strCurr = s.get(i);
            sb = new StringBuilder(strCurr);
            int j=0;
            while (j<sb.length()){
                char ch = sb.charAt(j);
                if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                    sb.deleteCharAt(j);
                    continue;
                }
                j++;
            }
            strArr[i] = sb.toString();
        }
        List<String> list = new ArrayList<>();
        for(int i=0;i<s.size();i++){
            list.add("Place Name without Vowels:"+i+" "+strArr[i]);
        }
        return list;
    }
}
