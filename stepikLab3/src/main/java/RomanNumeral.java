public class RomanNumeral {

    String roman;
    int arabic;

    public RomanNumeral(int i) {
        roman = "";
        arabic = i;
        translate();
    }

    private void translate(){

        if(arabic >= 500){
            arabic -= 500;
            roman += "D";
        }
        if(arabic >= 400 && arabic < 500){
            arabic -= 400;
            roman += "CD";
        }
        if(arabic >= 100 && arabic < 400){
            arabic -= 100;
            roman += "C";
        }
        if(arabic >= 90 && arabic < 100){
            arabic -= 90;
            roman += "XC";
        }
        if(arabic >= 50 && arabic < 90){
            arabic -=50;
            roman += "L";
        }
        if(arabic >= 40 && arabic < 50){
            arabic -= 40;
            roman += "XL";
        }
        while(arabic > 9 && arabic < 40){
            arabic -= 10;
            roman += "X";
        }
        if (arabic == 9){
            arabic -= 9;
            roman += "IX";
        }
        if(arabic > 4 && arabic < 9){
            arabic -= 5;
            roman += "V";
        }
        if(arabic == 4){
            arabic -= 4;
            roman += "IV";
        }
        else
        while(arabic > 0 && arabic < 4){
            arabic--;
            roman += "I";
        }
    }

    public String getRomanNumeral(){return roman;}
}
