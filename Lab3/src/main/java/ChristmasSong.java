import java.util.Collections;

class ChristmasSong {

    private String[] numbersOfDays = {"first", "second", "third", "fourth", "fifth", "sixth", "seventh", "eighth", "ninth", "tenth", "eleventh", "twelfth"};
    private String[] presents = {"twelve Drummers Drumming, ", "eleven Pipers Piping, ", "ten Lords-a-Leaping, ", "nine Ladies Dancing, ", "eight Maids-a-Milking, ", "seven Swans-a-Swimming, ", "six Geese-a-Laying, ", "five Gold Rings, ", "four Calling Birds, ", "three French Hens, ", "two Turtle Doves, and ", "a Partridge in a Pear Tree."};

    String sing(int day){
        if( day <= 0 || day > 12 ){
            throw new IllegalArgumentException();
        }
        StringBuilder song = new StringBuilder("On the " + numbersOfDays[day - 1] + " day of Christmas my true love gave to me: ");
        int presentsStartAt = 12 - day;
        for(int i = presentsStartAt; i < 12; i++){
            song.append(presents[i]);
        }
        return song.toString();
    }

    String singSection(int start, int stop){
        if( start <= 0 || start > 12 ||  stop <= 0 || stop > 12 ){
            throw new IllegalArgumentException();
        }

        StringBuilder song = new StringBuilder();
        for(int i = start; i <= stop ; i++){
            song.append(sing(i));
        }
        return song.toString();
    }

    String singAll(){
        return singSection(1,12);
    }
}
