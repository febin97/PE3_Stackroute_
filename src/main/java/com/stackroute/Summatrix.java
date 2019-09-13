package com.stackroute;

import java.lang.reflect.Array;

public class Summatrix {
    int row;
    int col;

    public void set_dimen(int row, int col)
    {
        this.col=col;
        this.row=row;
    }

    public int[][] calc(int first[][], int second[][])
    {
        if(row==0 && col ==0)
            return null;
        int[][] arr = new int[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                arr[i][j] = first[i][j]+second[i][j];
            }
        }
        return arr;
    }


}
