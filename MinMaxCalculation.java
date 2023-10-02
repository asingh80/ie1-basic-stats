public class MinMaxCalculation {
    public static void main(String[] args) {
        int[] set = {5, 12, 9, 7, 3, 15, 6}; 

        int[] minMax = findMinMax(set);

        System.out.println("Min: " + minMax[0]);
        System.out.println("Max: " + minMax[1]);
    }

    public static int[] findMinMax(int[] set) {

        if (set.length == 0) { // when array is empty:
            System.out.println("The array is empty.");
            return new int[] {0, 0}; 
        }

        int min = set[0]; 
        int max = set[0]; 

        for (int i = 1; i < set.length; i++) {
            if (set[i] < min) {
                min = set[i]; 
            }

            if (set[i] > max) {
                max = set[i]; 
            }
        }

        return new int[] {min, max};
    }
}
