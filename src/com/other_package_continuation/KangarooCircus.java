package com.other_package_continuation;

public class KangarooCircus {
    public static void main(String[] args) {
        int x1 = 0, v1 = 2, x2 = 5, v2 = 3;
        kangaroo(x1,v1,x2,v2);
    }
    // counting distance and number of "jumps" to know if the kangaroos will meet at the same point
    static String kangaroo(int x1, int v1, int x2, int v2) {
        int kang1 = x1;
        int kang2 = x2;
        String yesOrNo ="NO";
        for (int i = 1; i < 10000 ; i++) {
            kang1+=v1;
            kang2+=v2;
            if (kang1==kang2){
                yesOrNo = "YES";
            }
        }
        System.out.println(yesOrNo);
        return yesOrNo;
    }

}
//0 2 5 3
//0 3 4 2