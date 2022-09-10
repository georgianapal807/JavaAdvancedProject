import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Interviu {
    public static void main(String[] args) {

        int[] list = new int[]{1, 5, 4, 2};
        int[] sortedList = new int[6];
        for (int i = 0; i < list.length; i++) {
            sortedList[list[i]] = list[i];
        }
        for (int i = 1; i < sortedList.length; i++) {
            if (sortedList[i] == 0) {
                System.out.println("Elementul care lipseste este: " + i);
            }
        }
//VARIANTA A DOUA

        int[] list2 = new int[]{1, 5, 7, 2, 3, 4};
        int sumOfList = 0;
        for (int i = 0; i < list2.length; i++) {
            sumOfList += list2[i];
        }
        System.out.println("Elementul care lipseste este: " + ((7 * 8 / 2) - sumOfList));

        System.out.println("------------------------------------------------------------");


        System.out.println(areTheWordsAnagrams("Car", "RAC"));
        System.out.println(areTheWordsAnagrams("CACFGGT", "RACFG"));
        System.out.println(isAnagram("Car", "RAC"));
        System.out.println(isAnagram("CACFGGT", "RACFG"));
    }

    //VERIFICARE ANAGRAMA JAVA
    public static boolean areTheWordsAnagrams(String firstWord, String secondWord) {
        if (firstWord.length() != secondWord.length()) {
            return false;
        }
        char[] firstWordToArray = firstWord.toUpperCase().toCharArray();
        char[] secondWordToArray = secondWord.toUpperCase().toCharArray();
        Arrays.sort(firstWordToArray);
        Arrays.sort(secondWordToArray);
        for (int i = 0; i < firstWordToArray.length; i++) {
            if (firstWordToArray[i] != secondWordToArray[i]) {
                return false;
            }
        }
        return true;
    }

    public static boolean isAnagram(String firstWord, String secondWord) {
        if (firstWord.length() != secondWord.length()) {
            return false;
        }
        Map<Character, Integer> frequency = new HashMap<>();
        char[] firstWordToArray = firstWord.toUpperCase().toCharArray();
        for (int i = 0; i < firstWordToArray.length; i++) {
            if (frequency.get(firstWordToArray[i]) == null) {
                frequency.put(firstWordToArray[i], 1);
            } else {
                int increment = frequency.get(firstWordToArray[i]) + 1;
                frequency.put(firstWordToArray[i], increment);
            }
        }
        char[] secondWordToArray = secondWord.toUpperCase().toCharArray();
        Map<Character, Integer> frequency2 = new HashMap<>();
        for (int i = 0; i < secondWordToArray.length; i++) {
            if (frequency2.get(secondWordToArray[i]) == null) {
                frequency2.put(secondWordToArray[i], 1);
            } else {
                int increment2 = frequency2.get(secondWordToArray[i]) + 1;
                frequency2.put(secondWordToArray[i], increment2);
            }
        }
        for (Map.Entry<Character, Integer> entry : frequency.entrySet()) {
            if (!frequency.get(entry.getKey()).equals(frequency2.get(entry.getKey()))) {
                return false;
            }
        }
        return true;
    }
}
