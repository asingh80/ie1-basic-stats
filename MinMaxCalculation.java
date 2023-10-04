public class MinMaxCalculation {
    public static void main(String[] args) {
        
        double[] set = {5.7, 12.3, 9, 7.999, 3, 15.02, 15.2, 15.200, 6, 0.87}; 

        double[] minMax = findMinMax(set);

        System.out.println("Min: " + minMax[0]);
        System.out.println("Max: " + minMax[1]);
    }

    public static double[] findMinMax(double[] set) {

        if (set.length == 0) { // when array is empty:
            System.out.println("The array is empty.");
            return new double[] {0, 0}; 
        }

        double min = set[0]; 
        double max = set[0]; 

        for (int i = 1; i < set.length; i++) {
            if (set[i] < min) {
                min = set[i]; 
            }

            if (set[i] > max) {
                max = set[i]; 
            }
        }

        return new double[] {min, max};
    }
}
