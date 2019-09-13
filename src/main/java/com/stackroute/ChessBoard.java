package com.stackroute;

public class ChessBoard {
    public String[][] getchess()
    {
        String[][] str = new String[8][8];
        String white = "WW|";
        String black = "BB|";
        boolean flag = false;
        for(int i=0;i<8;i++){
            if(i%2==0)
                flag = true;
            else
                flag = false;
            for(int j=0;j<8;j++){
                if (flag){
                    if(j%2==0)
                        str[i][j] = white;
                    else
                        str[i][j] = black;
                }else{
                    if(j%2==1)
                        str[i][j] = white;
                    else
                        str[i][j] = black;
                }

            }
        }
        return str;
    }
}
