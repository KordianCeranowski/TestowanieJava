package lab3;

public class Armstrong {
    public boolean IsArmstrongNumber(String input) {
        int sum = 0;
        for (int i = 0; i < input.length(); i++){
            int digit = Character.getNumericValue(input.charAt(i));
            sum += (int)Math.pow(digit, input.length());
        }

        return sum == Integer.parseInt(input);
    }
}
