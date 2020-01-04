public class MeansAndStrings {

    public static Object[] meansAndStrings(char[] lst) {
        StringBuilder letters = new StringBuilder();
        Double counter = 0.0;
        Double numbers = 0.0;
        Double mean = 0.0;
        Double sum = 0.0;

        for (int i = 0; i < lst.length; i++) {
            if (Character.isLetter(lst[i])) {
                letters.append(lst[i]);
            } else {
                counter++;
                numbers = Double.valueOf((Character.getNumericValue(lst[i])));
                sum = sum + numbers;
            }
            mean = (sum / counter);
        }
        return new Object[]{mean, letters.toString()};
    }
}
