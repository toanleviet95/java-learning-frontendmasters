package strings;

public class TextProcessor {
    public static void main(String[] args) {
        countWords("I love Java");
        reverseString("Hello World");
        addSpaces("HeyWorld!It'sMe");
        printTextBlock();
    }

    private static void printTextBlock() {
        String message = """
                Text block:
                - Line 1
                - Line 2
                """;
        System.out.println(message);
    }

    private static void addSpaces(String text) {
        var modifiedText = new StringBuilder(text);
        for (int i = 0; i < modifiedText.length(); i++) {
            if (i != 0 && Character.isUpperCase(modifiedText.charAt(i))) {
                modifiedText.insert(i, " ");
                i++;
            }
        }
        System.out.println(modifiedText);
    }

    private static void reverseString(String text) {
        for (int i = text.length() - 1; i >= 0; i--) {
            System.out.println(text.charAt(i));
        }
    }

    private static void countWords(String text) {
        var words = text.split(" ");
        int numberOfWords = words.length;

        String message = String.format("Your text contains %d words", numberOfWords);
        System.out.println(message);

        for (String word : words) {
            System.out.println(word);
        }
    }
}
