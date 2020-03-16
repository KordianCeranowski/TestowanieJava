package lab5;

import java.util.ArrayList;
import java.util.List;

class StringOperations {

    String reverse(String a)
    {
        List<String> tempArray = new ArrayList<>(a.length());
        for (int i = 0; i < a.length(); i++)
        {
            tempArray.add(a.substring(i, i + 1));
        }
        StringBuilder reversedString = new StringBuilder(a.length());
        for (int i = tempArray.size() - 1; i >= 0; i--)
        {
            reversedString.append(tempArray.get(i));
        }
        return reversedString.toString();
    }

    String concat(String a, String b)
    {
        String retVal = null;
        StringBuilder sb = new StringBuilder();
        if (a != null && a.length() > 0)
        {
            sb.append(a);
        }
        if (b != null && b.length() > 0)
        {
            sb.append(b);
        }
       return sb.toString();
    }

    boolean isPalindrome(String a)
    {
        if(a.length() <= 1)
        {
            return true;
        }
        // a.charAt(1)  ->  a.charAt(0)
        if(!(a.charAt(0) + "").equals(a.charAt(a.length() - 1) + ""))
        {
            return false;
        }
        // a.length() - 2  ->  a.length() - 1
        return isPalindrome(a.substring(1, a.length() - 1));
    }
}