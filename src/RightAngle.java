public class RightAngle {
    public static void main(String[] args) {
        int rows = 5;
        for (int i = 1; i <= rows; i++) {
            // for spaces:
            for(int k = rows-1; k>=i;k--){
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}

/*
 Output:
    1
   22
  333
 4444
55555
 */
