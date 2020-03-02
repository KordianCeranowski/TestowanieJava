public class RomanNumeral {

    String roman;
    int arabic;

    public RomanNumeral(int i) {
        roman = "";
        arabic = i;
        translate();
    }

    private void translate(){
        while(arabic > 0 && arabic < 4){
            arabic--;
            roman = roman + "I";
        }
    }

    public String getRomanNumeral(){return roman;}
}
