public class RomanNumeral {

    String roman;
    int arabic;

    public RomanNumeral(int i) {
        roman = "";
        arabic = i;
        translate();
    }

    private void translate(){

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
