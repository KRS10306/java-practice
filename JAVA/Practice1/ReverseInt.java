class Solution {
    public int reverse(int x) {
        int y = x;
        int a = 0;
        int z = 0;
        while(y!=0){
            a = y%10;
            z = (z*10) + a;
            y = y/10;
        }//1534236469
        //2**31 = 2147483648
        int b = x;
        if(x > 1000000000 || x < -1000000000){
        if(b%10 > 2 || b%10 < -2){
            return 0;
        } else if(b%10 == 2 || b%10 == -2){
            b = b/10;
            if (b%10 > 1 || b%10 < -1){
                return 0;
            } else  if(b%10 == 1 || b%10 == -1) {
                b = b/10;
                if(b%10 > 4 || b%10 < -4){
                    return 0;
                } else if(b%10 == 4 || b%10 == -4) {
                    b = b/10;
                    if(b%10 > 7 || b%10 < -7){
                        return 0;
                    } else if(b%10 == 7 || b%10 == -7) {
                        b = b/10;
                        if(b%10 > 4 || b%10 < -4){
                            return 0;
                        } else if(b%10 == 4 || b%10 == -4) { //483648
                            b = b/10;
                            if(b%10 > 8 || b%10 < -8){
                                return 0;
                            } else if(b%10 == 8 || b%10 == -8) { //83648
                                b = b/10;
                                if(b%10 > 3 || b%10 < -3){
                                    return 0;
                                } else  if(b%10 == 3 || b%10 == -3){ //3648
                                    b = b/10;
                                    if(b%10 > 6 || b%10 < -6){
                                        return 0;
                                    } else if(b%10 == 6 || b%10 == -6) { //648
                                        b = b/10;
                                        if(b%10 > 4 || b%10 < -4){
                                            return 0;
                                        } else if(b%10 == 4 || b%10 == -4) { //48
                                            b = b/10;
                                            if(b%10 > 7 || b%10 < -7){
                                                return 0;
                                            } else if(b%10 == 7 || b%10 == -7) { //8
                                                return z;
                                            } else {
            return z;
        }
                                        } else {
            return z;
        }
                                    } else {
            return z;
        }
                                } else {
            return z;
        }
                            } else {
            return z;
        }
                        } else {
            return z;
        }
                } else {
            return z;
        }
                } else {
            return z;
        }
            } else {
            return z;
        }
        } else {
            return z;
        }
        } else{
            return z;
        }
    }
}
