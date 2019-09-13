package com.stackroute;

public class ConsecutiveNumber {
    public String getconsec(String s)
    {
        String[] strArr = s.split(",");
        boolean flag=false;
        int prev;
        int curr;
        int n = strArr.length;
        if(n==0)
            return "No numbers";
        if(n==1)
            return s+" Only one Element";
        int[] intArr = new int[n];
        boolean incrFlag = true;
        for(int i=0;i<n;i++){
            intArr[i] = Integer.parseInt(strArr[i]);
        }
        if((intArr[1]-intArr[0])>0)
            incrFlag = true;
        else
            incrFlag = false;
        prev = intArr[0];
        curr = intArr[0];
        if(incrFlag){
            for(int i=1;i<n;i++){
                int diff = intArr[i]-intArr[i-1];
                if(!(diff==1)){
                    return s+" non consecutive numbers";
                }
            }
            return s+ " are consecutive numbers";
        }else{
            for(int i=1;i<n;i++){
                int diff = intArr[i]-intArr[i-1];
                if(!(diff==-1)){
                    return s+" non consecutive numbers";
                }
            }
            return s+ " are consecutive numbers";
        }

    }

}
