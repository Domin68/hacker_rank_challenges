package com.more_challenges;

// program to compare highest hourglass from 2D array
public class Array2D {
    public static void main(String[] args) {
        int[][] arr = {
                //   0,1,2,3,4,5  columns
                {1, 1, 1, 0, 0, 0},
                {0, 1, 0, 0, 0, 0},
                {1, 1, 1, 0, 0, 0},
                {0, 0, 2, 4, 4, 0},
                {0, 0, 0, 2, 0, 0},
                {0, 0, 1, 2, 4, 0}};

        int sum = 0;
        int sum2 = 0;
        int sum3 = 0;
        int x = 0;
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++){
                for(int k = 0; k < 3; k++){
                    sum += arr[i][j+k]; //top elements of hour glass
                    sum2 += arr[i+2][j+k]; //bottom elements of hour glass
                    sum3 = arr[i+1][j+1]; //middle elements of hour glass
                    x = sum + sum2 + sum3; //add all elements of hour glass
                }
                if(max < x){
                    max  = x;
                }
                sum = 0;
                sum2 = 0;
                sum3 = 0;
                x = 0;
            }
        }
        System.out.println(max);

        System.out.println(arr[3][3]);
    }
}

