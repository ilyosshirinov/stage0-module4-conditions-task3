package school.mjc.stage0.conditions.task3;

public class IsEnglishSymbolDeterminer {
    public void isEnglishSymbol(char symbol) {
        if (((int) symbol >= 65 && (int) symbol <= 91) || ((int) symbol >= 97 && (int) symbol <= 123)) {
            System.out.println("English");
        } else {
            System.out.println("Non English");
        }
    }

    public static void main(String[] args) {
        IsEnglishSymbolDeterminer determiner = new IsEnglishSymbolDeterminer();
        determiner.isEnglishSymbol('Z');
    }
}