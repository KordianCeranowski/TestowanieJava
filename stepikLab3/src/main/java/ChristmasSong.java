import java.util.Collections;

class ChristmasSong {

    static String[] numbersOfDays = {"first", "second", "third", "fourth", "fifth", "sixth", "seventh", "eighth", "ninth", "tenth", "eleventh", "twelfth"};
    static String[] presents = {"twelve Drummers Drumming, ", "eleven Pipers Piping, ", "ten Lords-a-Leaping, ", "nine Ladies Dancing, ", "eight Maids-a-Milking, ", "seven Swans-a-Swimming, ", "six Geese-a-Laying, ", "five Gold Rings, ", "four Calling Birds, ", "three French Hens, ", "two Turtle Doves, and ", "a Partridge in a Pear Tree."};

    static String sing(int day){
        if(day <= 0 && day > 12){
            throw new IllegalArgumentException();
        }

        String song = "On the " + numbersOfDays[day - 1] + " day of Christmas my true love gave to me: ";
        int presentsStartAt = 12 - day;

        for(int i = presentsStartAt; i < 12; i++){
            song += presents[i];
        }

        return song;
    }
}
