import java.util.ArrayList;

public class RomanNumeral {

    class RomanSign{
        int value;
        String sign;

        public RomanSign(int value, String sign) {
            this.value = value;
            this.sign = sign;
        }
    }

    String roman;
    int arabic;
    ArrayList<RomanSign> signs;


    public RomanNumeral(int i) {
        roman = "";
        arabic = i;

        signs = new ArrayList<RomanSign>();
        signs.add(new RomanSign(1, "I"));
        signs.add(new RomanSign(4, "IV"));
        signs.add(new RomanSign(9, "IX"));
        signs.add(new RomanSign(10, "X"));
        signs.add(new RomanSign(40, "XL"));
        signs.add(new RomanSign(50, "L"));
        signs.add(new RomanSign(90, "XC"));
        signs.add(new RomanSign(100, "C"));
        signs.add(new RomanSign(400, "CD"));
        signs.add(new RomanSign(500, "D"));
        signs.add(new RomanSign(900, "CM"));
        signs.add(new RomanSign(1000, "M"));

        translate();
    }

    private void translate(){
        while(arabic >= 1000){
            arabic -= 1000;
            roman += "M";
        }
        while(arabic >= 900){
            arabic -= 900;
            roman += "CM";
        }
        while(arabic >= 500){
            arabic -= 500;
            roman += "D";
        }
        while(arabic >= 400){
            arabic -= 400;
            roman += "CD";
        }
        while(arabic >= 100){
            arabic -= 100;
            roman += "C";
        }
        while(arabic >= 90 ){
            arabic -= 90;
            roman += "XC";
        }
        while(arabic >= 50){
            arabic -=50;
            roman += "L";
        }
        while(arabic >= 40){
            arabic -= 40;
            roman += "XL";
        }
        while(arabic >= 10){
            arabic -= 10;
            roman += "X";
        }
        while (arabic >= 9){
            arabic -= 9;
            roman += "IX";
        }
        while(arabic >= 5){
            arabic -= 5;
            roman += "V";
        }
        while(arabic == 4){
            arabic -= 4;
            roman += "IV";
        }
        while(arabic >= 1){
            arabic--;
            roman += "I";
        }
    }

    public String getRomanNumeral(){return roman;}
}
