package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        disarium();
    }



    public static void disarium() {
        List<Integer> list = new ArrayList<>();

        int count = 1;

        while (list.size() < 19) {

            int num = count;
            int sum = 0;
            while (num > 0) {
                int digit = num % 10;
                int exp = String.valueOf(num).length();
                sum += (int) Math.pow(digit, exp);
                num /= 10;
            }

            if (!list.contains(sum) && sum == count) {
                System.out.println(count + ", " + sum);
                list.add(sum);
            }

            count++;
        }

        System.out.println(list);
    }
}


//for (int i = 1; i <= 21; i++) {
//        String str = String.valueOf(i);
//        String zero = "0";
//
//        System.out.println(
//        i + ", " +
//        Integer.parseInt(
//        Arrays.stream(str.split(""))
//        .reduce("0",(acc, next) ->
//        acc + (int) Math.pow(Integer.parseInt(next),2))
//        )
//        );
//        }