package lab3;

import java.util.ArrayList;

class RomanNumeral {

    static class RomanSign{
        int value;
        String sign;

        RomanSign(int value, String sign) {
            this.value = value;
            this.sign = sign;
        }
    }

    private String roman;
    private int arabic;
    private ArrayList<RomanSign> signs;

    RomanNumeral(int i) {
        roman = "";
        arabic = i;

        signs = new ArrayList<RomanSign>();
        signs.add(new RomanSign(1000, "M"));
        signs.add(new RomanSign(900, "CM"));
        signs.add(new RomanSign(500, "D"));
        signs.add(new RomanSign(400, "CD"));
        signs.add(new RomanSign(100, "C"));
        signs.add(new RomanSign(90, "XC"));
        signs.add(new RomanSign(50, "L"));
        signs.add(new RomanSign(40, "XL"));
        signs.add(new RomanSign(10, "X"));
        signs.add(new RomanSign(9, "IX"));
        signs.add(new RomanSign(5, "V"));
        signs.add(new RomanSign(4, "IV"));
        signs.add(new RomanSign(1, "I"));

        translate();
    }

    private void translate(){

        for (RomanSign romanSign : signs) {
            while(arabic >= romanSign.value){
                arabic -= romanSign.value;
                roman += romanSign.sign;
            }
        }
    }

    String getRomanNumeral(){return roman;}
}
