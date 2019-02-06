

import java.util.Scanner;
public class NumberUtilities {

    public static String getRange(int stop) {
        String list = "";
        for(int i=0;i<stop;++i){
            list = list + Integer.toString(i);
        }
        return list;
    }

    public static String getRange(int start, int stop) {
        String list = "";
        for(int i=start;i<stop;++i){
            list = list + Integer.toString(i);
        }
        return list;
    }


    public static String getRange(int start, int stop, int step) {
        String list = "";
        for(int i=start;i<stop;){
            list = list + Integer.toString(i);
            i+=step;
        }
        return list;
    }

    public static String getEvenNumbers(int start, int stop) {
        String list = "";
        for(int i=start;i<stop;++i){
            if(i%2==0){
                list = list + Integer.toString(i);
            }
        }
        return list;
    }


    public static String getOddNumbers(int start, int stop) {
        String list = "";
        for(int i=start;i<stop;++i){
            if(i%2!=0){
                list = list + Integer.toString(i);
            }
        }
        return list;
    }


    public static String getExponentiations(int start, int stop, int exponent) {
        String list = "";
        for(int i=start;i<=stop;++i){
            //list = list + Integer.toString(i);
            list = list + Integer.toString((int)(Math.pow(i,exponent)));
        }
        return list;
    }
}
