package school.mjc.stage0.conditions.task3;

public class AlphabeticCharacters {
    public void vowelDeterminer(char character) {
        if (((int) character >= 65 && (int) character <= 91) || ((int) character >= 97 && (int) character <= 123)) {
            if (character == 'A' || character == 'E' || character == 'I' || character == 'O' || character == 'U' || character == 'Y' ||
                character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u' || character == 'y') {
                System.out.println("Vowel");
            } else {
                System.out.println("Consonant");
            }
        } else {
            System.out.println("wrong alphabet!");
        }
    }

    public static void main(String[] args) {
        AlphabeticCharacters alphabeticCharacters = new AlphabeticCharacters();
        alphabeticCharacters.vowelDeterminer('2');
    }
}