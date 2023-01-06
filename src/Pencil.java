import org.hamcrest.Condition;

public class Pencil {
    String Paper = "";

    public String writeText(String text) {
        int CharMax = 6;
        int CharAmount = 0;

        for (char c : text.toCharArray()) {
            if (c != ' ') {
                CharAmount++;
            }
            if (CharAmount <= CharMax) {
                Paper = Paper + c;
            }

        }

        return Paper;
    }
}
