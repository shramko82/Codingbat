package Main;

public class ScoresClump {
    // Given an array of scores sorted in increasing order, return true if the
    // array contains 3 adjacent scores that differ from each other by at most
    // 2, such as with {3, 4, 5} or {3, 5, 5}.
    //
    // scoresClump({3, 4, 5}) > true
    // scoresClump({3, 4, 6}) > false
    // scoresClump({1, 3, 5, 5}) > true
    public boolean scoresClump(int[] scores) {
        //int count = 0;
        for (int i = 2; i < scores.length; i++)

            if (scores[i] - scores[i - 2] <= 2)

                return true;

        return false;
    }
}
