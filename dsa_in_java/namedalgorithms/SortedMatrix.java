public class SortedMatrix {

    public static void main(String[] args) {

        int[][] sortedMatrix = new int[][]{{10, 20, 30, 40},
                                           {15, 25, 35, 45},
                                           {27, 29, 37, 48},
                                           {32, 33, 39, 51}};

        int i = 0;
        int j = sortedMatrix[0].length - 1;
        int valueToSearch = 29;
        boolean found = false;

        while (j >= 0 && i < sortedMatrix.length) {
            if (sortedMatrix[i][j] == valueToSearch) {
                found = true;
                break; // No need to continue searching if found
            } else if (sortedMatrix[i][j] < valueToSearch) {
                i++;
            } else {
                j--;
            }
        }

        System.out.println(found ? "Found" : "Not Found");
    }
}
