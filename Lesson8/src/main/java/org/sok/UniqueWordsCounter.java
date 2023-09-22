import java.util.ArrayList;

public class UniqueWordsCounter {
    public static void main(String[] args) {
        String[] wordsArray = {"apple", "banana", "apple", "orange", "banana", "grape"};

        ArrayList<String> wordsList = new ArrayList<>();
        for (int i = 0; i < wordsArray.length; i++) {
            String word = wordsArray[i];
            wordsList.add(word);
        }

        ArrayList<String> uniqueWords = new ArrayList<>();
        ArrayList<Integer> wordCount = new ArrayList<>();

        for (int i = 0; i < wordsList.size(); i++) {
            String word = wordsList.get(i);
            boolean isUnique = true;

            for (int j = 0; j < uniqueWords.size(); j++) {
                String uniqueWord = uniqueWords.get(j);
                if (uniqueWord.equals(word)) {
                    int count = wordCount.get(j);
                    wordCount.set(j, count + 1);
                    isUnique = false;
                    break;
                }
            }

            if (isUnique) {
                uniqueWords.add(word);
                wordCount.add(1);
            }
        }

        System.out.print("Уникальные слова: ");
        for (int i = 0; i < uniqueWords.size(); i++) {
            System.out.print(uniqueWords.get(i) + " ");
        }
        System.out.println();

        System.out.print("Количество повторений слов: ");
        for (int i = 0; i < wordCount.size(); i++) {
            System.out.print(wordCount.get(i) + " ");
        }
        System.out.println();
    }
}