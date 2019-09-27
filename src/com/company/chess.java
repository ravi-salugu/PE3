package com.company;

public class chess {
    public static void main(String[] args) {
        String white="WW";
        String black="BB";
        String[][] board = new String[8][8];
        for(int i=1;i<=8;i++)
        {
            for(int j=1;j<=8;j++)
            {
                if((i+j)%2==0) board[i-1][j-1]=white;
                else board[i-1][j-1]=black;
            }
        }
        for(int i=0;i<8;i++)
        {
            for(int j=0;j<8;j++)
            {
                System.out.print(board[i][j]);
            }
            System.out.println();
        }

    }
}
