package com;
import java.util.Arrays;
public class TicTacToe_combinations {
    static int changeplayer(int i)
    {
        if (i==0)
            return 1;
        return 0;
    }
    static int checkTheWinner(int[][] a)
    {
        // draw case not covered
        if( a[0][0]!=-1 && a[0][0]==a[0][1] && a[0][1]==a[0][2] )
        {
            return a[0][0];
        }

        if( a[1][0]!=-1 && a[1][0]==a[1][1] && a[1][1]==a[1][2] )
        {
            return a[1][0];
        }

        if(a[2][0]!=-1 && a[2][0]==a[2][1] && a[2][1]==a[2][2] )
        {
            return a[2][0];
        }

        if (a[0][0]!=-1 && a[0][0]==a[1][0] && a[1][0]==a[2][0] )
        {
            return a[0][0];
        }
        if (a[0][1]!=-1 && a[0][1]==a[1][1] && a[1][1]==a[2][1]  )
        {
            return a[0][1];
        }
        if (a[0][2]!=-1 && a[0][2]==a[1][2] && a[1][2]==a[2][2]  )
        {
            return a[0][2];
        }

        if (a[0][0]!=-1 && a[0][0]==a[1][1] && a[1][1]==a[2][2] )
        {
            return a[0][0];
        }
        if(a[0][2]!=-1 && a[0][2]==a[1][1] && a[1][1]==a[2][0] )
        {
            return a[0][2];
        }

        return -1;

    }
    static int count=0;
    static void display(int[][] table,int pid)
    {
        System.out.println("WINNER IS PLAYER  "+pid);
        System.out.println("************************");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.print(table[i][j]+"\t");
            }
            System.out.println("\n");
        }
        System.out.println("************************");
    }
    static void solvetictac(int[][] table,int x,int y,int pid)
    {

        int k=checkTheWinner(table);
        if (k!=-1)
        {
            count=count+1;
            display(table,k);
        }
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                if (table[i][j]==-1)
                {
                    table[i][j]=pid;
                    solvetictac(table,i,j+1,changeplayer(pid));
                    table[i][j]=-1;
                }
            }
        }
    }
    public static void main(String[] args)
    {
        int n=3;
        int table[][]=new int[3][3];
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                table[i][j]=-1;
            }
        }
        solvetictac(table,0,0,0);
        solvetictac(table, 0, 0, 1);
        System.out.println(count);

    }
}

