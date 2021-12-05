package array.addOne;

import java.util.LinkedList;

public class AddOne {
    public static void main(String[] args) {
        int[] digits = {9,8,7,6,5,4,3,2,1,0};
        // long real = 0;
        // int end=digits.length-1;
        // for (int i = 0; i < digits.length; i++) {
        //     real+=digits[i]*Math.pow(10, end-i);
        // }
        // System.out.println(real);
        // long after=real+1;
        // System.out.println(after);
        // LinkedList<Long> beforeResult=new LinkedList<>();
        // while(after!=0){
        //     beforeResult.addFirst(after%10);
        //     after/=10;
        // }
        // int[] result=new int[beforeResult.size()];
        // for (int i = 0; i < result.length; i++) {
        //     result[i]=(int)(long)beforeResult.get(i);
        //     System.out.println(beforeResult.get(i));
        // }
        int pointer=digits.length-1;
        int cFlag=0;
        while(pointer != -1) {
            digits[pointer]+=1;
            if (digits[pointer]==10) {
                cFlag=1;
            } else {
                break;
            }
            pointer--;
        }
        if (pointer==-1&&cFlag==1) {
            int[] result=new int[digits.length+1];
            result[0]=cFlag;
            for (int i = 1; i < result.length; i++) {
                result[i]=digits[i-1];
            }
        }
        for (int i : digits) {
            System.out.println(i);
        }
    }
}
