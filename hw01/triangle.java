public class triangle {
    public static void main(String[] args) {
        /** int col = 0;
        int row = 0;
        int SIZE = 5;
        row = row + 1;
        while (row <= SIZE) {
            col = 0;
            while (col < row) {
                System.out.print("*");
                col++;
            }
            System.out.println();
            row++;
        }*/
        drawTriangle(10);
    }

    public static void drawTriangle(int N) {
        int col = 0;
        int row = 0;
        int SIZE = N;
        row = row + 1;
        while (row <= SIZE) {
            col = 0;
            while (col < row) {
                System.out.print("*");
                col++;
            }
            System.out.println();
            row++;
        }
    }
}
