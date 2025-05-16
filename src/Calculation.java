public class Calculation {

    public int percentage(int pass, int numberOfRounds) {
        return (int) ((pass * 100.0) / numberOfRounds);
    }

    public int rate(int percentage) {
        if (percentage < 40) return 1;
        else if (percentage < 55) return 2;
        else if (percentage < 75) return 3;
        else if (percentage < 90) return 4;
        else return 5;
    }
}
