package com.yuanfeng.induction;

/**
 * Created by yuanfengliu on 3/28/17.
 *
 *  Modify HelloNumbers so that it prints out the cumulative sum of the integers from 0 to 9.
 *  For example, your output should start with 0 1 3 6 10... and should end with 45.

 */
public class HelloNumbers {
    public static void main(String[] arg){
        int sum = 0;
        for(int x = 0; x < 10 ; x++){

            sum = sum + x;
            System.out.print(sum + " ");

        }


    }
}
