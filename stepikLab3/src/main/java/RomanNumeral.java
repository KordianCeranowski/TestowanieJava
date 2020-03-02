public class RomanNumeral {

    String roman;
    int arabic;

    public RomanNumeral(int i) {
        roman = "";
        arabic = i;
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
