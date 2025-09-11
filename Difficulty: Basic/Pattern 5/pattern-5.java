class Solution {

    void printTriangle(int n) {
        // Loop for rows
        for (int i = n; i > 0; i--) {
            // Loop for columns
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            // Move to next line after each row
            System.out.println();
        }
    }
}
