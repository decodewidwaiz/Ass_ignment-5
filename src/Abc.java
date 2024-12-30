import java.util.Scanner;
public class Abc {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.print("Enter the rows: ");
        int rows = sc.nextInt();
        for(int i = 1; i <= rows; i++){
            char ch = 'A';
            for(int k = 1; k <= i; k++){
                System.out.print(ch+" ");
                ch = (char)(ch + 1);
            }
            System.out.println();
        }
        sc.close();
    }
}


/*
 * Output:
            A 
            A B 
            A B C 
            A B C D 
            A B C D E 
 */